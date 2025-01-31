package Persona;
import java.util.*;

public class ListaPersonas {
    private List<Personas> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new ArrayList<>();
    }

    public void añadirPersona(Personas p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int indice) {
        if (indice >= 0 && indice < listaPersonas.size()) {
            listaPersonas.remove(indice);
        }
    }

    public void borrarLista() {
        listaPersonas.clear();
    }

    public List<Personas> getListaPersonas() {
        return listaPersonas;
    }
}
