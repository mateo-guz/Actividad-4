package Animales;

public class Gato extends Felino {
    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimento() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getnCientifico() {
        return "Felis Silvestris Catus";
    }
}
