package wavecode.service;

/**
 *
 * @author FRANCIS
 */
import wavecode.dao.CourseDAO;
import wavecode.model.Course;

public class CourseService {
    
    private CourseDAO courseDAO;

    public CourseService (){
    courseDAO = new CourseDAO();
    }
     
    //this one is for convalidate and put/set the new course in database btw
    public boolean addCourse(Course course) {
        int result = courseDAO.addCourse(course);
        return result == 1;
    }
    
    //This is for modifying but actually needs a parameter for validate the function
    public boolean updateCourse(Course course) {
            int result = courseDAO.updateCourse(course);
            return result == 1;
    }
    
    //this one is for deleting a value btw
    public boolean deleteCourse(Course course) {
        int result = courseDAO.deleteCourse(course);
        return result == 1;
    }
}
