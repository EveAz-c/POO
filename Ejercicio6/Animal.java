package Ejercicio6;

public abstract class Animal {
    protected String nombreCientifico;
    protected String sonido;
    protected String alimentos;
    protected String habitat;

    public Animal(String nombreCientifico, String sonido, String alimentos, String habitat) {
        this.nombreCientifico = nombreCientifico;
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
    }

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
}   

