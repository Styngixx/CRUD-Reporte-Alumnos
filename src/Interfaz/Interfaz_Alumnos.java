package Interfaz;

/**
 *
 * @author FRANCIS
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import wavecode.Conexion;

public class Interfaz_Alumnos extends javax.swing.JFrame {

    public Interfaz_Alumnos() {
        initComponents();
        CharginTable();
        CharginTable2("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cd2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnShow_Search = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        bntCleanin = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnDelete1 = new javax.swing.JButton();
        Scroll1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        txtCodCompleto = new javax.swing.JTextField();

        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(3, 158, 158));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTROS DE ALUMNOS");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 30));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));

        jLabel2.setText("APELLIDO");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, 30));

        cd2.setText("CÓDIGO DEL ALUMNO");
        bg.add(cd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 150, 30));

        jLabel4.setText("CODIGO");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, 30));

        jLabel5.setText("DNI");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 30));
        bg.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));
        bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, -1));
        bg.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, -1));

        btnShow_Search.setText("BUSCAR / MOSTRAR");
        btnShow_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow_SearchActionPerformed(evt);
            }
        });
        bg.add(btnShow_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 260, 30));

        btnRegister.setText("REGISTRAR");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        bg.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

        bntCleanin.setText("LIMPIAR");
        bntCleanin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCleaninActionPerformed(evt);
            }
        });
        bg.add(bntCleanin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 100, 30));

        btnUpdate.setText("MODIFICAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        bg.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 30));

        jLabel6.setText("ALUMNOS");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, -1));

        jLabel7.setText("NOMBRE");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, 30));
        bg.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, -1));

        jLabel8.setText("EDAD");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 30));

        jLabel9.setText("CELULAR");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 30));
        bg.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, -1));

        jLabel10.setText("ESTADO");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 30));
        bg.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 130, -1));

        btnDelete1.setText("ELIMINAR");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        bg.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 100, 30));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "DNI", "Edad", "Celular", "Estado"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        Scroll1.setViewportView(tb);

        bg.add(Scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 610, 540));

        txtCodCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodCompletoKeyReleased(evt);
            }
        });
        bg.add(txtCodCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 462, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtName.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        int edad = Integer.parseInt(txtEdad.getText()); 
        String celular = txtCelular.getText();
        int estado = Integer.parseInt(txtEstado.getText());
        
        Conexion cxx = new Conexion();
        int answer = cxx.RegistroAlumno(codigo, nombre, apellido, dni, edad, celular, estado);
        if(answer ==1){
            JOptionPane.showMessageDialog(null, "ALUMNO REGISTRADO CON EXITO");
            
        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO DEL ALUMNO");
        }
        CharginTable();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void bntCleaninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCleaninActionPerformed
        // TODO add your handling code here:
        Cleanin();
    }//GEN-LAST:event_bntCleaninActionPerformed

    private void Cleanin(){
        txtCodigo.setText("");
        txtName.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtCelular.setText("");
        txtEstado.setText("");
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtName.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        int edad = Integer.parseInt(txtEdad.getText()); 
        String celular = txtCelular.getText();
        int estado = Integer.parseInt(txtEstado.getText());
        
        Conexion cx = new Conexion();
        int answer = cx.ModificarAlumno(codigo, nombre, apellido, dni, edad, celular, estado);
        if(answer==1){
            JOptionPane.showMessageDialog(null, "ALUMNO MODIFICADO");
            Cleanin();
            CharginTable();            
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR AL ALUMNO");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnShow_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow_SearchActionPerformed
        // TODO add your handling code here:
//        String codigo = txtCodCompleto.getText().trim();
//        if (codigo.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "EL CAMPO DE BÚSQUEDA ESTÁ VACÍO. INGRESE UNO");
//        } else {
//            CharginTable2(codigo);
//        }
    }//GEN-LAST:event_btnShow_SearchActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCodigo.getText());//        String nombre = txtName.getText();
//        String apellido = txtApellido.getText();
//        String dni = txtDni.getText();
//        int edad = Integer.parseInt(txtEdad.getText()); 
//        String celular = txtCelular.getText();
//        int estado = Integer.parseInt(txtEstado.getText());
        

        Conexion coo = new Conexion();

        
        int answer = coo.EliminarAlumno(codigo);
        if(answer==1){
            JOptionPane.showMessageDialog(null, "ALUMNO ELIMINADO");
            Cleanin();
            CharginTable();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR ALUMNO");
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
            try {
            int arrow = tb.getSelectedRow();
            int id=Integer.parseInt(tb.getValueAt(arrow, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Conexion crr = new Conexion();
            Connection con = crr.getConnection();
            ps = con.prepareStatement("SELECT * FROM Alumno WHERE cod_Alumno=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();
            
            while(rs.next()){
                txtCodigo.setText(String.valueOf(id));
                txtName.setText(rs.getString("nombres"));
                txtApellido.setText(rs.getString("apellidos"));
                txtDni.setText(rs.getString("dni"));
                txtEdad.setText(rs.getString("edad")); 
                txtCelular.setText(rs.getString("celular"));
                txtEstado.setText(rs.getString("estado"));
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbMouseClicked

    private void txtCodCompletoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodCompletoKeyReleased
        // TODO add your handling code here:
        String codigo_alumno = txtCodCompleto.getText();
        CharginTable2(codigo_alumno);
    }//GEN-LAST:event_txtCodCompletoKeyReleased
    
    private void CharginTable(){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        
        int[]length ={100,100,100,100,100,100,100};
        for(int i= 0; i<tb.getColumnCount();i++){
         tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }
        
        try {
            Conexion co = new Conexion();
            Connection cn = co.getConnection();
            ps= cn.prepareStatement("SELECT cod_Alumno, nombres, apellidos, dni, edad, celular, estado FROM alumno");
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
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        
    }
    
    //método para mostara la tabla 2 tb2
    private void CharginTable2(String filtro){
    DefaultTableModel model = (DefaultTableModel) tb.getModel();
    model.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        boolean searched = false;
        
        int[]length ={100,100,100,100,100,100,100};
        for(int i= 0; i<tb.getColumnCount();i++){
         tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }
        
    try {
            Conexion co = new Conexion();
            Connection cn = co.getConnection();
            
            String sql;
            if (filtro.equals("")) {
            sql = "SELECT cod_Alumno, nombres, apellidos, dni, edad, celular, estado FROM alumno;";
            ps = cn.prepareStatement(sql);
        } else {
            sql = "SELECT cod_Alumno, nombres, apellidos, dni, edad, celular, estado FROM alumno WHERE cod_Alumno LIKE ?;";
            ps = cn.prepareStatement(sql);
            ps.setString(1,"%"+filtro+ "%"); //filtro seguro con PreparedStatement
        }
            rs=ps.executeQuery();
            rmds = rs.getMetaData();
            qeue = rmds.getColumnCount();
            
    while (rs.next()) {
                Object[] a = new Object[qeue];
                for(int x = 0; x<qeue; x++){
                    a[x] = rs.getObject(x+1);
                }
                model.addRow(a);
                searched = true;
            }
            
//            if(!filtro.equals("")){
//                if (searched) {
//                    JOptionPane.showMessageDialog(null, "ALUMNO ENCONTRADO");
//                } else {
//                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON USUARIOS CON ESE CRITERIO");
//                }
//            }            
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll1;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bntCleanin;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnShow_Search;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel cd2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodCompleto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
