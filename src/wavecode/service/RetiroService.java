package wavecode.service;

import wavecode.dao.RetiroDAO;
import wavecode.model.Retiro;

/**
 *
 * @author FRANCIS
 */
public class RetiroService {
    private RetiroDAO retiroDaO;

    public RetiroService() {
        retiroDaO = new RetiroDAO();
    }
    
    // Ahora acepta el estado para pasarlo al DAO
    public boolean addRetiro(Retiro r, int studentStatus){
        // El DAO devuelve la suma de filas afectadas (Retiro + Alumno), por lo que usamos > 0
        int result = retiroDaO.addRetiro(r, studentStatus);
        return result > 0;
    }
    
    // Ahora acepta el estado para pasarlo al DAO
    public boolean updateRetiro(Retiro r, int studentStatus){
        int result = retiroDaO.updateRetiro(r, studentStatus);
        return result > 0;
    }
    
    // Ahora acepta el estado para pasarlo al DAO
    public boolean deleteRetiro(Retiro r, int studentStatus){
        int result = retiroDaO.deleteRetiro(r, studentStatus);
        return result > 0;
        
    }
    
}
