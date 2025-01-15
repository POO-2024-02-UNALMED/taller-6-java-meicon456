package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    private static int cantidadVehiculos;
    private static int cantidadAutomoviles;
    private static int cantidadCamionetas;
    private static int cantidadCamiones;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidad) {
        cantidadVehiculos = cantidad;
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + cantidadAutomoviles + "\n" +
               "Camionetas: " + cantidadCamionetas + "\n" +
               "Camiones: " + cantidadCamiones;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public static void incrementarAutomoviles() {
        cantidadAutomoviles++;
    }

    public static void incrementarCamionetas() {
        cantidadCamionetas++;
    }

    public static void incrementarCamiones() {
        cantidadCamiones++;
    }
}
