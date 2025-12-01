package wavecode.graphics;

/**
 *
 * @author FRANCIS
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import java.util.List;
import javax.swing.*;
import javax.swing.event.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.labels.*;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraphicStudentCourse extends javax.swing.JFrame {

    private final String url ="jdbc:mysql://localhost:3306/wavecode?useSSL=false", user ="root", pword="Chap04";

    public GraphicStudentCourse() {
        initComponents();
        boogie.setLayout(new BorderLayout());
        cargarCursos();
        mostrarGraficoGeneral();
        agregarEventoLista();

    }

 private void cargarCursos(){ // Adaptado de cargarProductos()
        DefaultListModel<String> model = new DefaultListModel<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url,user,pword);
            
            Statement st = cnn.createStatement();
            // Consulta para obtener todos los nombres de los cursos
            ResultSet rs = st.executeQuery("SELECT DISTINCT asignatura FROM curso ORDER BY asignatura");
            
            while (rs.next()) {
                model.addElement(rs.getString("asignatura"));
            }
            
            List.setModel(model);
            cnn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar cursos" + e.getMessage());
            
        }
    }
         
    private void agregarEventoLista(){
        List.addListSelectionListener(new ListSelectionListener(){
        
        @Override
            public void valueChanged(ListSelectionEvent e){
                if (!e.getValueIsAdjusting()){
                    List<String> selectioned = List.getSelectedValuesList();
                    if(!selectioned.isEmpty()){
                        // CAMBIO CLAVE 2: Llama a la función de filtro con la selección
                        mostrarGraficoPorCursos(selectioned); 
                    } else {
                        // Si se deselecciona todo, muestra el gráfico general
                        mostrarGraficoGeneral();
                    }
                }
            }
        
        });
    }

    private void mostrarGraficoGeneral(){ // Lógica adaptada a Alumnos Matriculados por Curso
        DefaultCategoryDataset dset = new DefaultCategoryDataset();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url, user, pword);
            
            // CONSULTA CORREGIDA para Alumnos Matriculados (estado=1) por Curso
            String sql = "SELECT c.asignatura, COUNT(a.cod_Alumno) AS total_alumnos " +
                         "FROM alumno a " +
                         "JOIN matricula m ON a.cod_Alumno = m.codigo_Estudiante " + // Unión Alumno -> Matricula
                         "JOIN curso c ON m.codigo_Curso = c.codigo_Curso " +       // Unión Matricula -> Curso
                         "WHERE a.estado = 1 " + // FILTRO: SOLO MATRICULADOS
                         "GROUP BY c.asignatura " +
                         "ORDER BY c.asignatura";
            
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                dset.addValue(rs.getInt("total_alumnos"), "Alumnos Matriculados", rs.getString("asignatura"));
            }
            cnn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarGrafico(dset, "Alumnos Matriculados por Curso (General)");
    }
  
    private void mostrarGraficoPorCursos(List<String> cursos){ // Adaptado de mostrarGraficoPorProductos()
        DefaultCategoryDataset dset = new DefaultCategoryDataset();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url, user, pword);
            
            String placeholders = String.join(",", cursos.stream().map(p -> "?").toArray(String[]::new));
            
            // CONSULTA CORREGIDA con filtro 'IN': Alumnos Matriculados por Curso SELECCIONADO
            String sql ="SELECT c.asignatura, COUNT(a.cod_Alumno) AS total_alumnos " +
                         "FROM alumno a " +
                         "JOIN matricula m ON a.cod_Alumno = m.codigo_Estudiante " +
                         "JOIN curso c ON m.codigo_Curso = c.codigo_Curso " +
                         "WHERE a.estado = 1 AND c.asignatura IN (" + placeholders + ") " + // Filtro por selección
                         "GROUP BY c.asignatura " +
                         "ORDER BY c.asignatura";
            
            PreparedStatement ps = cnn.prepareStatement(sql);
            
            for(int i = 0; i < cursos.size(); i++){
                ps.setString(i+1, cursos.get(i));
            }
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dset.addValue(rs.getInt("total_alumnos"), "Alumnos Matriculados", rs.getString("asignatura"));
            }
            
            cnn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        actualizarGrafico(dset, "Matriculados en Cursos Seleccionados");
    }
    
    private void actualizarGrafico(DefaultCategoryDataset dset, String tittle){
        JFreeChart c = ChartFactory.createBarChart(
                tittle,
                "Curso", // Título Eje X actualizado
                "Cantidad de Alumnos", // Título Eje Y actualizado
                dset
        );
            
        CategoryPlot cplot = c.getCategoryPlot();
        BarRenderer br = new BarRenderer(){
                
        @Override
        public java.awt.Paint getItemPaint(int row, int column){
            java.awt.Color[] colors={
              new java.awt.Color(79,129,189), //Azul
              new java.awt.Color(192,80,77), //Rojo
              new java.awt.Color(155,187,89), //Verde
              new java.awt.Color(128,100,162), //Morado
            };
            return colors[column % colors.length];
        }
        
        };
        br.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        br.setDefaultItemLabelsVisible(true);
        br.setDefaultItemLabelFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        br.setDefaultPositiveItemLabelPosition(
            new ItemLabelPosition(
                ItemLabelAnchor.OUTSIDE12,
                TextAnchor.CENTER
                )
        );
        
        br.setShadowVisible(false);
        br.setDrawBarOutline(false);
        
        cplot.setRenderer(br);
        cplot.setOutlineVisible(false);
        cplot.setBackgroundPaint(Color.WHITE);
        cplot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout boogieLayout = new javax.swing.GroupLayout(boogie);
        boogie.setLayout(boogieLayout);
        boogieLayout.setHorizontalGroup(
            boogieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        boogieLayout.setVerticalGroup(
            boogieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        bg.add(boogie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seleccion un curso:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        jScrollPane1.setViewportView(List);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 130, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicStudentCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel boogie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
