package wavecode.panels;

import java.awt.Image;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import wavecode.database.ConnectionDB;
import wavecode.model.Course;
import wavecode.service.CourseService;
import wavecode.model.icon;

/**
 *
 * @author FRANCIS
 */
public class CoursePane extends javax.swing.JPanel {
    
    icon icon = new icon();
    public CoursePane() {        
        initComponents();
        CharginTable();
//        icon.setHighQualityImage(logoDelete, "src/wavecode/images/Delete.png");
        CargarImagen();
    }

    private void CargarImagen (){
                SwingUtilities.invokeLater(() ->{
                    icon.SetImagenLabel(logoDelete, "src/wavecode/images/Delete.png");
                    icon.SetImagenLabel(logoInsertar,  "src/wavecode/images/masLogo.png");
                    icon.SetImagenLabel(logoUpdate, "src/wavecode/images/actualizarLogo.png");
                    icon.SetImagenLabel(logoWavecode, "src/wavecode/images/Wavecode.png");
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
        txtCdCurso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCiclo = new javax.swing.JTextField();
        txtCredits = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHorarioSalida = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtHorarioEntrada = new javax.swing.JTextField();
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
        logoWavecode = new javax.swing.JLabel();
        logoInsertar = new javax.swing.JLabel();
        logoDelete = new javax.swing.JLabel();
        logoUpdate = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 138, 159));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Asignatura", "Ciclo", "Créditos", "Horas", "Días", "H. Entrada", "H. Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jLabel8.setText("Código del curso:");
        contenido1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        contenido1.add(txtCdCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Asignatura:");
        contenido1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        contenido1.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ciclo:");
        contenido1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));
        contenido1.add(txtCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, -1));
        contenido1.add(txtCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 110, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Créditos:");
        contenido1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Horas semanales:");
        contenido1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 130, -1));
        contenido1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 130, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Dias:");
        contenido1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        contenido1.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 290, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Salida:");
        contenido1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 70, -1));
        contenido1.add(txtHorarioSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 130, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Entrada:");
        contenido1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 70, -1));
        contenido1.add(txtHorarioEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 130, -1));

        jPanel1.add(contenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 820, 190));

        or1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or1.setForeground(new java.awt.Color(0, 0, 0));
        or1.setText("Aquí podes configurar los cursos.");
        jPanel1.add(or1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 20));

        or2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or2.setForeground(new java.awt.Color(0, 0, 0));
        or2.setText("En esta tabla estan los cursos disponibles:");
        jPanel1.add(or2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 290, -1));

        tittle1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tittle1.setForeground(new java.awt.Color(0, 0, 0));
        tittle1.setText("CONFIGURACIÓN DE CURSOS");
        jPanel1.add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 340, 50));

        jPanel2.setBackground(new java.awt.Color(116, 162, 192));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Búsqueda por Código:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));
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
        jPanel1.add(logoWavecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 100));

        logoInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoInsertarMouseClicked(evt);
            }
        });
        jPanel1.add(logoInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 80, 70));

        logoDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(logoDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 80, 60));

        logoUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(logoUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 70, 70));

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
            ps = cn.prepareStatement("SELECT * FROM Curso WHERE codigo_Curso=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();

            while(rs.next()){
                txtCdCurso.setText(String.valueOf(id));
                txtAsignatura.setText(rs.getString("asignatura"));
                txtCiclo.setText(rs.getString("ciclo"));
                txtCredits.setText(rs.getString("creditos"));
                txtHoras.setText(rs.getString("horas"));
                txtDias.setText(rs.getString("dias"));
                txtHorarioEntrada.setText(rs.getString("hora_inicio"));
                txtHorarioSalida.setText(rs.getString("hora_salida"));                        
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

    private void logoInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoInsertarMouseClicked
        // TODO add your handling code here:
         int codigo = Integer.parseInt(txtCdCurso.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCredits.getText());
        int horas = Integer.parseInt(txtHoras.getText());
        String dias = txtDias.getText();
        String hEntrada = txtHorarioEntrada.getText();
        String hSalida = txtHorarioSalida.getText();
        
        Course cs = new Course(codigo, asignatura, ciclo, creditos, horas, dias, hEntrada, hSalida);
        CourseService service = new CourseService();
   
        if(service.addCourse(cs)){
            JOptionPane.showMessageDialog(null, "CURSO REGISTRADO CON EXITO");
            
        }else{
            JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO DEL CURSO");
        }
        CharginTable();
        Cleanin();
    }//GEN-LAST:event_logoInsertarMouseClicked

    private void logoUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoUpdateMouseClicked
        // TODO add your handling code here:
         int codigo = Integer.parseInt(txtCdCurso.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCredits.getText());
        int horas = Integer.parseInt(txtHoras.getText());
        String dias = txtDias.getText();
        String hEntrada = txtHorarioEntrada.getText();
        String hSalida = txtHorarioSalida.getText();
        
        Course cs = new Course(codigo, asignatura, ciclo, creditos, horas, dias, hEntrada, hSalida);
        CourseService service = new CourseService();

        if(service.updateCourse(cs)){
            JOptionPane.showMessageDialog(null, "CURSO MODIFICADO");
          
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR EL CURSO");
        }
         Cleanin();
         CharginTable();  
    }//GEN-LAST:event_logoUpdateMouseClicked

    private void logoDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDeleteMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdCurso.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCredits.getText());
        int horas = Integer.parseInt(txtHoras.getText());
        String dias = txtDias.getText();
        String hEntrada = txtHorarioEntrada.getText();
        String hSalida = txtHorarioSalida.getText();
        
        Course cs = new Course(codigo, asignatura, ciclo, creditos, horas, dias, hEntrada, hSalida);
        CourseService service = new CourseService();
        
         if(service.deleteCourse(cs)){
            JOptionPane.showMessageDialog(null, "CURSO ELIMINADO");

        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR CURSO");
        }
            Cleanin();
            CharginTable();
    }//GEN-LAST:event_logoDeleteMouseClicked

          private void Cleanin(){
        txtCdCurso.setText("");
        txtAsignatura.setText("");
        txtCiclo.setText("");
        txtCredits.setText("");
        txtHoras.setText("");
        txtDias.setText("");
        txtHorarioEntrada.setText("");
        txtHorarioSalida.setText("");
    }
    
      private void CharginTable(){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        
        int[]length ={60,210,40,40,40,70,80,80};
        for(int i= 0; i<tb.getColumnCount();i++){
         tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }
        
        try {
            ConnectionDB connDB = new ConnectionDB();
            java.sql.Connection cn = connDB.getConnection();
            ps= cn.prepareStatement("SELECT * FROM Curso ORDER BY ciclo ASC, codigo_Curso ASC;");
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
            
            //int[]length ={60,210,40,40,40};
            int[]length ={60,210,40,40,40,70,80,80};
            for(int i= 0; i<tb.getColumnCount();i++){
             tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
            }

         try {
                ConnectionDB connDB = new ConnectionDB();
                java.sql.Connection cn = connDB.getConnection();

                String sql;
                if (filtro.equals("")) {
                sql = "SELECT * FROM curso;";
                ps = cn.prepareStatement(sql);
            } else {
                sql = "SELECT codigo_Curso, asignatura, ciclo, creditos, horas, dias, hora_inicio,  hora_salida FROM curso WHERE codigo_Curso LIKE ?;";
                ps = cn.prepareStatement(sql);
                ps.setString(1,"%"+filtro+ "%"); 
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

                if(!filtro.equals("")){
                    if (searched) {
                        JOptionPane.showMessageDialog(null, "CURSO ENCONTRADO");
                    } else {
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON CURSOS CON ESE CRITERIO");
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelReiniciar;
    private javax.swing.JLabel logoDelete;
    private javax.swing.JLabel logoInsertar;
    private javax.swing.JLabel logoUpdate;
    private javax.swing.JLabel logoWavecode;
    private javax.swing.JLabel or1;
    private javax.swing.JLabel or2;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelReiniciar;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tb;
    private javax.swing.JLabel tittle1;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCdCurso;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHorarioEntrada;
    private javax.swing.JTextField txtHorarioSalida;
    private javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
