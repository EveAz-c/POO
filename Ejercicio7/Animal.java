package Ejercicio7;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected int peso;

    public Animal(String nombre, int edad, int peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String setNombre(String nombre){
        this.nombre = nombre;
        return this.nombre;
    }
    public int setEdad(int edad){
        this.edad = edad >= 1 ? edad : 1;
        return this.edad;       
    };
    public int setPeso(int peso){
        this.peso = peso >= 1 ? peso : 1;
        return this.peso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getPeso(){
        return this.peso;
    }
    public void Alimentarse(){
        System.out.println("El animal se está alimentando");
    }
    public abstract void emitirSonido();


}
