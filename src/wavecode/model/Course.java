package wavecode.model;

/**
 *
 * @author FRANCIS
 */
public class Course {
    private int codeCourse;
    private String nameCourse;
    private int semester,credits,hoursCourse;
    private String dias;
    private String horarioEntrada, horarioSalida;
    
    public Course() {
    }

    public Course(int codeCourse, String nameCourse, int semester, int credits, int hoursCourse, String dias, String horarioEntrada, String horarioSalida) {
        this.codeCourse = codeCourse;
        this.nameCourse = nameCourse;
        this.semester = semester;
        this.credits = credits;
        this.hoursCourse = hoursCourse;
        this.dias = dias;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
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

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }
    
    
}
