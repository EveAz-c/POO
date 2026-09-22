package Ejercicio9;

public class MembresiaPremium extends Membresia {

    private int pasesInvitado;

    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado) {
        super(idMiembro, nombreUsuario);
        this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso() {

        System.out.println("Acceso concedido.");
        System.out.println("Bienvenido/a " + nombreUsuario + ".");
        System.out.println("Membresía Premium: visitas ilimitadas.");

        return true;
    }

    public boolean ingresarConInvitado() {

        if (pasesInvitado > 0) {
            pasesInvitado--;

            System.out.println("El miembro y su invitado pueden pasar.");
            System.out.println("Pases de invitado restantes: " + pasesInvitado);

            return true;
        } else {
            System.out.println("El miembro puede pasar, pero el invitado no.");
            System.out.println("No quedan pases de invitado.");

            return false;
        }
    }
}