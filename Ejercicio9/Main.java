package Ejercicio9;

public class Main {

    public static void main(String[] args) {

        MembresiaBasica basica = new MembresiaBasica(
                "B001",
                "Evelyn",
                3
        );

        MembresiaPremium premium = new MembresiaPremium(
                "P001",
                "Carlos",
                2
        );

        Membresia[] membresias = {
                basica,
                premium
        };

        System.out.println("DATOS DE LOS MIEMBROS");

        for (Membresia membresia : membresias) {
            membresia.mostrarDatos();
            System.out.println();
        }

        System.out.println(" ACCESOS AL GIMNASIO ");

        for (int i = 1; i <= 4; i++) {

            System.out.println("\nAcceso " + i + " al gimnasio:");

            for (Membresia membresia : membresias) {
                membresia.verificarAcceso();
                System.out.println();
            }
        }

        System.out.println("INGRESO CON INVITADO");

        premium.ingresarConInvitado();
        premium.ingresarConInvitado();
        premium.ingresarConInvitado();
    }
}