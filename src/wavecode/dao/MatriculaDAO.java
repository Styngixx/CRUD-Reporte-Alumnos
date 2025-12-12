package wavecode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import wavecode.database.ConnectionDB;
import wavecode.model.Matricula;

/**
 *
 * @author FRANCIS
 */
public class MatriculaDAO {
    private final Connection cnn;

     public MatriculaDAO() {
        ConnectionDB connDB = new ConnectionDB();
        this.cnn = connDB.getConnection();
    }   
    // Método para agregar matrícula y cambiar estado del alumno (normalmente a 1)
    public int addMatricula(Matricula m, int studentStatus){ 
        String sqlMatricula = "INSERT INTO Matricula (numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora) VALUES(?,?,?,?,?);";
        String sqlUpdateAlumno = "UPDATE Alumno SET estado = ? WHERE cod_Alumno = ?;";
        
        try {
            // 1. Desactivar auto-guardado para iniciar transacción
            cnn.setAutoCommit(false); 

            // 2. Insertar la matrícula
            PreparedStatement psMatricula = cnn.prepareStatement(sqlMatricula);
            psMatricula.setInt(1, m.getNroMatricula());
            psMatricula.setInt(2, m.getCodEstudiante());
            psMatricula.setInt(3, m.getCodCurso());
            psMatricula.setString(4, m.getDate());
            psMatricula.setString(5, m.getHora());
            psMatricula.executeUpdate(); 
            
            // 3. Actualizar el estado del alumno (ej: de 0 a 1)
            PreparedStatement psUpdateAlumno = cnn.prepareStatement(sqlUpdateAlumno);
            psUpdateAlumno.setInt(1, studentStatus); 
            psUpdateAlumno.setInt(2, m.getCodEstudiante());
            psUpdateAlumno.executeUpdate();

            // 4. Si todo salió bien, guardamos los cambios definitivamente
            cnn.commit(); 
            return 1; 

        } catch (SQLException e) {
            System.out.println("Error al registrar matrícula: " + e.getMessage());
            try {
                // 5. Si algo falló, deshacemos TODO (Rollback)
                cnn.rollback(); 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return 0;
        } finally {
            try {
                // Restaurar el modo normal
                cnn.setAutoCommit(true); 
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método para actualizar datos de matrícula y estado del alumno
    public int updateMatricula(Matricula m, int studentStatus){
        String sqlMatricula = "UPDATE Matricula SET codigo_Estudiante=?, codigo_Curso=?, fecha=?, hora=? WHERE numero_Matricula=?;";
        String sqlUpdateAlumno = "UPDATE Alumno SET estado = ? WHERE cod_Alumno = ?;";
        
        try {
            cnn.setAutoCommit(false); // Iniciar transacción

            // 1. Actualizar la matrícula
            PreparedStatement psMatricula = cnn.prepareStatement(sqlMatricula);            
            psMatricula.setInt(1, m.getCodEstudiante());
            psMatricula.setInt(2, m.getCodCurso());
            psMatricula.setString(3, m.getDate());
            psMatricula.setString(4, m.getHora());
            psMatricula.setInt(5, m.getNroMatricula());
            psMatricula.executeUpdate();            
            
            // 2. Actualizar el estado del alumno
            PreparedStatement psUpdateAlumno = cnn.prepareStatement(sqlUpdateAlumno);
            psUpdateAlumno.setInt(1, studentStatus); 
            psUpdateAlumno.setInt(2, m.getCodEstudiante());
            psUpdateAlumno.executeUpdate();

            cnn.commit(); // Confirmar cambios
            return 1;            

        } catch (SQLException e) {
            System.out.println("Error al actualizar matrícula: " + e.getMessage());
            try { cnn.rollback(); } catch (SQLException ex) {} // Deshacer cambios
            return 0;
        } finally {
            try { cnn.setAutoCommit(true); } catch (SQLException ex) {}
        }     
    }
    
    // Método para eliminar matrícula y restaurar estado del alumno (normalmente a 0)
    public int deleteMatricula(Matricula m, int studentStatus){
        String sqlMatricula = "DELETE FROM Matricula WHERE numero_Matricula=?;";
        String sqlUpdateAlumno = "UPDATE Alumno SET estado = ? WHERE cod_Alumno = ?;";
        
        try {
            cnn.setAutoCommit(false); // Iniciar transacción

            // 1. Eliminar la matrícula
            PreparedStatement psMatricula = cnn.prepareStatement(sqlMatricula);
            psMatricula.setInt(1, m.getNroMatricula());
            psMatricula.executeUpdate();
            
            // 2. Actualizar el estado del alumno (ej: de 1 a 0)
            PreparedStatement psUpdateAlumno = cnn.prepareStatement(sqlUpdateAlumno);
            psUpdateAlumno.setInt(1, studentStatus); 
            psUpdateAlumno.setInt(2, m.getCodEstudiante());
            psUpdateAlumno.executeUpdate();
            
            cnn.commit(); // Confirmar cambios
            return 1;

        } catch (SQLException e) {
            System.out.println("Error al eliminar matrícula: " + e.getMessage());
            try { cnn.rollback(); } catch (SQLException ex) {} // Deshacer cambios
            return 0;
        } finally {
            try { cnn.setAutoCommit(true); } catch (SQLException ex) {}
        }      
    }
}