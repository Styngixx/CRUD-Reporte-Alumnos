package wavecode.graphics;

import java.sql.*;
import javax.swing.JList;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author FRANCIS
 */
public class GraphicStudentStatus extends javax.swing.JFrame {
    
    private final String url ="jdbc:mysql://localhost:3306/wavecode?useSSL=false", user ="root", pword="Chap04";
   
    
    public GraphicStudentStatus() {
        initComponents();
        mostrarGrafico();
    }

    private void mostrarGrafico() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try (Connection cnn = DriverManager.getConnection(url, user, pword)) {
            String sql = "SELECT estado, COUNT(cod_Alumno) AS cantidad FROM wavecode.alumno GROUP BY estado ORDER BY estado ASC";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()) {
                int estado = rs.getInt("estado");
                String nombreEstado;

                switch (estado) {
                    case 2:
                        nombreEstado = "Retirado";
                        break;
                    case 1:
                        nombreEstado = "Matriculado";
                        break;
                    case 0:
                        nombreEstado = "Registrado";
                        break;
                    default:
                        nombreEstado = "Desconocido (" + estado + ")";
                        break;
                }

                dataset.addValue(rs.getInt("cantidad"), "Alumnos", nombreEstado);
            }

            JFreeChart chart = ChartFactory.createBarChart(
                    "Distribución de Alumnos por Estado", 
                    "Estado del Alumno", 
                    "Cantidad de Alumnos", 
                    dataset, 
                    PlotOrientation.VERTICAL, true, true, false
            );
           

            CategoryPlot plot = chart.getCategoryPlot();

            BarRenderer renderer = new BarRenderer() {
                private final java.awt.Color[] colores = new java.awt.Color[]{
                    // Colores ajustados para coincidir con el orden de la consulta (0, 1, 2)
                    // Color 0 (Registrado): Verde
                    new java.awt.Color(155, 187, 89), 
                    // Color 1 (Matriculado): Azul
                    new java.awt.Color(79, 129, 189), 
                    // Color 2 (Retirado): Rojo
                    new java.awt.Color(192, 80, 77), 
                    // Se mantiene el violeta, aunque solo se usarán los primeros 3 colores
                    new java.awt.Color(128, 100, 162) 
                };

                @Override
                public java.awt.Paint getItemPaint(int row, int column) {
                    return colores[column % colores.length];
                }
            };

            //Mostrar las etiquetas encima de las barras (se mantiene igual)
            renderer.setDefaultItemLabelGenerator(new org.jfree.chart.labels.StandardCategoryItemLabelGenerator());
            renderer.setDefaultItemLabelsVisible(true);
            renderer.setDefaultItemLabelFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD,12));
            renderer.setDefaultPositiveItemLabelPosition(
                new org.jfree.chart.labels.ItemLabelPosition(
                        org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12, 
                       org.jfree.chart.ui.TextAnchor.CENTER
               )
            );

            plot.setRenderer(renderer);
            plot.setOutlineVisible(false);
            plot.setBackgroundPaint(java.awt.Color.WHITE);
            plot.setRangeGridlinePaint(java.awt.Color.LIGHT_GRAY);

            // Visualización del gráfico en el panel (se mantiene igual)
            ChartPanel p = new ChartPanel(chart);
            p.setPreferredSize(new java.awt.Dimension(600, 400));

            panelGrafico.removeAll();
            panelGrafico.setLayout(new java.awt.BorderLayout());
            panelGrafico.add(p, java.awt.BorderLayout.CENTER);
            panelGrafico.validate();
            panelGrafico.repaint();

        } catch (SQLException e) {
           e.printStackTrace(); 
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        bg.add(panelGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

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
                new GraphicStudentStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
