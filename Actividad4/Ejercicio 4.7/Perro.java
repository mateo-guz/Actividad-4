package Animales;

public class Perro extends Canido {
    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimento() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getnCientifico() {
        return "Canis Lupus Familiaris";
    }
}
