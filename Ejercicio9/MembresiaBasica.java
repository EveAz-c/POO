package Ejercicio9;

public class MembresiaBasica extends Membresia {

    private int visitasRestantes;

    public MembresiaBasica(String idMiembro, String nombreUsuario, int visitasIniciales) {
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = visitasIniciales;
    }

    @Override
    public boolean verificarAcceso() {

        if (visitasRestantes > 0) {
            visitasRestantes--;

            System.out.println("Acceso concedido.");
            System.out.println("Bienvenido/a " + nombreUsuario + ".");
            System.out.println("Visitas restantes: " + visitasRestantes);

            return true;
        } else {
            System.out.println("Acceso denegado.");
            System.out.println("No tienes visitas restantes este mes.");

            return false;
        }
    }
}