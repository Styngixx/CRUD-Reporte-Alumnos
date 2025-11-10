package wavecode.model;

/**
 *
 * @author FRANCIS
 */
public class Student {
    private int codeStudent;
    private String name,surname;
    private int dni,age,phone,status;
    
    //nombre
    public Student(int codeStudent, String name, String surname, int dni, int age, int phone, int status) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.age = age;
        this.phone = phone;
        this.status = status;
    }
   

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
}
