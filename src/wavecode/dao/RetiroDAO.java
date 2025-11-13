package wavecode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import wavecode.database.ConnectionDB;
import wavecode.model.Retiro;

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
         
    //Adding method this bs is actually the best code ever 
    public int addRetiro(Retiro r){
        String sql ="INSERT INTO Retiro (numero_Retiro, matricula, fecha, hora) VALUES(?,?,?,?);";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, r.getNroRetiro());
            ps.setInt(2, r.getMatricula());
            ps.setString(3, r.getFecha());
            ps.setString(4, r.getHora());
            return ps.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Error al registrar el retiro: " + e.getMessage());
            return 0;
        }
    }   
    
    //Updating a value which already exist LMAOooo
    public int updateRetiro(Retiro r){
        String sql = "UPDATE Retiro SET matricula=?, fecha=?, hora=? WHERE numero_Retiro=?;";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);            
            ps.setInt(1, r.getMatricula());
            ps.setString(2, r.getFecha());
            ps.setString(3, r.getHora());
            ps.setInt(4, r.getNroRetiro());
            return ps.executeUpdate();            
        } catch (SQLException e) {
           System.out.println("Error al actualizar los valores del retiro: " + e.getMessage());
            return 0;
        }        
    }
    
    //Deleting a value which already exist Lol and love this one cuz its easier than other functions btw
    public int deleteRetiro(Retiro r){
        String sql = "DELETE FROM Retiro  WHERE numero_Retiro=?; ";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, r.getNroRetiro());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos del retiro: "+ e.getMessage());
            return 0;
        }        
    }
    
}
