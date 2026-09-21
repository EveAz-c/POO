public class Lobo extends Canino {
    public Lobo(){
        super("Canis lupus", "Aullido", "Carnívoro", "Bosque");
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }
    
}
