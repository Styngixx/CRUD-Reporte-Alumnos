package wavecode.graphics;

/**
 *
 * @author FRANCIS
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;
import javax.swing.event.*;
import org.jfree.chart.*;
import org.jfree.chart.labels.*;
import org.jfree.data.general.DefaultPieDataset;

public class GStudentSemester extends javax.swing.JPanel {

     private final String url ="jdbc:mysql://localhost:3306/wavecode?useSSL=false", user ="root", pword="Chap04";
    
    public GStudentSemester() {
        initComponents();
        boogie.setLayout(new BorderLayout());
        cargarCiclosParaLista(); 
        mostrarGraficoGeneral(); 
        agregarEventoLista();
    }

  
  private void cargarCiclosParaLista(){
        DefaultListModel<String> model = new DefaultListModel<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url,user,pword);
            
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT ciclo FROM curso ORDER BY ciclo ASC");
            
            while (rs.next()) {
                model.addElement("Ciclo " + rs.getString("ciclo"));
            }
            
            List.setModel(model);
            cnn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar ciclos" + e.getMessage());
        }
    }
    
      
    private void agregarEventoLista(){
        List.addListSelectionListener(new ListSelectionListener(){
        
        @Override
            public void valueChanged(ListSelectionEvent e){
                if (!e.getValueIsAdjusting()){
                    List<String> selectioned = List.getSelectedValuesList(); 
                    if(!selectioned.isEmpty()){
                        mostrarGraficoPorCiclo(selectioned); 
                    } else {
                        mostrarGraficoGeneral(); 
                    }
                }
            }
        
        });
    }

    
    private void mostrarGraficoGeneral(){ 
        DefaultPieDataset dset = new DefaultPieDataset(); // <-- CAMBIO 1: PieDataset
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url, user, pword);
            
            // CONSULTA: Cuenta Alumnos Matriculados (estado=1) por Ciclo
            String sql = "SELECT c.ciclo, COUNT(a.cod_Alumno) AS total_alumnos " +
                         "FROM alumno a " +
                         "JOIN matricula m ON a.cod_Alumno = m.codigo_Estudiante " +
                         "JOIN curso c ON m.codigo_Curso = c.codigo_Curso " +
                         "WHERE a.estado = 1 " + 
                         "GROUP BY c.ciclo " +
                         "ORDER BY c.ciclo ASC"; 
            
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            // Llenado del Dataset
            while(rs.next()){
                String ciclo = "Ciclo " + rs.getInt("ciclo");
                // <-- CAMBIO 2: Usar setValue(Key, Value) para PieChart
                dset.setValue(ciclo, rs.getInt("total_alumnos")); 
            }
            cnn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarGrafico(dset, "Distribución Total de Alumnos por Ciclo");
    }
    
      
    private void mostrarGraficoPorCiclo(List<String> ciclosSeleccionados){ 
        DefaultPieDataset dset = new DefaultPieDataset(); // <-- CAMBIO 1: PieDataset
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url, user, pword);
            
            List<String> numerosCiclo = ciclosSeleccionados.stream()
                .map(s -> s.replace("Ciclo ", "")) 
                .collect(Collectors.toList());
            
            String placeholders = String.join(",", numerosCiclo.stream().map(p -> "?").toArray(String[]::new));
            
            String sql ="SELECT c.ciclo, COUNT(a.cod_Alumno) AS total_alumnos " +
                         "FROM alumno a " +
                         "JOIN matricula m ON a.cod_Alumno = m.codigo_Estudiante " +
                         "JOIN curso c ON m.codigo_Curso = c.codigo_Curso " +
                         "WHERE a.estado = 1 AND c.ciclo IN (" + placeholders + ") " + 
                         "GROUP BY c.ciclo " +
                         "ORDER BY c.ciclo ASC";
            
            PreparedStatement ps = cnn.prepareStatement(sql);
            
            for(int i = 0; i < numerosCiclo.size(); i++){
                ps.setInt(i + 1, Integer.parseInt(numerosCiclo.get(i))); 
            }
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ciclo = "Ciclo " + rs.getInt("ciclo");
                // <-- CAMBIO 2: Usar setValue(Key, Value) para PieChart
                dset.setValue(ciclo, rs.getInt("total_alumnos"));
            }
            
            cnn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarGrafico(dset, "Distribución de Alumnos en Ciclos Seleccionados");
    }
        
   private void actualizarGrafico(DefaultPieDataset dset, String tittle){
        
        // <-- CAMBIO 4: Crea un Pie Chart
        JFreeChart c = ChartFactory.createPieChart(
                tittle,         // Título del gráfico
                dset,           // Datos
                true,           // Incluir leyenda
                true,           // Incluir tooltips
                false           // No incluir URLs
        );
            
        // Personalización del PiePlot
        org.jfree.chart.plot.PiePlot plot = (org.jfree.chart.plot.PiePlot) c.getPlot();
        
        // Muestra la etiqueta con Clave, Valor (Alumnos) y Porcentaje
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
            "{0} ({1}) - {2}", 
            new java.text.DecimalFormat("0"), // Formato para el valor (Alumnos)
            new java.text.DecimalFormat("0.0%") // Formato para el porcentaje
        ));
        
        plot.setNoDataMessage("No hay datos disponibles");
        plot.setCircular(true); 
        plot.setLabelFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12));
        plot.setLabelOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setOutlineVisible(false); // Quitar borde de la gráfica circular
        plot.setBackgroundPaint(null); // Fondo transparente para el plot
        
        c.setBackgroundPaint(Color.WHITE); // Fondo blanco para el chart completo
        
        ChartPanel cpanel = new ChartPanel(c);
        cpanel.setPreferredSize(new java.awt.Dimension(850, 400));
        
        boogie.removeAll();
        boogie.add(cpanel, BorderLayout.CENTER);
        boogie.revalidate();
        boogie.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        boogie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(142, 181, 204));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout boogieLayout = new javax.swing.GroupLayout(boogie);
        boogie.setLayout(boogieLayout);
        boogieLayout.setHorizontalGroup(
            boogieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        boogieLayout.setVerticalGroup(
            boogieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        bg.add(boogie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 630));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Selecciona un ciclo:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 140, -1));

        jScrollPane1.setViewportView(List);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 130, 360));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel boogie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
