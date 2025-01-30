import java.util.*;

public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String pais;
    private ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    void equipo() {
        for (Ciclista c : listaCiclistas) {
            System.out.println(c.getNombre());
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (Ciclista c : listaCiclistas) {
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }

    void totalTiempo() {
        totalTiempo = 0; // Reiniciar el total tiempo antes de calcularlo
        for (Ciclista c : listaCiclistas) {
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
