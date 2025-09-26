package wavecode;

/**
 *
 * @author FRANCIS
 */
import java.sql.*;
public class Conexion {
    
    PreparedStatement ps;
    Connection cn;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wavecode",
                    "root","Chap04");
            System.err.println("Conectado a la base de datos");
                   
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se conecto a la base de datos");
        }
    }
    
    public Connection getConnection(){
       return cn;
    }
    
    //Métodos para Registrar, Eliminar y Actualizar los datos de los Alumnos
    public int RegistroAlumno( int cod_Alumno, String nombres, String apellidos, String dni, int edad, String celular, int  estado){
        int res= 0;
        try {
            ps=cn.prepareStatement("INSERT INTO Alumno (cod_Alumno, nombres, apellidos, dni, edad, celular, estado)  VALUES(?,?,?,?,?,?,?);");
            ps.setInt(1, cod_Alumno);
            ps.setString(2, nombres);
            ps.setString(3, apellidos);
            ps.setString(4, dni);
            ps.setInt(5, edad);
            ps.setString(6, celular);
            ps.setInt(7, estado);
            res= ps.executeUpdate();
            System.err.println("Alumno registrado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al registrar un nuevo alumno");
        }
        return res;
    }
    
    public int ModificarAlumno( int cod_Alumno, String nombres, String apellidos, String dni, int edad, String celular, int  estado){
        int res= 0;
        try {
            ps=cn.prepareStatement("UPDATE Alumno SET nombres=?, apellidos=?, dni=?, edad=?, celular=?, estado=? WHERE cod_Alumno=?;");
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, dni);
            ps.setInt(4, edad);
            ps.setString(5, celular);
            ps.setInt(6, estado);
            ps.setInt(7, cod_Alumno);
            res= ps.executeUpdate();
            System.err.println("Alumno modificado");
        } catch (SQLException e) {
            System.out.println("Error al modificar al alumno");
        }
        return res;
    }
    
    public int EliminarAlumno( int cod_Alumno){
        int res= 0;
        try {
            ps=cn.prepareStatement("DELETE FROM alumno WHERE cod_Alumno =?");
            ps.setInt(1, cod_Alumno);
            res=ps.executeUpdate();
            System.err.println("Alumno Eliminado");
        } catch (SQLException e) {
            System.out.println("Error al eliminar al alumno");
        }
        return res;
    }

    
    
    
    
    
    //Métodos para Registrar, Eliminar y Actualizar los datos de los Cursos
     public int RegistroCurso(int codigo_Curso, String asignatura, int ciclo, int creditos, int horas){
        int res= 0;
        try {
            ps=cn.prepareStatement("INSERT INTO Curso (codigo_Curso, asignatura, ciclo, creditos, horas)  VALUES(?,?,?,?,?);");
            ps.setInt(1, codigo_Curso);
            ps.setString(2, asignatura);
            ps.setInt(3, ciclo);
            ps.setInt(4, creditos);
            ps.setInt(5, horas);
            res= ps.executeUpdate();
            System.err.println("Curso registrado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al registrar un nuevo curso");
        }
        return res;
    }
    
    public int ModificarCurso(int codigo_Curso, String asignatura, int ciclo, int creditos, int horas){
        int res= 0;
        try {
            ps=cn.prepareStatement("UPDATE Curso SET asignatura=?,ciclo=?,creditos=?,horas=? WHERE codigo_Curso=?;");
            ps.setString(1, asignatura);
            ps.setInt(2, ciclo);
            ps.setInt(3, creditos);
            ps.setInt(4, horas);
            ps.setInt(5, codigo_Curso);
            res= ps.executeUpdate();
            System.err.println("Curso modificado");
        } catch (SQLException e) {
            System.out.println("Error al modificar un curso");
        }
        return res;
    }
    
    public int EliminarCurso(int codigo_Curso, String asignatura, int ciclo, int creditos, int horas){
        int res= 0;
        try {
            ps=cn.prepareStatement("DELETE FROM Curso WHERE codigo_Curso =?");
            ps.setInt(1, codigo_Curso);
            res=ps.executeUpdate();
            System.err.println("Curso Eliminado");
        } catch (SQLException e) {
            System.out.println("Error al eliminar al curso");
        }
        return res;
    }   
    
    
    
    
    
    
    
        //Métodos para Registrar, Eliminar y Actualizar los datos de las Matriculas
     public int RegistroMatricula(int numero_Matricula, int codigo_Estudiante, int codigo_Curso, String fecha, String hora){
        int res= 0;
        try {
            ps=cn.prepareStatement("INSERT INTO Matricula (numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora)  VALUES(?,?,?,?,?);");
            ps.setInt(1, numero_Matricula);
            ps.setInt(2, codigo_Estudiante);
            ps.setInt(3, codigo_Curso);
            ps.setString(4, fecha);
            ps.setString(5, hora);
            res= ps.executeUpdate();
            System.err.println("Matrícula registrado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al registrar una nuevo matrícula");
        }
        return res;
    }
    
    public int ModificarMatricula(int numero_Matricula, String fecha, String hora){
        int res= 0;
        try {
            ps=cn.prepareStatement("UPDATE Matricula SET fecha=?,hora=? WHERE numero_Matricula=?;");
//            ps.setInt(1, codigo_Estudiante);
//            ps.setInt(2, codigo_Curso);
            ps.setString(1, fecha);
            ps.setString(2, hora);
            ps.setInt(3, numero_Matricula);
            res= ps.executeUpdate();
            System.err.println("Matrícula modificada");
        } catch (SQLException e) {
            System.out.println("Error al modificar la matrícula");
        }
        return res;
    }
    
    public int EliminarMatricula(int numero_Matricula, int codigo_Estudiante, int codigo_Curso, String fecha, String hora){
        int res= 0;
        try {
            ps=cn.prepareStatement("DELETE FROM Matricula WHERE numero_Matricula =?");
            ps.setInt(1, numero_Matricula);
            res=ps.executeUpdate();
            System.err.println("Matrícula Eliminada");
        } catch (SQLException e) {
            System.out.println("Error al eliminar la matrícula");
        }
        return res;
    }   
    
}
