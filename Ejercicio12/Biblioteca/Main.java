package Ejercicio12.Biblioteca;
import Ejercicio12.Biblioteca.Modelo.Libro;
import Ejercicio12.Biblioteca.Servicio.Prestamo;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        // Crear un préstamo
        Prestamo prestamo = new Prestamo();

        // Realizar el préstamo del libro
        String resultado = prestamo.realizarPrestamo(libro);
        String resultado2 = prestamo.realizarPrestamo(libro2);

        // Mostrar el resultado
        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
