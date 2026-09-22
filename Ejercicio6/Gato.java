package Ejercicio6;

public class Gato extends Felino {
    public Gato() {
        super("Felis Silvestris Catus", "Maullido", "Ratones", "Doméstico");
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
