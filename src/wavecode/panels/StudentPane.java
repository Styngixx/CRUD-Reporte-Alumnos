package wavecode.panels;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import wavecode.database.ConnectionDB;
import wavecode.model.Student;
import wavecode.service.StudentService;
import wavecode.model.icon;

/**
 *
 * @author FRANCIS
 */
public class StudentPane extends javax.swing.JPanel {

        icon icon = new icon();
    public StudentPane() {
        initComponents();
        CharginTable();
//        icon.setHighQualityImage(logoWave, "src/wavecode/images/Wavecode.png");
//        SetImagenLabel(logoDel, "src/wavecode/images/Delete.png");
        CargarImagen();
    }
    
    
     private void CargarImagen (){
                SwingUtilities.invokeLater(() ->{
                    icon.SetImagenLabel(logoDel, "src/wavecode/images/Delete.png");
                    icon.SetImagenLabel(logoInsert,  "src/wavecode/images/masLogo.png");
                    icon.SetImagenLabel(logoUp, "src/wavecode/images/actualizarLogo.png");
                    icon.SetImagenLabel(logoWave, "src/wavecode/images/Wavecode.png");
        });
        }

    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        bg = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        contenido1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCdAlumno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSurnames = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        or1 = new javax.swing.JLabel();
        or2 = new javax.swing.JLabel();
        tittle1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscado = new javax.swing.JTextField();
        panelBuscar = new javax.swing.JPanel();
        labelBuscar = new javax.swing.JLabel();
        panelReiniciar = new javax.swing.JPanel();
        labelReiniciar = new javax.swing.JLabel();
        logoWave = new javax.swing.JLabel();
        logoInsert = new javax.swing.JLabel();
        logoDel = new javax.swing.JLabel();
        logoUp = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        bg.setBackground(new java.awt.Color(51, 138, 159));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Nombre", "Apellido", "DNI", "Edad", "Celular", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        scroll.setViewportView(tb);

        bg.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 830, 300));

        contenido1.setBackground(new java.awt.Color(116, 162, 192));
        contenido1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Aqui estan los datos del curso seleccionado:");
        contenido1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Código del alumno:");
        contenido1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtCdAlumno.setEditable(false);
        contenido1.add(txtCdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nombres:");
        contenido1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        contenido1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DNI:");
        contenido1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        txtDni.setEditable(false);
        contenido1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, -1));
        contenido1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 110, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Edad:");
        contenido1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Celular:");
        contenido1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 130, -1));
        contenido1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 130, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Apellidos:");
        contenido1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        contenido1.add(txtSurnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 290, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Estado:");
        contenido1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 70, -1));
        contenido1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 130, -1));

        bg.add(contenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 820, 190));

        or1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or1.setText("Aquí podes configurar los alumnos.");
        bg.add(or1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 20));

        or2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or2.setText("En esta tabla estan los cursos disponibles:");
        bg.add(or2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 290, -1));

        tittle1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tittle1.setText("CONFIGURACIÓN DE ALUMNOS");
        bg.add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 390, 50));

        jPanel2.setBackground(new java.awt.Color(116, 162, 192));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Búsqueda por Código:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));
        jPanel2.add(txtBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));

        labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscar.setText("BUSCAR");
        labelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        labelReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReiniciar.setText("REINICIAR TABLA");
        labelReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelReiniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelReiniciarLayout = new javax.swing.GroupLayout(panelReiniciar);
        panelReiniciar.setLayout(panelReiniciarLayout);
        panelReiniciarLayout.setHorizontalGroup(
            panelReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReiniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelReiniciarLayout.setVerticalGroup(
            panelReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReiniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(panelReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 180, 170));
        bg.add(logoWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 100));

        logoInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoInsertMouseClicked(evt);
            }
        });
        bg.add(logoInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 80, 70));

        logoDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDelMouseClicked(evt);
            }
        });
        bg.add(logoDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 80, 60));

        logoUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoUpMouseClicked(evt);
            }
        });
        bg.add(logoUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
  

 
    
    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
        try {
            int arrow = tb.getSelectedRow();
            int id=Integer.parseInt(tb.getValueAt(arrow, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ConnectionDB connDB = new ConnectionDB();

            java.sql.Connection cn = connDB.getConnection();
            ps = cn.prepareStatement("SELECT * FROM Alumno WHERE cod_Alumno=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();

            while(rs.next()){
                txtCdAlumno.setText(String.valueOf(id));
                txtName.setText(rs.getString("nombres"));
                txtSurnames.setText(rs.getString("apellidos"));
                txtDni.setText(rs.getString("dni"));
                txtAge.setText(rs.getString("edad"));
                txtPhone.setText(rs.getString("celular"));
                txtStatus.setText(rs.getString("estado"));
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbMouseClicked

    private void labelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseClicked
        // TODO add your handling code here:
        String codigo = txtBuscado.getText().trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "EL CAMPO DE BÚSQUEDA ESTÁ VACÍO. INGRESE UNO");
        } else {
            CharginTable2(codigo);
        }
    }//GEN-LAST:event_labelBuscarMouseClicked

    private void labelReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReiniciarMouseClicked
        // TODO add your handling code here:
        CharginTable();
        Cleanin();
        txtBuscado.setText("");
    }//GEN-LAST:event_labelReiniciarMouseClicked

    private void logoInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoInsertMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdAlumno.getText());
        String nombre = txtName.getText();
        String apellido = txtSurnames.getText();
        int dni = Integer.parseInt(txtDni.getText());
        int edad = Integer.parseInt(txtAge.getText());
        int celular = Integer.parseInt(txtPhone.getText());
        int estado = Integer.parseInt(txtStatus.getText());

        Student st = new Student(codigo, nombre, apellido, dni, edad, celular, estado);
        StudentService service = new StudentService();

        if(service.addStudent(st)){
            JOptionPane.showMessageDialog(null, "ALUMNO REGISTRADO CON EXITO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO DEL ALUMNO");
        }
        CharginTable();
        Cleanin();
    }//GEN-LAST:event_logoInsertMouseClicked

    private void logoDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDelMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdAlumno.getText());
        String nombre = txtName.getText();
        String apellido = txtSurnames.getText();
        int dni = Integer.parseInt(txtDni.getText());
        int edad = Integer.parseInt(txtAge.getText());
        int celular = Integer.parseInt(txtPhone.getText());
        int estado = Integer.parseInt(txtStatus.getText());

        Student st = new Student(codigo, nombre, apellido, dni, edad, celular, estado);
        StudentService service = new StudentService();

        if(service.deleteStudent(st)){
            JOptionPane.showMessageDialog(null, "ALUMNO ELIMINADO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR ALUMNO");
        }
        Cleanin();
        CharginTable();
    }//GEN-LAST:event_logoDelMouseClicked

    private void logoUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoUpMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdAlumno.getText());
        String nombre = txtName.getText();
        String apellido = txtSurnames.getText();
        int dni = Integer.parseInt(txtDni.getText());
        int edad = Integer.parseInt(txtAge.getText());
        int celular = Integer.parseInt(txtPhone.getText());
        int estado = Integer.parseInt(txtStatus.getText());

        Student st = new Student(codigo, nombre, apellido, dni, edad, celular, estado);
        StudentService service = new StudentService();

        if(service.updateStudent(st)){
            JOptionPane.showMessageDialog(null, "ALUMNO MODIFICADO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR EL ALUMNO");
        }
        Cleanin();
        CharginTable();
    }//GEN-LAST:event_logoUpMouseClicked

    
        private void Cleanin(){
        txtCdAlumno.setText("");
        txtName.setText("");
        txtDni.setText("");
        txtAge.setText("");
        txtPhone.setText("");
        txtSurnames.setText("");
        txtStatus.setText("");
    }
    
        private void CharginTable(){
    DefaultTableModel model = (DefaultTableModel) tb.getModel();
    model.setRowCount(0);
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rmds;
    int qeue;
    
    int[]length ={60,210,100,40,40,70,80};
    for(int i= 0; i<tb.getColumnCount();i++){
        tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
    }
    
    try {
        ConnectionDB connDB = new ConnectionDB();
        java.sql.Connection cn = connDB.getConnection();
        
        // --- CAMBIO CLAVE AQUÍ: Se añade WHERE estado = 0 ---
        // Ahora solo selecciona alumnos cuyo estado es 0 (Registrado).
        ps = cn.prepareStatement("SELECT * FROM Alumno WHERE estado = 0 ORDER BY cod_Alumno ASC;");
        
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
        
         	
      
      
           //método para mostara la tabla 2 tb2
    private void CharginTable2(String filtro){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        boolean searched = false;

        // Configuración del ancho de columnas (se mantiene igual)
        int[]length ={60,210,100,40,40,70,80};
        for(int i= 0; i<tb.getColumnCount();i++){
            tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }

        try {
            // Asumiendo que ConnectionDB funciona correctamente
            ConnectionDB connDB = new ConnectionDB();
            java.sql.Connection cn = connDB.getConnection();

            String sql;

            // --- CAMBIO CLAVE AQUÍ ---
            if (filtro.equals("")) {
                // Caso 1: Sin filtro de búsqueda, pero solo estado = 0
                sql = "SELECT * FROM alumno WHERE estado = 0;";
                ps = cn.prepareStatement(sql);
            } else {
                // Caso 2: Con filtro de búsqueda, restringiendo también estado = 0
                // Nota: Aquí se asume que 'cod_Alumno' es el campo por el que buscas.
                sql = "SELECT * FROM alumno WHERE estado = 0 AND cod_Alumno LIKE ?;";
                ps = cn.prepareStatement(sql);
                ps.setString(1,"%"+filtro+ "%");
            }
            // --- FIN CAMBIO CLAVE ---

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

            // ... El manejo de mensajes (JOptionPane) se mantiene igual ...

            if(!filtro.equals("")){
                if (searched) {
                    JOptionPane.showMessageDialog(null, "ALUMNO ENCONTRADO");
                } else {
                    // El mensaje ahora significa que no se encontró en el estado 0.
                    JOptionPane.showMessageDialog(
                            null, 
                            "NO SE ENCONTRARON ALUMNOS CON ESE CRITERIO EN ESTADO REGISTRADO (0)");
                    // Asumiendo que Cleanin() y txtBuscado existen
                    // Cleanin();  
                    // txtBuscado.setText("");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
            }

}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel contenido1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelReiniciar;
    private javax.swing.JLabel logoDel;
    private javax.swing.JLabel logoInsert;
    private javax.swing.JLabel logoUp;
    private javax.swing.JLabel logoWave;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel or1;
    private javax.swing.JLabel or2;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelReiniciar;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tb;
    private javax.swing.JLabel tittle1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCdAlumno;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSurnames;
    // End of variables declaration//GEN-END:variables
}
