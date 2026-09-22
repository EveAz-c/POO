package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        
        Animal[] animales = new Animal[4];
        animales[0] = new Leon();
        animales[1] = new Lobo();
        animales[2] = new Gato();
        animales[3] = new Perro();

        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println();
        }
    }
    
}
