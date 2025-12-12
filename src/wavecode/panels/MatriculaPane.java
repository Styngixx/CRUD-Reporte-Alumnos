package wavecode.panels;

/**
 *
 * @author FRANCIS
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import wavecode.database.ConnectionDB;
import wavecode.model.Matricula;
import wavecode.service.MatriculaService;
import wavecode.model.icon;

public class MatriculaPane extends javax.swing.JPanel {
    
    icon icon = new icon();            
    public MatriculaPane() {
        initComponents();
        CharginTable();
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

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        contenido1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNroMatricula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCdEstudiante = new javax.swing.JTextField();
        txtCdCurso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(142, 181, 204));
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
                "Número de Matrícula", "Código del Estudiante", "Código del Curso", "Fecha de la Matricula", "Hora de la Matricula"
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
        jLabel8.setText("Número Matrícula:");
        contenido1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        contenido1.add(txtNroMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Fecha:");
        contenido1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        contenido1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Código Estudiante:");
        contenido1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));
        contenido1.add(txtCdEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));
        contenido1.add(txtCdCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 120, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Hora:");
        contenido1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        contenido1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 290, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Código Curso:");
        contenido1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jPanel1.add(contenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 820, 190));

        or1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or1.setText("Aquí podes configurar las matrículas.");
        jPanel1.add(or1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 20));

        or2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or2.setText("En esta tabla estan los cursos disponibles:");
        jPanel1.add(or2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 290, -1));

        tittle1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tittle1.setText("CONFIGURACIÓN DE MATRÍCULAS");
        jPanel1.add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 420, 50));

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
        jPanel1.add(logoInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 90, 70));

        logoDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoDelMouseClicked(evt);
            }
        });
        jPanel1.add(logoDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 90, 70));

        logoUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoUpMouseClicked(evt);
            }
        });
        jPanel1.add(logoUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 90, 70));

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
            ps = cn.prepareStatement("SELECT * FROM Matricula WHERE numero_Matricula=?");
            ps.setInt(1, id);
            rs= ps.executeQuery();
            
            while(rs.next()){
                txtNroMatricula.setText(String.valueOf(id));
                txtCdEstudiante.setText(rs.getString("codigo_Estudiante"));
                txtCdCurso.setText(rs.getString("codigo_Curso"));
                txtDate.setText(rs.getString("fecha"));
                txtHora.setText(rs.getString("hora"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
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

    private void logoUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoUpMouseClicked
        try {
            int nroMatricula = Integer.parseInt(txtNroMatricula.getText());
            int codEstudiante = Integer.parseInt(txtCdEstudiante.getText());
            int codCurso = Integer.parseInt(txtCdCurso.getText());
            String fecha = txtDate.getText();
            String hora = txtHora.getText();

            String statusStr = null;
            int studentStatus = -1; // Valor inicial no válido
            boolean inputValid = false;

            // --- Bucle de Validación (SOLO PREGUNTA POR 1 O 2) ---
            while (!inputValid) {
                // 1. SOLICITAR EL ESTADO AL USUARIO
                statusStr = JOptionPane.showInputDialog(null,
                    "Ingrese el nuevo estado del estudiante (1 o 2):",
                    "Actualizar Estado",
                    JOptionPane.QUESTION_MESSAGE);

                if (statusStr == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return;
                }

                try {
                    studentStatus = Integer.parseInt(statusStr.trim());
                    if (studentStatus == 1 || studentStatus == 2) {
                        inputValid = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El estado debe ser 1 (Matriculado) o 2 (Retirado). Intente de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error de formato: Ingrese solo los números 1 o 2.");
                }
            }
            // --- FIN Bucle de Validación ---

            Matricula m = new Matricula(nroMatricula, codEstudiante, codCurso, fecha, hora);
            MatriculaService service = new MatriculaService();

            // 2. Llamar al servicio con el estado variable
            if(service.updateMatricula(m, studentStatus)){
                JOptionPane.showMessageDialog(null, "MATRÍCULA MODIFICADO");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR LA MATRÍCULA");
            }
            Cleanin();
            CharginTable();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato: Asegúrese de que los campos numéricos están completos y son válidos.");
        }
    }//GEN-LAST:event_logoUpMouseClicked

    private void logoDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoDelMouseClicked
        try {
            // 1. Validar que tengamos los datos mínimos necesarios
            if (txtNroMatricula.getText().trim().isEmpty() || txtCdEstudiante.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione una matrícula de la tabla para eliminar.");
                return;
            }

            // 2. Obtener datos clave de los textfields
            int nroMatricula = Integer.parseInt(txtNroMatricula.getText());
            int codEstudiante = Integer.parseInt(txtCdEstudiante.getText());

            // 3. Confirmación
            int confirm = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de eliminar esta matrícula?\nEl alumno volverá al estado 'Registrado' (0).",
                "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                // --- CORRECCIÓN AQUÍ ---
                // Tu clase Matricula obliga a pasar 5 datos.
                // Como para eliminar solo nos importa el ID y el Estudiante, llenamos el resto con 0 o "" (datos dummy).
                Matricula m = new Matricula(nroMatricula, codEstudiante, 0, "", "");

                MatriculaService service = new MatriculaService();

                // 4. Llamamos al servicio pasando '0' para que el alumno regrese a estado Registrado
                if(service.deleteMatricula(m, 0)){
                    JOptionPane.showMessageDialog(null, "MATRÍCULA ELIMINADA Y ALUMNO RESTAURADO A ESTADO 0");
                    Cleanin();      // Limpiar campos
                    CharginTable(); // Recargar tabla
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR. Verifique la base de datos.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato: Verifique que los códigos sean números válidos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
        }
    }//GEN-LAST:event_logoDelMouseClicked

    private void logoInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoInsertMouseClicked
        try {
            int nroMatricula = Integer.parseInt(txtNroMatricula.getText());
            int codEstudiante = Integer.parseInt(txtCdEstudiante.getText());
            int codCurso = Integer.parseInt(txtCdCurso.getText());
            String fecha = txtDate.getText();
            String hora = txtHora.getText();

            // --- CAMBIO CLAVE: Estado fijo a 1 (Matriculado) ---
            int studentStatus = 1;
            // ----------------------------------------------------

            Matricula m = new Matricula(nroMatricula, codEstudiante, codCurso, fecha, hora);
            MatriculaService service = new MatriculaService();

            // 2. Llamar al servicio con el estado fijo
            if(service.addMatricula(m, studentStatus)){
                JOptionPane.showMessageDialog(null, "MATRÍCULA REGISTRADA CON EXITO");

            }else{
                JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO DE LA MATRÍCULA");
            }
            CharginTable();
            Cleanin();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de formato: Asegúrese de que los campos numéricos están completos y son válidos.");
        }
    }//GEN-LAST:event_logoInsertMouseClicked

    
    
    
    
    
  private void Cleanin(){
        txtNroMatricula.setText("");
        txtCdEstudiante.setText("");
        txtCdCurso.setText("");
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
    
    // Se ajusta el array a 5 columnas: Matrícula, Estudiante, Curso, Fecha, Hora
    int[]length ={60, 100, 100, 70, 80}; 
    for(int i= 0; i<tb.getColumnCount();i++){
      tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
    }
    
    try {
        ConnectionDB connDB = new ConnectionDB();
        java.sql.Connection cn = connDB.getConnection();
        
        // --- CAMBIO CLAVE: SELECT * FROM Matricula (solo 5 columnas) ---
        String sql = "SELECT m.numero_Matricula, m.codigo_Estudiante, m.codigo_Curso, m.fecha, m.hora " +
             "FROM Matricula m INNER JOIN Alumno a ON m.codigo_Estudiante = a.cod_Alumno " +
             "WHERE a.estado = 1 ORDER BY m.fecha ASC;";
        
        ps = cn.prepareStatement(sql);
        
        rs=ps.executeQuery();
        rmds = rs.getMetaData();
        qeue = rmds.getColumnCount(); // qeue ahora será 5
        
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
        
  private void CharginTable2(String filtro){
    DefaultTableModel model = (DefaultTableModel) tb.getModel();
    model.setRowCount(0);

    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rmds;
    int qeue;
    boolean searched = false;

    // Se ajusta el array a 5 columnas: Matrícula, Estudiante, Curso, Fecha, Hora
    int[]length ={60, 100, 100, 70, 80}; 
    for(int i= 0; i<tb.getColumnCount();i++){
        tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
    }

    try {
        ConnectionDB connDB = new ConnectionDB();
        java.sql.Connection cn = connDB.getConnection();

        String sql;
        
        // Consulta base con 5 columnas
        String baseSelect = "SELECT numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora FROM matricula "; 

        if (filtro.equals("")) {
            // Caso 1: Sin filtro de búsqueda
            sql = baseSelect + "ORDER BY fecha ASC, numero_Matricula ASC;";
            ps = cn.prepareStatement(sql);
        } else {
            // Caso 2: Con filtro de búsqueda, buscamos por numero_Matricula
            sql = baseSelect + "WHERE numero_Matricula LIKE ? " +
                    "ORDER BY fecha ASC, numero_Matricula ASC;";
            ps = cn.prepareStatement(sql);
            ps.setString(1,"%"+filtro+ "%");
        }

        rs=ps.executeQuery();
        rmds = rs.getMetaData();
        qeue = rmds.getColumnCount(); // qeue = 5

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
                JOptionPane.showMessageDialog(null, "MATRÍCULA ENCONTRADA");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON MATRICULAS CON ESE CRITERIO");
                // Cleanin();
                // txtBuscado.setText("");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.toString());
    }
}
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtCdCurso;
    private javax.swing.JTextField txtCdEstudiante;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNroMatricula;
    // End of variables declaration//GEN-END:variables
}
