package wavecode.panels;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import wavecode.database.ConnectionDB;
import wavecode.model.Retiro;
import wavecode.service.RetiroService;
import wavecode.model.icon;

/**
 *
 * @author FRANCIS
 */
public class RetiroPane extends javax.swing.JPanel {

    icon icon = new icon();
    public RetiroPane() {
        initComponents();
        CargarImagen();
        CharginTable();
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

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        contenido1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNroRetiro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNroMatricula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
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

        jPanel1.setBackground(new java.awt.Color(51, 138, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero Retiro", "Matricula", "Fecha", "Hora", "Estado de Matricula"
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
        scroll.setViewportView(tb);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 830, 300));

        contenido1.setBackground(new java.awt.Color(116, 162, 192));
        contenido1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Aqui estan los datos del curso seleccionado:");
        contenido1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Número Retiro:");
        contenido1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtNroRetiro.setEditable(false);
        contenido1.add(txtNroRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 290, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Fecha:");
        contenido1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        contenido1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Número Matrícula:");
        contenido1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        txtNroMatricula.setEditable(false);
        contenido1.add(txtNroMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 280, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Hora:");
        contenido1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        contenido1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 290, -1));

        jPanel1.add(contenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 820, 190));

        or1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or1.setText("Aquí podes configurar los retiros.");
        jPanel1.add(or1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 20));

        or2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or2.setText("En esta tabla estan los cursos disponibles:");
        jPanel1.add(or2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 290, -1));

        tittle1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tittle1.setText("CONFIGURACIÓN DE RETIROS");
        jPanel1.add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 390, 50));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 180, 170));
        jPanel1.add(logoWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 100));

        logoInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoInsertMouseClicked(evt);
            }
        });
        jPanel1.add(logoInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 80, 70));

        logoDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDelMouseClicked(evt);
            }
        });
        jPanel1.add(logoDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 80, 60));

        logoUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoUpMouseClicked(evt);
            }
        });
        jPanel1.add(logoUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            ps = cn.prepareStatement("SELECT * FROM Retiro WHERE numero_Retiro=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();

//            
            while(rs.next()){
                txtNroRetiro.setText(String.valueOf(id));
                txtNroMatricula.setText(rs.getString("matricula"));
                txtDate.setText(rs.getString("fecha"));
                txtHora.setText(rs.getString("hora"));
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
        int nroRetiro = Integer.parseInt(txtNroRetiro.getText());
        int nroMatricula = Integer.parseInt(txtNroMatricula.getText());
        String fecha = txtDate.getText();
        String hora = txtHora.getText();

        Retiro r = new Retiro(nroRetiro, nroMatricula, fecha, hora);
        RetiroService service = new RetiroService();

        if(service.addRetiro(r)){
            JOptionPane.showMessageDialog(null, "RETIRO REGISTRADO CON EXITO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO DEL RETIRO");
        }
        CharginTable();
        Cleanin();
    }//GEN-LAST:event_logoInsertMouseClicked

    private void logoDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDelMouseClicked
        // TODO add your handling code here:
        int nroRetiro = Integer.parseInt(txtNroRetiro.getText());
        int nroMatricula = Integer.parseInt(txtNroMatricula.getText());
        String fecha = txtDate.getText();
        String hora = txtHora.getText();

        Retiro r = new Retiro(nroRetiro, nroMatricula, fecha, hora);
        RetiroService service = new RetiroService();

        if(service.deleteRetiro(r)){
            JOptionPane.showMessageDialog(null, "RETIRO ELIMINADO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR RETIRO");
        }
        Cleanin();
        CharginTable();
    }//GEN-LAST:event_logoDelMouseClicked

    private void logoUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoUpMouseClicked
        // TODO add your handling code here:
        int nroRetiro = Integer.parseInt(txtNroRetiro.getText());
        int nroMatricula = Integer.parseInt(txtNroMatricula.getText());
        String fecha = txtDate.getText();
        String hora = txtHora.getText();

        Retiro r = new Retiro(nroRetiro, nroMatricula, fecha, hora);
        RetiroService service = new RetiroService();

        if(service.updateRetiro(r)){
            JOptionPane.showMessageDialog(null, "RETIRO MODIFICADO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR EL RETIRO");
        }
        Cleanin();
        CharginTable();
    }//GEN-LAST:event_logoUpMouseClicked

      
  private void Cleanin(){
         txtNroRetiro.setText("");
        txtNroMatricula.setText("");        
        txtDate.setText("");
        txtHora.setText("");
    }
    
    private void CharginTable(){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;

        // Ajustado para 5 columnas: Retiro, Matrícula, Fecha, Hora, Estado
        int[]length ={100, 100, 100, 100, 80}; 
        for(int i= 0; i<tb.getColumnCount();i++){
          tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }

        try {
            ConnectionDB connDB = new ConnectionDB();
            java.sql.Connection cn = connDB.getConnection();

            // --- SQL MODIFICADO: Añade el estado y el filtro 'estado = 2' ---
            String sql = "SELECT r.numero_Retiro, r.matricula, r.fecha, r.hora, a.estado " + 
                         "FROM Retiro r " +
                         "JOIN matricula m ON r.matricula = m.numero_Matricula " + 
                         "JOIN alumno a ON m.codigo_Estudiante = a.cod_Alumno " +    
                         "WHERE a.estado = 2 " + // FILTRO ESTADO = 2
                         "ORDER BY r.fecha ASC, r.numero_Retiro ASC;";

            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            rmds = rs.getMetaData();
            qeue = rmds.getColumnCount(); // qeue ahora será 5

            while (rs.next()) {
                Object[] a = new Object[qeue]; // Tamaño de array 5
                for(int x = 0; x<qeue; x++){
                    a[x] = rs.getObject(x+1);
                }
                model.addRow(a);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }       
    }
    
    
    private void CharginTable2(String filtro){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        boolean searched = false;

        // Ajustado para 5 columnas: Retiro, Matrícula, Fecha, Hora, Estado
        int[]length ={100, 100, 100, 100, 80};
        for(int i= 0; i<tb.getColumnCount();i++){
          tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }

        try {
            ConnectionDB connDB = new ConnectionDB();
            java.sql.Connection cn = connDB.getConnection();

            String sql;

            // Consulta base con JOINs y el filtro principal (estado = 2)
            String baseSelect = "SELECT r.numero_Retiro, r.matricula, r.fecha, r.hora, a.estado " +
                                "FROM Retiro r " +
                                "JOIN matricula m ON r.matricula = m.numero_Matricula " + 
                                "JOIN alumno a ON m.codigo_Estudiante = a.cod_Alumno " +    
                                "WHERE a.estado = 2 "; // FILTRO BASE

            if (filtro.equals("")) {
                // Caso 1: Sin filtro de búsqueda
                sql = baseSelect + "ORDER BY r.fecha ASC, r.numero_Retiro ASC;";
                ps = cn.prepareStatement(sql);
            } else {
                // Caso 2: Con filtro de búsqueda, añadimos el criterio al filtro base
                sql = baseSelect + "AND r.numero_Retiro LIKE ? " + 
                         "ORDER BY r.fecha ASC, r.numero_Retiro ASC;";
                ps = cn.prepareStatement(sql);
                ps.setString(1,"%"+filtro+ "%"); 
            }

            rs=ps.executeQuery();
            rmds = rs.getMetaData();
            qeue = rmds.getColumnCount(); // qeue ahora será 5

            while (rs.next()) {
                 Object[] a = new Object[qeue]; // Tamaño de array 5
                 for(int x = 0; x<qeue; x++){
                     a[x] = rs.getObject(x+1);
                 }
                 model.addRow(a);
                 searched = true;
             }

            if(!filtro.equals("")){
                if (searched) {
                    JOptionPane.showMessageDialog(null, "RETIRO ENCONTRADO");
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON RETIROS CON ESE CRITERIO");
                    Cleanin();
                    txtBuscado.setText("");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelReiniciar;
    private javax.swing.JLabel logoDel;
    private javax.swing.JLabel logoInsert;
    private javax.swing.JLabel logoUp;
    private javax.swing.JLabel logoWave;
    private javax.swing.JLabel or1;
    private javax.swing.JLabel or2;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelReiniciar;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tb;
    private javax.swing.JLabel tittle1;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNroMatricula;
    private javax.swing.JTextField txtNroRetiro;
    // End of variables declaration//GEN-END:variables
}
