package wavecode.ui;

import java.util.List;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import wavecode.database.ConnectionDB;
import wavecode.model.CourseSelected;

/**
 *
 * @author FRANCIS
 */
public class Prueba1 extends javax.swing.JFrame {
    private  Map<String, CourseSelected> mapaCursos = new HashMap<>();
    private List<CourseSelected>selecionados = new ArrayList<>();
  
    
    public Prueba1() {
        initComponents();
        CharginTable();
        CharginSchedule();

    }
    
        private void CharginSchedule(){
        paneHorario.setLayout(new GridLayout(13, 7)); // 12 horas + encabezado, 6 días + encabezado

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String[] horas = { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00"};

        // Primera fila: encabezados de días
         paneHorario.add(new JLabel("")); // esquina vacía
            for (String dia : dias) {
                JLabel lblDia = new JLabel(dia, SwingConstants.CENTER);
                lblDia.setForeground(Color.BLACK);
                paneHorario.add(lblDia);
            }

        // Resto de filas: hora + celdas vacías
            for (String hora : horas) {
                JLabel lblHora = new JLabel(hora);
                lblHora.setForeground(Color.BLACK);
                paneHorario.add(lblHora);

                for (int i = 0; i < dias.length; i++) {
                    JPanel celda = new JPanel();
                    celda.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                    celda.setBackground(new Color(121, 151, 199)); // fondo oscuro
                    paneHorario.add(celda);
                }
        }
            
     }
        
        private void CharginTable() {
            try {
                ConnectionDB connDB = new ConnectionDB();
                java.sql.Connection conn = connDB.getConnection();
                PreparedStatement ps = conn.prepareStatement(
                    "SELECT asignatura, horas, creditos, ciclo, codigo_Curso, dias, hora_inicio, hora_salida FROM Curso"
                );
                ResultSet rs = ps.executeQuery();

                DefaultTableModel model = (DefaultTableModel) tb.getModel();
                model.setRowCount(0); // limpia la tabla

                while (rs.next()) {
                    Object[] fila = new Object[9];
                    fila[0] = rs.getString("asignatura");
                    fila[1] = rs.getString("horas");
                    fila[2] = rs.getString("creditos");
                    fila[3] = rs.getString("ciclo");
                    fila[4] = rs.getString("codigo_Curso");
                    fila[5] = rs.getString("dias");
                    fila[6] = rs.getString("hora_inicio");
                    fila[7] = rs.getString("hora_salida");
                    fila[8] = "Agregar";
                    model.addRow(fila);

                    //  CORRECCIÓN AQUÍ: convertir días
                    List<String> diasConvertidos = convertirDias(rs.getString("dias"));
                    String horaInicio = rs.getString("hora_inicio").substring(0, 5); // "08:00"
                    String horaFin = rs.getString("hora_salida").substring(0, 5);     // "10:00"

                    CourseSelected curso = new CourseSelected(
                        rs.getString("asignatura"),
                        diasConvertidos,
                        horaInicio,
                        horaFin
                    );
                    mapaCursos.put(rs.getString("asignatura"), curso);
                }

                tb.getColumnModel().getColumn(8).setCellRenderer(new ButtonRenderer());
                tb.getColumnModel().getColumn(8).setCellEditor(new ButtonEditor(new JCheckBox()));

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.toString());
            }
        }

        
     class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
            setBackground(new Color(30, 144, 255)); // azul
            setForeground(Color.WHITE);
            setFont(new Font("Arial", Font.BOLD, 12));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Agregar" : value.toString());
            return this;
            }
        }

        class ButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean clicked;
        private int row;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.setBackground(new Color(69, 98, 143));
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Arial", Font.BOLD, 12));

            button.addActionListener(e -> fireEditingStopped());
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
            this.row = row;
            label = (value == null) ? "Agregar" : value.toString();
            button.setText(label);
            clicked = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (clicked) {
                String nombreCurso = tb.getValueAt(row, 0).toString();
                CourseSelected curso = mapaCursos.get(nombreCurso);
                selecionados.add(curso);
                actualizarHorario(paneHorario, selecionados);
            }
            clicked = false;
            return label;
        }


        @Override
        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }
    }
        

    private void actualizarHorario(JPanel paneHorario, List<CourseSelected> cursosSeleccionados) {
        paneHorario.removeAll();
        paneHorario.setLayout(new GridLayout(13, 7));

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String[] horas = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00"};

        paneHorario.add(new JLabel(""));
        for (String dia : dias) {
            JLabel lblDia = new JLabel(dia, SwingConstants.CENTER);
            lblDia.setForeground(Color.BLACK);
            paneHorario.add(lblDia);
        }

        for (String hora : horas) {
            JLabel lblHora = new JLabel(hora);
            lblHora.setForeground(Color.BLACK);
            paneHorario.add(lblHora);

            for (String dia : dias) {
                JPanel celda = new JPanel();
                celda.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                celda.setBackground(new Color(121, 151, 199));

                for (CourseSelected curso : cursosSeleccionados) {
                    if (curso.getDias().contains(dia) && curso.getHoraInicio().equals(hora)) {
                        celda.setBackground(new Color(69, 98, 143));
                        celda.add(new JLabel("<html><center>" + curso.getNombre() + "<br>" + curso.getHoraInicio() + "</center></html>"));
                    }
                }

                paneHorario.add(celda);
            }
        }

        paneHorario.revalidate();
        paneHorario.repaint();
    }

        private List<String> convertirDias(String diasBD) {
        List<String> lista = new ArrayList<>();
        if (diasBD.contains("Lun")) lista.add("Lunes");
        if (diasBD.contains("Mar")) lista.add("Martes");
        if (diasBD.contains("Mie")) lista.add("Miércoles");
        if (diasBD.contains("Jue")) lista.add("Jueves");
        if (diasBD.contains("Vie")) lista.add("Viernes");
        if (diasBD.contains("Sab")) lista.add("Sábado");
        return lista;
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroung = new javax.swing.JPanel();
        paneHorario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout paneHorarioLayout = new javax.swing.GroupLayout(paneHorario);
        paneHorario.setLayout(paneHorarioLayout);
        paneHorarioLayout.setHorizontalGroup(
            paneHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        paneHorarioLayout.setVerticalGroup(
            paneHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        backgroung.add(paneHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 940, 310));

        jLabel2.setText("jLabel2");
        backgroung.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 186, 50, 50));

        jLabel3.setText("jLabel3");
        backgroung.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 246, 50, 50));

        jLabel4.setText("jLabel4");
        backgroung.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 306, 50, 50));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cursos", "Horas Semanales", "Creditos", "Ciclo", "Sección", "Dias", "Inicio", "Salida", "Acción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb);

        backgroung.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 920, 200));

        jLabel1.setText("jLabel1");
        backgroung.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, 100, 50));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wavecode/images/wavecodeEstudiante.png"))); // NOI18N
        backgroung.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JPanel paneHorario;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
