package wavecode.model;

/**
 *
 * @author FRANCIS
 */
public class Retiro {
    
    private int nroRetiro, matricula;
    private String fecha, hora;

    public Retiro(int nroRetiro, int matricula, String fecha, String hora) {
        this.nroRetiro = nroRetiro;
        this.matricula = matricula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNroRetiro() {
        return nroRetiro;
    }

    public void setNroRetiro(int nroRetiro) {
        this.nroRetiro = nroRetiro;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
