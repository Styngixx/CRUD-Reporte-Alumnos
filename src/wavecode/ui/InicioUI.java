package wavecode.ui;

import wavecode.ui.CourseUI;
import wavecode.ui.StudentUI;

/**
 *
 * @author FRANCIS
 */
public class InicioUI extends javax.swing.JFrame {

    public InicioUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        Clientes = new javax.swing.JCheckBoxMenuItem();
        menuProductos = new javax.swing.JMenu();
        Productos = new javax.swing.JCheckBoxMenuItem();
        menuMatricula = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 158, 158));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        menuClientes.setText("Alumnos");

        Clientes.setSelected(true);
        Clientes.setText("Ejercicio 1");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        menuClientes.add(Clientes);

        menu.add(menuClientes);

        menuProductos.setText("Curso");

        Productos.setSelected(true);
        Productos.setText("Ejercicio 2");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        menuProductos.add(Productos);

        menu.add(menuProductos);

        menuMatricula.setText("Matrícula");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Ejercicio 3");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatriculasActionPerformed(evt);
            }
        });
        menuMatricula.add(jCheckBoxMenuItem1);

        menu.add(menuMatricula);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
        wavecode.ui.StudentUI inter1 =  new StudentUI();
        inter1.setVisible(true);
    }//GEN-LAST:event_ClientesActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        // TODO add your handling code here:
        wavecode.ui.CourseUI inter2 =  new CourseUI();
        inter2.setVisible(true);
    }//GEN-LAST:event_ProductosActionPerformed

    private void MatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculasActionPerformed
        // TODO add your handling code here:
        MatriculaUI inter3 = new MatriculaUI();
        inter3.setVisible(true);
    }//GEN-LAST:event_MatriculasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem Clientes;
    private javax.swing.JCheckBoxMenuItem Productos;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuMatricula;
    private javax.swing.JMenu menuProductos;
    // End of variables declaration//GEN-END:variables
}
