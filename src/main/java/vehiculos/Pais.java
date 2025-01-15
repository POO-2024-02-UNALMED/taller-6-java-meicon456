package vehiculos;

public class Pais {
    private String nombre;
    private int ventas;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarVenta() {
        ventas++;
    }

    public int getVentas() {
        return ventas;
    }

    public static Pais paisMasVendedor(Pais[] paises) {
        Pais mayor = null;
        int maxVentas = -1;
        for (Pais p : paises) {
            if (p.getVentas() > maxVentas) {
                maxVentas = p.getVentas();
                mayor = p;
            }
        }
        return mayor;
    }
}
