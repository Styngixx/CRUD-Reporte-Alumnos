package wavecode.ui;

/**
 *
 * @author FRANCIS
 */
import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import wavecode.database.ConnectionDB;
import wavecode.model.Course;
import wavecode.panels.CoursePane;
import wavecode.model.icon;
import wavecode.service.CourseService;

public class MainUI extends javax.swing.JFrame {
    
    icon ic = new icon();
    public MainUI() {        
        initComponents();
        ic.setHighQualityImage(logoHome, "src/wavecode/images/homeLogo.png");
        ic.setHighQualityImage(logoWaveCode, "src/wavecode/images/Wavecode.png");
        ic.setHighQualityImage(labelAgregar, "src/wavecode/images/masLogo.png");
        ic.setHighQualityImage(labelUpdate, "src/wavecode/images/actualizarLogo.png");
        ic.setHighQualityImage(labelDelete, "src/wavecode/images/Delete.png");
        CharginTable();

    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logoHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        fondoNegro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bg1 = new javax.swing.JPanel();
        contenido1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        labelAgregar = new javax.swing.JLabel();
        labelUpdate = new javax.swing.JLabel();
        labelDelete = new javax.swing.JLabel();
        tittle1 = new javax.swing.JLabel();
        or1 = new javax.swing.JLabel();
        or2 = new javax.swing.JLabel();
        bgTable = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        tittle = new javax.swing.JLabel();
        logoWaveCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(28, 113, 198));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(logoHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cursos");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(logo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 690));

        fondoNegro.setBackground(new java.awt.Color(255, 255, 255));

        bg1.setBackground(new java.awt.Color(255, 255, 255));
        bg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Aqui estan los datos del curso ");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("seleccionado:");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Código del curso:");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Asignatura:");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ciclo:");

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Créditos:");

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Horas:");

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Dias:");

        labelAgregar.setFont(new java.awt.Font("Roboto ExtraBold", 1, 14)); // NOI18N
        labelAgregar.setForeground(new java.awt.Color(0, 0, 0));
        labelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAgregarMouseClicked(evt);
            }
        });

        labelUpdate.setText("jLabel1");
        labelUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUpdateMouseClicked(evt);
            }
        });

        labelDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenido1Layout = new javax.swing.GroupLayout(contenido1);
        contenido1.setLayout(contenido1Layout);
        contenido1Layout.setHorizontalGroup(
            contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(txtCredits)
                                .addComponent(txtCiclo)
                                .addComponent(txtAsignatura)
                                .addComponent(txtCdCurso)
                                .addComponent(txtDias, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(contenido1Layout.createSequentialGroup()
                                .addComponent(labelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        contenido1Layout.setVerticalGroup(
            contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenido1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(labelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
        );

        bg1.add(contenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 260, 510));

        tittle1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tittle1.setForeground(new java.awt.Color(0, 0, 0));
        tittle1.setText("Hola Administrador + nombredelAdministrador");
        bg1.add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 550, 80));

        or1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or1.setForeground(new java.awt.Color(0, 0, 0));
        or1.setText("Aquí podes configurar los cursos.");
        bg1.add(or1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 300, 20));

        or2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        or2.setForeground(new java.awt.Color(0, 0, 0));
        or2.setText("En esta tabla estan los cursos disponibles:");
        bg1.add(or2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, -1));

        bgTable.setBackground(new java.awt.Color(126, 152, 179));

        tb.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código ", "Asignatura", "Ciclo", "Créditos", "Horas"
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

        javax.swing.GroupLayout bgTableLayout = new javax.swing.GroupLayout(bgTable);
        bgTable.setLayout(bgTableLayout);
        bgTableLayout.setHorizontalGroup(
            bgTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        bgTableLayout.setVerticalGroup(
            bgTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        bg1.add(bgTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tittle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setText("Hola Administrador + nombredelAdministrador");

        javax.swing.GroupLayout fondoNegroLayout = new javax.swing.GroupLayout(fondoNegro);
        fondoNegro.setLayout(fondoNegroLayout);
        fondoNegroLayout.setHorizontalGroup(
            fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoNegroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fondoNegroLayout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoNegroLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(logoWaveCode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondoNegroLayout.setVerticalGroup(
            fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoNegroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(fondoNegroLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logoWaveCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(fondoNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 890, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        CoursePane cp = new CoursePane();
        mostrarPanel(cp);
    }//GEN-LAST:event_jPanel3MouseClicked

            private void Cleanin(){
        txtCdCurso.setText("");
        txtAsignatura.setText("");
        txtCiclo.setText("");
        txtCredits.setText("");
        txtHoras.setText("");
    }
    
      private void CharginTable(){
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        model.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rmds;
        int qeue;
        
        int[]length ={60,210,40,40,40};
        for(int i= 0; i<tb.getColumnCount();i++){
         tb.getColumnModel().getColumn(i).setPreferredWidth(length[i]);
        }
        
        try {
            ConnectionDB connDB = new ConnectionDB();
            Connection cn = connDB.getConnection();
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
         private void SetImageLabel(JLabel label, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                           image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
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
                txtCdCurso.setText(String.valueOf(id));
                txtAsignatura.setText(rs.getString("asignatura"));
                txtCiclo.setText(rs.getString("ciclo"));
                txtCredits.setText(rs.getString("creditos"));
                txtHoras.setText(rs.getString("horas"));
                //                txtDias.setText(rs.getString("dias"));
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbMouseClicked

    private void labelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgregarMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdCurso.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCredits.getText());
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
    }//GEN-LAST:event_labelAgregarMouseClicked

    private void labelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdCurso.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCredits.getText());
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
    }//GEN-LAST:event_labelUpdateMouseClicked

    private void labelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseClicked
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtCdCurso.getText());
        String asignatura = txtAsignatura.getText();
        int ciclo = Integer.parseInt(txtCiclo.getText());
        int creditos = Integer.parseInt(txtCredits.getText());
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
    }//GEN-LAST:event_labelDeleteMouseClicked

        private void mostrarPanel(JPanel p){
//        p.setSize(890, 690);
//        p.setLocation(0,0);
//        
//        contenido.removeAll();
//        contenido.add(p, BorderLayout.CENTER);
//        contenido.revalidate();
//        contenido. repaint(); 
}
      
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bgTable;
    private javax.swing.JPanel contenido1;
    private javax.swing.JPanel fondoNegro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelAgregar;
    private javax.swing.JLabel labelDelete;
    private javax.swing.JLabel labelUpdate;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logoHome;
    private javax.swing.JLabel logoWaveCode;
    private javax.swing.JLabel or1;
    private javax.swing.JLabel or2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tb;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel tittle1;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtCdCurso;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
