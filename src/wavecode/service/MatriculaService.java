package wavecode.service;

import wavecode.dao.MatriculaDAO;
import wavecode.model.Matricula;

/**
 *
 * @author FRANCIS
 */
public class MatriculaService {    
    
        private MatriculaDAO matriculaDAO;

    public MatriculaService() {
        matriculaDAO= new MatriculaDAO();
    }
    
    public boolean addMatricula(Matricula m){
        int result = matriculaDAO.addMatricula(m);
        return result ==1;
    }
    
    public boolean updateMatricula(Matricula m){
        int result = matriculaDAO.updateMatricula(m);
        return result ==1;
    }
    
    public boolean deleteMatricula(Matricula m){
        int result = matriculaDAO.deleteMatricula(m);
        return result ==1;
        
    }

    
    
}
