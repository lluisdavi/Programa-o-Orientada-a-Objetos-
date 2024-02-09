package Questão21;

public class NumeroPrimo {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            return isPrime(n, 2);
        }
    }
    
    public static boolean isPrime(int n, int i) {
        if (n % i == 0) {
            return false;
        } else if (i * i > n) {
            return true;
        } else {
            return isPrime(n, i + 1);
        }
    }
    
}
