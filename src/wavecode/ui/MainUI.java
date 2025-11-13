package wavecode.ui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import wavecode.panels.*;
import wavecode.model.icon;
/**
 *
 * @author FRANCIS
 */
public class MainUI extends javax.swing.JFrame {
    CoursePane cp = new CoursePane();
    icon ic = new icon();
    public MainUI() {
        initComponents();
        mostrarPanel(cp);
        ic.setHighQualityImage(logoCourse, "src/wavecode/images/CourseLogo.png");
        ic.setHighQualityImage(logoStudent, "src/wavecode/images/StudentLogo.png");
        ic.setHighQualityImage(logoMatricula, "src/wavecode/images/matriculaLogo.png");
        ic.setHighQualityImage(logoRetiro, "src/wavecode/images/Retiro.png");
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
        jLabel1 = new javax.swing.JLabel();
        StudentPane = new javax.swing.JPanel();
        logoStudent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MatriculaPane = new javax.swing.JPanel();
        logoMatricula = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StudentPane1 = new javax.swing.JPanel();
        logoRetiro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bgCt = new javax.swing.JPanel();
        bgContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgLista.setBackground(new java.awt.Color(12, 94, 94));
        bgLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoursePane.setBackground(new java.awt.Color(108, 150, 150));
        CoursePane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CoursePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoursePaneMouseClicked(evt);
            }
        });
        CoursePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CoursePane.add(logoCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel1.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COURSE");
        CoursePane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 6, 90, 60));

        bgLista.add(CoursePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 70));

        StudentPane.setBackground(new java.awt.Color(108, 150, 150));
        StudentPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentPaneMouseClicked(evt);
            }
        });
        StudentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        StudentPane.add(logoStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel3.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALUMNOS");
        StudentPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 60));

        bgLista.add(StudentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 70));

        MatriculaPane.setBackground(new java.awt.Color(108, 150, 150));
        MatriculaPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MatriculaPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatriculaPaneMouseClicked(evt);
            }
        });
        MatriculaPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MatriculaPane.add(logoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel2.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MATRÍCULA");
        MatriculaPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 6, 90, 60));

        bgLista.add(MatriculaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 70));

        StudentPane1.setBackground(new java.awt.Color(108, 150, 150));
        StudentPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentPane1MouseClicked(evt);
            }
        });
        StudentPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        StudentPane1.add(logoRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel4.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RETIRO");
        StudentPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 60));

        bgLista.add(StudentPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jPanel1.add(bgLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 710));

        bgCt.setBackground(new java.awt.Color(51, 138, 159));
        bgCt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoCourse;
    private javax.swing.JLabel logoMatricula;
    private javax.swing.JLabel logoRetiro;
    private javax.swing.JLabel logoStudent;
    // End of variables declaration//GEN-END:variables
}
