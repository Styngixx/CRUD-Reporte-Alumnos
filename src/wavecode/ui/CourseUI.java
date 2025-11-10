package wavecode.ui;

/**
 *
 * @author FRANCIS
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import wavecode.database.ConnectionDB;
import wavecode.model.Course;
import wavecode.service.CourseService;

public class CourseUI extends javax.swing.JFrame {

    public CourseUI() {
        initComponents();
        CharginTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        txtAsignatura = new javax.swing.JTextField();
        txtCiclo = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        bntCleanin = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(3, 158, 158));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTROS DE CURSOS");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 190, 30));
        bg.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, 30));

        jLabel2.setText("CICLO");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 110, 30));

        jLabel3.setText("HORAS");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 20));

        jLabel4.setText("CÓDIGO");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 30));

        jLabel5.setText("CRÉDITOS");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 30));
        bg.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, -1));
        bg.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, -1));
        bg.add(txtCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, -1));
        bg.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 130, -1));

        btnDelete.setText("ELIMINAR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        bg.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        btnRegister.setText("REGISTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        bg.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        bntCleanin.setText("LIMPIAR");
        bntCleanin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCleaninActionPerformed(evt);
            }
        });
        bg.add(bntCleanin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        btnUpdate.setText("MODIFICAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        bg.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Asignatura", "Ciclo", "Créditos", "Cantidad Horas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        Scroll.setViewportView(tb);

        bg.add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 480, 490));

        jLabel6.setText("CURSOS");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, -1));

        jLabel7.setText("ASIGNATURA");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCode.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCreditos.getText());
        int horas = Integer.parseInt(txtHoras.getText());
        
        Course cs = new Course(codigo, asignatura, ciclo, creditos, horas);
        CourseService service = new CourseService();
   
        if(service.addCourse(cs)){
            JOptionPane.showMessageDialog(null, "CURSO REGISTRADO CON EXITO");
            
        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO DEL CURSO");
        }
        CharginTable();
        Cleanin();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void bntCleaninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCleaninActionPerformed
        // TODO add your handling code here:
        Cleanin();
    }//GEN-LAST:event_bntCleaninActionPerformed

    private void Cleanin(){
        txtCode.setText("");
        txtAsignatura.setText("");
        txtCiclo.setText("");
        txtCreditos.setText("");
        txtHoras.setText("");
    }
    
    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
        try {
            int arrow = tb.getSelectedRow();
            int id=Integer.parseInt(tb.getValueAt(arrow, 0).toString());
            PreparedStatement ps;
            ResultSet rs;            
            ConnectionDB connDB = new ConnectionDB();
            
            Connection cn = connDB.getConnection();
            ps = cn.prepareStatement("SELECT * FROM Curso WHERE codigo_Curso=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();
            
            while(rs.next()){
                txtCode.setText(String.valueOf(id));
                txtAsignatura.setText(rs.getString("asignatura"));
                txtCiclo.setText(rs.getString("ciclo"));
                txtCreditos.setText(rs.getString("creditos"));
                txtHoras.setText(rs.getString("horas"));               
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCode.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCreditos.getText());
        int horas = Integer.parseInt(txtHoras.getText());
        
        Course cs = new Course(codigo, asignatura, ciclo, creditos, horas);
        CourseService service = new CourseService();

        if(service.updateCourse(cs)){
            JOptionPane.showMessageDialog(null, "CURSO MODIFICADO");
          
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR EL CURSO");
        }
         Cleanin();
         CharginTable();  
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCode.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCreditos.getText());
        int horas = Integer.parseInt(txtHoras.getText());
        
        Course c = new Course(codigo, asignatura, ciclo, creditos, horas);
        CourseService service = new CourseService();
        
        if(service.deleteCourse(c)){
            JOptionPane.showMessageDialog(null, "CURSO ELIMINADO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR CURSO");
        }
            Cleanin();
            CharginTable();
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void CharginTable(){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        
        int[]length ={100,100,100,100,100};
        for(int i= 0; i<tb.getColumnCount();i++){
         tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }
        
        try {
            ConnectionDB connDB = new ConnectionDB();
            Connection cn = connDB.getConnection();
            ps= cn.prepareStatement("SELECT * FROM Curso");
            rs=ps.executeQuery();
            rmds = rs.getMetaData();
            qeue = rmds.getColumnCount();
            
            while (rs.next()) {
                Object[] a = new Object[qeue];
                for(int x = 0; x<qeue; x++){
                    a[x] = rs.getObject(x+1);
                }
                model.addRow(a);
            }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bntCleanin;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
