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

          
    //Adding method this bs is actually the best code ever 
    public int addMatricula(Matricula m){
        String sql ="INSERT INTO Matricula (numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora) VALUES(?,?,?,?,?);";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, m.getNroMatricula());
            ps.setInt(2, m.getCodEstudiante());
            ps.setInt(3, m.getCodCurso());
            ps.setString(4, m.getDate());
            ps.setString(5, m.getHora());
            return ps.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Error al registrar la matrícula: " + e.getMessage());
            return 0;
        }
    }

    //Updating a value which already exist LMAOooo
    public int updateMatricula(Matricula m){
        String sql = "UPDATE Matricula SET codigo_Estudiante=?, codigo_Curso=?, fecha=?, hora=?WHERE numero_Matricula=?;";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);            
            ps.setInt(1, m.getCodEstudiante());
            ps.setInt(2, m.getCodCurso());
            ps.setString(3, m.getDate());
            ps.setString(4, m.getHora());
            ps.setInt(5, m.getNroMatricula());
            return ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error al actualizar los valores de la matricula: " + e.getMessage());
            return 0;
        }        
    }
    
    //Deleting a value which already exist Lol and love this one cuz its easier than other functions btw
    public int deleteMatricula(Matricula m){
        String sql = "DELETE FROM Matricula  WHERE numero_Matricula=?; ";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, m.getNroMatricula());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos de la matricula: "+ e.getMessage());
            return 0;
        }        
    }
    
}
