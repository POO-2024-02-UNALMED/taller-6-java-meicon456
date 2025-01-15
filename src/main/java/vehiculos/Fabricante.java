package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;
    private static List<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void incrementarVentas() {
        this.ventas++;
        pais.incrementarVentas();
    }

    public int getVentas() {
        return ventas;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante mayorVentas = null;
        int maxVentas = 0;
        for (Fabricante f : fabricantes) {
            if (f.ventas > maxVentas) {
                maxVentas = f.ventas;
                mayorVentas = f;
            }
        }
        return mayorVentas;
    }
}
