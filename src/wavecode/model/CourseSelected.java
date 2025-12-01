package wavecode.model;

import java.util.List;
/**
 *
 * @author FRANCIS
 */
public class CourseSelected {

    String nombre;
   List<String> dias; // Ej: ["Lunes", "Miércoles"]
    String horaInicio; // Ej: "08:00"
    String horaFin;    // Ej: "10:00"

    public CourseSelected(String nombre, List<String> dias, String horaInicio, String horaFin) {
        this.nombre = nombre;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDias() {
        return dias;
    }

    public void setDias(List<String> dias) {
        this.dias = dias;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    
    
}
