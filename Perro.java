package Ejercicio4_perro;

public class Perro {
    private String raza;
    private String nombre;
    private int edadAnios;
    private double pesoKg;

    public Perro(String raza, String nombre, int edadAnios, double pesoKg) {
        this.raza = raza;
        this.nombre = nombre;
        this.edadAnios = edadAnios;
        this.pesoKg = pesoKg;
    }
    public String requiereRevisionAnual() {
        if (edadAnios >7) {
            return nombre + " requiere revisión anual.";
        } else {
            return nombre + " no requiere revisión anual.";
        }

    }
}
