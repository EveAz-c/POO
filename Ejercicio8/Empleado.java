package Ejercicio8;

public abstract class Empleado{
    protected String nombre;
    protected String apellido;
    protected String id;

    public Empleado(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public String setApellido(String apellido) {
        this.apellido = apellido;
        return apellido;
    }
    public String setId(String id) {
        this.id = id;
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getId() {
        return id;
    }
    public abstract double calcularSalario();
    
}
