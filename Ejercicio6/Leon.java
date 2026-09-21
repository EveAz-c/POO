public class Leon extends Felino {
    public Leon(){
        super("Panthera leo", "Rugido", "Carnívoro", "Pradera");
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
