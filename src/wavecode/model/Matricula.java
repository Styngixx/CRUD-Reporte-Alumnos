package wavecode.model;

/**
 *
 * @author FRANCIS
 */
public class Matricula {
    
    private int nroMatricula, codEstudiante, codCurso;
    private String date, hora;

    public Matricula(int nroMatricula, int codEstudiante, int codCurso, String date, String hora) {
        this.nroMatricula = nroMatricula;
        this.codEstudiante = codEstudiante;
        this.codCurso = codCurso;
        this.date = date;
        this.hora = hora;
    }

    public Matricula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public int getCodEstudiante() {
        return codEstudiante;
    }

    public void setCodEstudiante(int codEstudiante) {
        this.codEstudiante = codEstudiante;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }   
}
