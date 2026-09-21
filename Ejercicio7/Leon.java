package Ejercicio7;

public class Leon extends Animal {
    private int fuerzaRugido;

    public Leon(String nombre, int edad, int peso, int fuerzaRugido){
        super(nombre, edad, peso);
        this.fuerzaRugido = fuerzaRugido;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El león ruge con una fuerza de " + fuerzaRugido + " decibeles");
    }
    
}
