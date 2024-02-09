package codewars.kyu4;

public class ProperFractions {
    public static long properFractions(long n) {
//        long counter = 0;
//        for (long i = 1; i < n; i++) {
//            if (gcd(i, n) == 1) {
//                counter++;
//            }
//        }
        return phi((int)n);
    }
    static int phi(int n)
    {
        // Initialize result as n
        int result = n;

        // Consider all prime factors
        // of n and subtract their
        // multiples from result
        for (int p = 2; p * p <= n; ++p)
        {

            // Check if p is
            // a prime factor.
            if (n % p == 0)
            {

                // If yes, then update
                // n and result
                while (n % p == 0)
                    n /= p;
                result -= result / p;
            }
        }

        // If n has a prime factor
        // greater than sqrt(n)
        // (There can be at-most
        // one such prime factor)
        if (n > 1)
            result -= result / n;
        return result;
    }


    //Binary GCD Algorithm
    private static long gcd(long u, long v) {
        int shift;

        if (u == 0) return v;
        if (v == 0) return u;

        for (shift = 0; ((u | v) & 1) == 0; ++shift) {
            u >>= 1;
            v >>= 1;
        }

        while ((u & 1) == 0) {
            u >>= 1;
        }

        do {
            while ((v & 1) == 0) {
                v >>= 1;
            }

            if (u > v) {
                long t = v;
                v = u;
                u = t;
            }

            v = v - u;
        } while (v != 0);

        return u << shift;
    }
}
