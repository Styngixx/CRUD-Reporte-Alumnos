package wavecode.service;

/**
 *
 * @author FRANCIS
 */
import wavecode.dao.StudentDAO;
import wavecode.model.Student;

public class StudentService {
    
    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO= new StudentDAO();
    }
    
    public boolean addStudent(Student s){
        int result = studentDAO.addStudent(s);
        return result ==1;
    }
    
    public boolean updateStudent(Student s){
        int result = studentDAO.updateStudent(s);
        return result ==1;
    }
    
    public boolean deleteStudent(Student s){
        int result = studentDAO.deleteStudent(s);
        return result ==1;
        
    }

    
    
}
