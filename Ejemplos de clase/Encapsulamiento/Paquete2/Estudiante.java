package Paquete2;

public class Estudiante {
    // Atributos
    private String idEstudiante;
    private String nombre;
    private String apellido;
    private short edad;
    private String idCarrera;

    // Métodos

    // Métodos setters

    // Establecer el id del estudiante
    public void setIdEstudiantes(String idEstudiante){
        this.idEstudiante = idEstudiante;
    }

    // Establecer el nombre del estudiante
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Establecer el apellido del estudiante
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    // Establecer la edad del estudiante
    public void setEdad(short edad){
        this.edad = edad;
    }

    // Establecer id de la carrera
    public void setIdCarrera(String idCarrera){
        this.idCarrera = idCarrera;
    }

    // Métodos getters
    
    // Obtener id del estudiante
    public String getIdEstudiante(){
        return idEstudiante;
    }

    // Obtener nombre del estudiante
    public String getNombre(){
        return nombre;
    }

    // Obtener apellido del estudiante
    public String getApellido(){
        return apellido;
    }

    // Obtener la edad del estudiante
    public short getEdad(){
        return edad;
    }

    // Obtener la id de carrera del estudiante
    public String getIdCarrera(){
        return idCarrera;
    }

} // clase estudiante
