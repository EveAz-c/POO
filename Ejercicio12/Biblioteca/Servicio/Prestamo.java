package Ejercicio12.Biblioteca.Servicio;
import Ejercicio12.Biblioteca.Modelo.Libro;
/**
 * 
 * Administración de préstamos de libros en una biblioteca
 * @author EveAU
 * @version 1.0
 * @Since 2026
 */
public class Prestamo {

    /**
     * 
     * @param libro libro a prestar
     * @return mensaje con datos del libro prestado
     */
    public String realizarPrestamo(Libro libro){
        return "Libro prestado: " + libro.getTitulo() + " autor: " + libro.getAutor();
    }
    
}
