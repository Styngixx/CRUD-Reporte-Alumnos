package wavecode.panels;

import javax.swing.SwingUtilities;
import wavecode.model.icon;

/**
 *
 * @author FRANCIS
 */
public class CreditosPane extends javax.swing.JPanel {

   icon icon = new icon();
    public CreditosPane() {
        initComponents();
        CargarImagen();
    }

       private void CargarImagen (){
                SwingUtilities.invokeLater(() ->{
                    icon.SetImagenLabel(labelAlumno, "src/wavecode/images/alumno.jpg");
                    icon.SetImagenLabel(labelProyecto, "src/wavecode/images/logoP.png");
        });
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelProyecto = new javax.swing.JLabel();
        labelAlumno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(142, 181, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto ExtraBold", 1, 24)); // NOI18N
        jLabel1.setText("ESTUDIANTES QUE APORTARON EN EL PROYECTO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 650, 80));
        jPanel1.add(labelProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 250, 150));
        jPanel1.add(labelAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 150, 130));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Estudiante de Ing. Software 6° ciclo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 400, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Francis Alejandro Inche Nuñez - U23240673");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 400, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 690));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAlumno;
    private javax.swing.JLabel labelProyecto;
    // End of variables declaration//GEN-END:variables
}
