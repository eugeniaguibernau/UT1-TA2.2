package Ejercicio2;

public class OperacionPrimos {
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int suma(long num){
        int suma = 0;
        int contador = 0;
        if (isPrime(num)) {
            while (contador <= num) {
                if (contador % 2 == 0) {
                    suma += contador;
                }
                contador++;
            }
        }
        else {
            if (num < 0) {
                return -1;
            }
            while ((contador <= num)) {
                if (contador % 2 != 0) {
                    suma += contador;
                }
                contador++;
            }
        }
        return suma;
    }
}
