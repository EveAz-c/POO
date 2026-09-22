package Ejercicio9;

public abstract class Membresia {

    protected String idMiembro;
    protected String nombreUsuario;

    public Membresia(String idMiembro, String nombreUsuario) {
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    public abstract boolean verificarAcceso();

    public void mostrarDatos() {
        System.out.println("ID del miembro: " + idMiembro);
        System.out.println("Nombre: " + nombreUsuario);
    }
}