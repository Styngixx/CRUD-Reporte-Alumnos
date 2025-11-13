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
        retiroDaO= new RetiroDAO();
    }
    
    public boolean addRetiro(Retiro r){
        int result = retiroDaO.addRetiro(r);
        return result ==1;
    }
    
    public boolean updateRetiro(Retiro r){
        int result = retiroDaO.updateRetiro(r);
        return result ==1;
    }
    
    public boolean deleteRetiro(Retiro r){
        int result = retiroDaO.deleteRetiro(r);
        return result ==1;
        
    }

    
}
