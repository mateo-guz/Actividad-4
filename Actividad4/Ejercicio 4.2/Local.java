package entrega;

public class Local extends Inmueble {
    enum Tipo { INTERNO, CALLE }
    protected Tipo tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
