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
        matriculaDAO = new MatriculaDAO();
    }
    
// Método para registrar matrícula
    // Recibe el objeto Matricula y el nuevo estado del alumno (generalmente 1: Matriculado)
    public boolean addMatricula(Matricula m, int studentStatus){
        // El DAO se encarga de la transacción (Insertar Matrícula + Actualizar Alumno)
        int result = matriculaDAO.addMatricula(m, studentStatus);
        return result > 0;
    }
    
    // Método para actualizar matrícula
    // Recibe el objeto Matricula y el nuevo estado (si se requiere cambiar)
    public boolean updateMatricula(Matricula m, int studentStatus){
        int result = matriculaDAO.updateMatricula(m, studentStatus);
        return result > 0;
    }
    
    // Método para eliminar matrícula
    // Recibe el objeto Matricula y el nuevo estado del alumno (generalmente 0: Registrado)
    public boolean deleteMatricula(Matricula m, int studentStatus){
        int result = matriculaDAO.deleteMatricula(m, studentStatus);
        return result > 0;
    }
}

    
  
