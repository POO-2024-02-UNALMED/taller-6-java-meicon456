package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private int ventas;
    private static List<Pais> paises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void incrementarVentas() {
        this.ventas++;
    }

    public int getVentas() {
        return ventas;
    }

    public static Pais paisMasVendedor() {
        Pais masVendedor = null;
        int maxVentas = 0;
        for (Pais p : paises) {
            if (p.ventas > maxVentas) {
                maxVentas = p.ventas;
                masVendedor = p;
            }
        }
        return masVendedor;
    }
}
