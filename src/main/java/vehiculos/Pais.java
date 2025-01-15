package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static Map<Pais, Integer> ventasPorPais = new HashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void registrarVenta(Pais pais) {
        ventasPorPais.put(pais, ventasPorPais.getOrDefault(pais, 0) + 1);
    }

    public static Pais paisMasVendedor() {
        return ventasPorPais.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}
