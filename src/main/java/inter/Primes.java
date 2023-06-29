package inter;

public class Primes {
    public static int primesUpTo(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                counter++;
            }
        }
        return counter;
    }
}
