public class Perro extends Canino{
    public Perro(){
        super("Canis lupus familiaris", "Ladrido", "Carnívoro", "Doméstico");
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
