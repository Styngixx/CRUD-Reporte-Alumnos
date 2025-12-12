package wavecode.dao;

/**
 *
 * @author FRANCIS
 */

import java.sql.*;

import wavecode.model.Course;        
import wavecode.database.ConnectionDB;

public class CourseDAO {
    private final Connection conn;
    

    public CourseDAO() {
        ConnectionDB connDB = new ConnectionDB();
        this.conn = connDB.getConnection();
    }
      
    //This method is for adding a new one in database
    public int addCourse(Course c) {
        String sql = "INSERT INTO curso (codigo_Curso, asignatura, ciclo, creditos, horas, dias, hora_inicio, hora_salida)  VALUES(?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getCodeCourse());
            ps.setString(2, c.getNameCourse());
            ps.setInt(3, c.getSemester());
            ps.setInt(4, c.getCredits());
            ps.setInt(5, c.getHoursCourse());
            ps.setString(6, c.getDias());
            ps.setString(7, c.getHorarioEntrada());
            ps.setString(8, c.getHorarioSalida());
            return ps.executeUpdate(); // devuelve 1 si se insertó correctamente
        } catch (SQLException e) {
            System.out.println("Error al registrar el curso: " + e.getMessage());
            return 0;
        }
    }
    
    //This method is for modify/update one of database value
    public int updateCourse(Course c) {        
        String sql = "UPDATE curso SET asignatura = ?, ciclo = ?, creditos = ?, horas = ?, dias =?,  hora_inicio=?, hora_salida=? WHERE codigo_Curso = ?;";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);            
            pstmt.setString(1, c.getNameCourse());
            pstmt.setInt(2, c.getSemester());
            pstmt.setInt(3, c.getCredits());
            pstmt.setInt(4, c.getHoursCourse());            
            pstmt.setString(5, c.getDias());
            pstmt.setString(6, c.getHorarioEntrada());
            pstmt.setString(7, c.getHorarioSalida());
            pstmt.setInt(8, c.getCodeCourse());
            return pstmt.executeUpdate(); // devuelve 1 si se insertó correctamente
        } catch (SQLException e) {
            System.out.println("Error al actualizar el curso: " + e.getMessage());
            return 0;
        }
    }
    
    public boolean hasStudents(int codeCourse) {
    String sql = "SELECT COUNT(*) FROM Matricula WHERE codigo_Curso = ?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, codeCourse);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Retorna true si hay alumnos
        }
    } catch (SQLException e) {
        System.out.println("Error al verificar alumnos en curso: " + e.getMessage());
    }
    return false;
}
    
    ////This method is for eliminate one of database value
public int deleteCourse(Course c) {
    if (hasStudents(c.getCodeCourse())) {
        // Retornamos -1 para indicar que no se puede borrar por restricción
        return -1; 
    }
    String sql = "DELETE FROM curso WHERE codigo_Curso=?;";
    try {
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, c.getCodeCourse());
        return pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error al eliminar el curso: " + e.getMessage());
        return 0;
    }
    
} 
    
}


