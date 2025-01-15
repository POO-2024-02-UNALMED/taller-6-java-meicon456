package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void registrarVenta() {
        ventas++;
        pais.registrarVenta();
    }

    public int getVentas() {
        return ventas;
    }

    public static Fabricante fabricaMayorVentas(Fabricante[] fabricantes) {
        Fabricante mayor = null;
        int maxVentas = -1;
        for (Fabricante f : fabricantes) {
            if (f.getVentas() > maxVentas) {
                maxVentas = f.getVentas();
                mayor = f;
            }
        }
        return mayor;
    }
}
