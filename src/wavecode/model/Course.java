package wavecode.model;

/**
 *
 * @author FRANCIS
 */
public class Course {
    private int codeCourse,semester,credits,hoursCourse;
    private String nameCourse;
    public Course() {
    }
    
    public Course(int codeCourse, String nameCourse, int semester, int credits, int hoursCourse) {
        this.codeCourse = codeCourse;
        this.nameCourse = nameCourse;
        this.semester = semester;
        this.credits = credits;
        this.hoursCourse = hoursCourse;
    }

    public int getCodeCourse() {
        return codeCourse;
    }

    public void setCodeCourse(int codeCourse) {
        this.codeCourse = codeCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getHoursCourse() {
        return hoursCourse;
    }

    public void setHoursCourse(int hoursCourse) {
        this.hoursCourse = hoursCourse;
    }   
    
    
}
