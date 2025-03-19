package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println(OperacionPrimos.suma(5)); //primo
        System.out.println(OperacionPrimos.suma(7)); //primo
        System.out.println(OperacionPrimos.suma(8)); //no primo
        System.out.println(OperacionPrimos.suma(-5)); // negativo (devuelve -1 pq no es válido)
    }
}
