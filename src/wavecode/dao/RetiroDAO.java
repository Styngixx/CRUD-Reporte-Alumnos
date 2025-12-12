package wavecode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import wavecode.database.ConnectionDB;
import wavecode.model.Retiro;
import java.sql.*;

/**
 *
 * @author FRANCIS
 */
public class RetiroDAO {
        private final Connection cnn;

     public RetiroDAO() {
        ConnectionDB connDB = new ConnectionDB();
        this.cnn = connDB.getConnection();
    }   
         
   // Método para registrar el retiro.
    // Cambia el estado del alumno de 1 (Matriculado) a 2 (Retirado).
    public int addRetiro(Retiro r, int studentStatus){
        String sqlGetStudent = "SELECT codigo_Estudiante FROM Matricula WHERE numero_Matricula = ?";
        String sqlRetiro ="INSERT INTO Retiro (numero_Retiro, matricula, fecha, hora) VALUES(?,?,?,?);";
        String sqlUpdateAlumno = "UPDATE Alumno SET estado = ? WHERE cod_Alumno = ?;"; 
        
        try {
            cnn.setAutoCommit(false); // Iniciar transacción

            // 1. Obtener el código del alumno a partir de la matrícula
            // Esto es necesario para saber a qué alumno actualizarle el estado
            int codEstudiante = -1;
            PreparedStatement psGet = cnn.prepareStatement(sqlGetStudent);
            psGet.setInt(1, r.getMatricula());
            ResultSet rs = psGet.executeQuery();
            
            if (rs.next()) {
                codEstudiante = rs.getInt("codigo_Estudiante");
            } else {
                // Si la matrícula no existe, no podemos continuar
                cnn.rollback();
                return 0;
            }

            // 2. Insertar el Retiro
            PreparedStatement psRetiro = cnn.prepareStatement(sqlRetiro);
            psRetiro.setInt(1, r.getNroRetiro());
            psRetiro.setInt(2, r.getMatricula());
            psRetiro.setString(3, r.getFecha());
            psRetiro.setString(4, r.getHora());
            psRetiro.executeUpdate(); 
            
            // 3. Actualizar el estado del alumno (a 2)
            PreparedStatement psUpdateAlumno = cnn.prepareStatement(sqlUpdateAlumno);
            psUpdateAlumno.setInt(1, studentStatus); 
            psUpdateAlumno.setInt(2, codEstudiante);
            psUpdateAlumno.executeUpdate();
            
            cnn.commit(); // Confirmar cambios
            return 1;

        } catch (SQLException e) {
            System.out.println("Error al registrar el retiro: " + e.getMessage());
            try { cnn.rollback(); } catch (SQLException ex) {} // Deshacer
            return 0;
        } finally {
            try { cnn.setAutoCommit(true); } catch (SQLException ex) {}
        }
    }   
    
    // Método para actualizar datos del retiro (fecha, hora, etc.)
    public int updateRetiro(Retiro r, int studentStatus){
        // Primero necesitamos saber el alumno actual por si cambió la matrícula asociada
        String sqlGetStudent = "SELECT codigo_Estudiante FROM Matricula WHERE numero_Matricula = ?";
        String sqlRetiro = "UPDATE Retiro SET matricula=?, fecha=?, hora=? WHERE numero_Retiro=?;";
        String sqlUpdateAlumno = "UPDATE Alumno SET estado = ? WHERE cod_Alumno = ?;"; 
        
        try {
            cnn.setAutoCommit(false);

            // 1. Obtener ID alumno (para asegurar consistencia)
            int codEstudiante = -1;
            PreparedStatement psGet = cnn.prepareStatement(sqlGetStudent);
            psGet.setInt(1, r.getMatricula());
            ResultSet rs = psGet.executeQuery();
            if (rs.next()) {
                codEstudiante = rs.getInt("codigo_Estudiante");
            } else {
                cnn.rollback(); return 0;
            }

            // 2. Actualizar el Retiro
            PreparedStatement psRetiro = cnn.prepareStatement(sqlRetiro);            
            psRetiro.setInt(1, r.getMatricula());
            psRetiro.setString(2, r.getFecha());
            psRetiro.setString(3, r.getHora());
            psRetiro.setInt(4, r.getNroRetiro());
            psRetiro.executeUpdate();            
            
            // 3. Reafirmar el estado del alumno (generalmente sigue siendo 2)
            PreparedStatement psUpdateAlumno = cnn.prepareStatement(sqlUpdateAlumno);
            psUpdateAlumno.setInt(1, studentStatus); 
            psUpdateAlumno.setInt(2, codEstudiante);
            psUpdateAlumno.executeUpdate();

            cnn.commit();
            return 1;            

        } catch (SQLException e) {
           System.out.println("Error al actualizar el retiro: " + e.getMessage());
           try { cnn.rollback(); } catch (SQLException ex) {}
           return 0;
        } finally {
            try { cnn.setAutoCommit(true); } catch (SQLException ex) {}
        }       
    }
    
    // Método para eliminar retiro.
    // IMPORTANTE: Restaura el estado del alumno a 1 (Matriculado).
    public int deleteRetiro(Retiro r, int studentStatus){
        // Consulta para encontrar al alumno a través del retiro antes de borrarlo
        String sqlGetStudentFromRetiro = 
                "SELECT m.codigo_Estudiante FROM Retiro r " +
                "JOIN Matricula m ON r.matricula = m.numero_Matricula " +
                "WHERE r.numero_Retiro = ?";
        
        String sqlRetiro = "DELETE FROM Retiro WHERE numero_Retiro=?; ";
        String sqlUpdateAlumno = "UPDATE Alumno SET estado = ? WHERE cod_Alumno = ?;";
        
        try {
            cnn.setAutoCommit(false);

            // 1. Averiguar qué alumno está implicado en este retiro
            int codEstudiante = -1;
            PreparedStatement psGet = cnn.prepareStatement(sqlGetStudentFromRetiro);
            psGet.setInt(1, r.getNroRetiro());
            ResultSet rs = psGet.executeQuery();
            
            if(rs.next()){
                codEstudiante = rs.getInt("codigo_Estudiante");
            } else {
                // Si no se encuentra el retiro o el alumno, abortar
                cnn.rollback();
                return 0;
            }

            // 2. Eliminar el Retiro
            PreparedStatement psRetiro = cnn.prepareStatement(sqlRetiro);
            psRetiro.setInt(1, r.getNroRetiro());
            psRetiro.executeUpdate();
            
            // 3. Restaurar el estado del alumno (a 1)
            PreparedStatement psUpdateAlumno = cnn.prepareStatement(sqlUpdateAlumno);
            psUpdateAlumno.setInt(1, studentStatus); 
            psUpdateAlumno.setInt(2, codEstudiante);
            psUpdateAlumno.executeUpdate();

            cnn.commit();
            return 1;

        } catch (SQLException e) {
            System.out.println("Error al eliminar el retiro: "+ e.getMessage());
            try { cnn.rollback(); } catch (SQLException ex) {}
            return 0;
        } finally {
            try { cnn.setAutoCommit(true); } catch (SQLException ex) {}
        }       
    }
}