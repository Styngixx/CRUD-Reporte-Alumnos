package wavecode.ui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import wavecode.graphics.GraphicStudentStatus;
import wavecode.panels.*;
import wavecode.model.icon;
/**
 *
 * @author FRANCIS
 */
public class MainUI extends javax.swing.JFrame {
    CoursePane cp = new CoursePane();
    icon ic = new icon();
    HomePane credpane = new HomePane();
    
    public MainUI() {
        initComponents();
        mostrarPanel(credpane);
        ic.setHighQualityImage(logoCourse, "src/wavecode/images/CourseLogo.png");
        ic.setHighQualityImage(logoStudent, "src/wavecode/images/StudentLogo.png");
        ic.setHighQualityImage(logoMatricula, "src/wavecode/images/matriculaLogo.png");
        ic.setHighQualityImage(logoRetiro, "src/wavecode/images/Retiro.png");
        ic.setHighQualityImage(labelHome, "src/wavecode/images/casitaa.png");
        ic.setHighQualityImage(labelTeam, "src/wavecode/images/tim.png");
        ic.setHighQualityImage(labelReportes, "src/wavecode/images/reportes.png");
        setTitle("WAVECODE 1.9.8 version BETA");
        setIconImage(getIconImage());
    }
    
    @Override
         public final  Image getIconImage () {
         Image retValue = Toolkit.getDefaultToolkit().getImage
                                (ClassLoader.getSystemResource("wavecode/images/Wavecode.png"));
            return retValue;
    }
    private void mostrarPanel(JPanel p) {
        p.setSize(1070, 690);
        p.setLocation(0, 0);

        bgContenido.removeAll();
        bgContenido.add(p, BorderLayout.CENTER);
        bgContenido.revalidate();
        bgContenido.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bgLista = new javax.swing.JPanel();
        CoursePane = new javax.swing.JPanel();
        logoCourse = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StudentPane = new javax.swing.JPanel();
        logoStudent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MatriculaPane = new javax.swing.JPanel();
        logoMatricula = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StudentPane1 = new javax.swing.JPanel();
        logoRetiro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelHome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTeam = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelReportes = new javax.swing.JLabel();
        bgCt = new javax.swing.JPanel();
        bgContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgLista.setBackground(new java.awt.Color(111, 161, 190));
        bgLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoursePane.setBackground(new java.awt.Color(142, 189, 189));
        CoursePane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CoursePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoursePaneMouseClicked(evt);
            }
        });
        CoursePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CoursePane.add(logoCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jLabel5.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CURSOS");
        CoursePane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 60));

        bgLista.add(CoursePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 60));

        StudentPane.setBackground(new java.awt.Color(142, 189, 189));
        StudentPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentPaneMouseClicked(evt);
            }
        });
        StudentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        StudentPane.add(logoStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jLabel3.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALUMNOS");
        StudentPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 60));

        bgLista.add(StudentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 60));

        MatriculaPane.setBackground(new java.awt.Color(142, 189, 189));
        MatriculaPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MatriculaPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatriculaPaneMouseClicked(evt);
            }
        });
        MatriculaPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MatriculaPane.add(logoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jLabel2.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MATRÍCULA");
        MatriculaPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 60));

        bgLista.add(MatriculaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 60));

        StudentPane1.setBackground(new java.awt.Color(142, 189, 189));
        StudentPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentPane1MouseClicked(evt);
            }
        });
        StudentPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        StudentPane1.add(logoRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jLabel4.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RETIRO");
        StudentPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 60));

        bgLista.add(StudentPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 60));

        jPanel2.setBackground(new java.awt.Color(142, 189, 189));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MENÚ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 50));
        jPanel2.add(labelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        bgLista.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 50));

        jPanel3.setBackground(new java.awt.Color(142, 189, 189));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRÉDITOS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 50));
        jPanel3.add(labelTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        bgLista.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 170, -1));

        jPanel4.setBackground(new java.awt.Color(142, 189, 189));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REPORTES");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 50));
        jPanel4.add(labelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        bgLista.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 170, -1));

        jPanel1.add(bgLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 710));

        bgCt.setBackground(new java.awt.Color(142, 181, 204));
        bgCt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bgContenidoLayout = new javax.swing.GroupLayout(bgContenido);
        bgContenido.setLayout(bgContenidoLayout);
        bgContenidoLayout.setHorizontalGroup(
            bgContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        bgContenidoLayout.setVerticalGroup(
            bgContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        bgCt.add(bgContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1070, 690));

        jPanel1.add(bgCt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1090, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentPaneMouseClicked
        // TODO add your handling code here:
        StudentPane spx = new StudentPane();
        mostrarPanel(spx);
        
    }//GEN-LAST:event_StudentPaneMouseClicked

    private void CoursePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoursePaneMouseClicked
        // TODO add your handling code here:
        CoursePane cpx = new CoursePane();
        mostrarPanel(cpx);
    }//GEN-LAST:event_CoursePaneMouseClicked

    private void MatriculaPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatriculaPaneMouseClicked
        // TODO add your handling code here:
        MatriculaPane mpx = new MatriculaPane();
        mostrarPanel(mpx);
    }//GEN-LAST:event_MatriculaPaneMouseClicked

    private void StudentPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentPane1MouseClicked
        // TODO add your handling code here:
        RetiroPane rtx = new RetiroPane();
        mostrarPanel(rtx);
    }//GEN-LAST:event_StudentPane1MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        GraphicStudentStatus gss = new GraphicStudentStatus();
        gss.setVisible(true);
        gss.setTitle("GRÁFICAS DE RESUMEN");
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        HomePane hp = new HomePane();
        mostrarPanel(hp);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        CreditosPane cpd = new CreditosPane();
        mostrarPanel(cpd);
    }//GEN-LAST:event_jPanel3MouseClicked

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoursePane;
    private javax.swing.JPanel MatriculaPane;
    private javax.swing.JPanel StudentPane;
    private javax.swing.JPanel StudentPane1;
    private javax.swing.JPanel bgContenido;
    private javax.swing.JPanel bgCt;
    private javax.swing.JPanel bgLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelReportes;
    private javax.swing.JLabel labelTeam;
    private javax.swing.JLabel logoCourse;
    private javax.swing.JLabel logoMatricula;
    private javax.swing.JLabel logoRetiro;
    private javax.swing.JLabel logoStudent;
    // End of variables declaration//GEN-END:variables
}
