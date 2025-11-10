package wavecode.dao;

/**
 *
 * @author FRANCIS
 */

import java.sql.*;

import wavecode.model.Student;
import wavecode.database.ConnectionDB;

public class StudentDAO {
    private final Connection cnn;

    public StudentDAO() {
        ConnectionDB connDB = new ConnectionDB();
        this.cnn = connDB.getConnection();
    }
    
    //Adding method this bs is actually the best code ever 
    public int addStudent(Student s){
        String sql ="INSERT INTO Alumno (cod_Alumno, nombres, apellidos, dni, edad, celular, estado) VALUES(?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, s.getCodeStudent());
            ps.setString(2, s.getName());
            ps.setString(3, s.getSurname());
            ps.setInt(4, s.getDni());
            ps.setInt(5, s.getAge());
            ps.setInt(6, s.getPhone());
            ps.setInt(1, s.getStatus());
            return ps.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Error al registrar al estudiante: " + e.getMessage());
            return 0;
        }
    }

    //Updating a value which already exist LMAOooo
    public int updateStudent(Student s){
        String sql = "UPDATE Alumno SET nombres=?, apellidos=?, dni=?, edad=?, celular=?, estado=? WHERE cod_Alumno=?;";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getSurname());
            ps.setInt(3, s.getDni());
            ps.setInt(4, s.getAge());
            ps.setInt(5, s.getPhone());
            ps.setInt(6, s.getStatus());
            ps.setInt(7, s.getCodeStudent());
            return ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error al actualizar los valores del alumno: " + e.getMessage());
            return 0;
        }        
    }
    
    //Deleting a value which already exist Lol and love this one cuz its easier than other functions btw
    public int deleteStudent(Student s){
        String sql = "DELETE FROM Alumno  WHERE cod_Alumno=?; ";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, s.getCodeStudent());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos del alumno: "+ e.getMessage());
            return 0;
        }        
    }
            
    
    
    
}
