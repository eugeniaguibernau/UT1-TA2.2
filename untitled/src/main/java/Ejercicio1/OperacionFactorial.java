package Ejercicio1;

public class OperacionFactorial {
    public static int factorial(int num) {
        if (num < 0) {
            return -1; // (no existe el factorial de un negativo)
        }
        int multiplicador = 1;
        for (int i = 1; i <= num; i++) {
            multiplicador *= i;
        }
        return multiplicador;
    }
}
