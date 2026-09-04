package Ejercicio4_perro;

public class Main {
    public static void main(String[] args) {
        Perro darwin = new Perro("Callejero", "Darwin", 10, 30.0);
        System.out.println(darwin.requiereRevisionAnual());
        Perro firulais = new Perro("Labrador", "Firulais", 5, 25.0);
        System.out.println(firulais.requiereRevisionAnual());
    }
}
