package lab1;

/**
 * LAB1, variant 4216.
 *
 * Fixed parameters for 4216:
 * - O1 = '+'
 * - C  = 1
 * - O2 = '/'
 * - index types: int (so i/j uses integer division)
 *
 * Formula:
 *   S = sum_{i=2..n} sum_{j=3..m} (i O2 j) / (i O1 C)
 * For this variant:
 *   S = sum_{i=2..n} sum_{j=3..m} (i / j) / (i + 1)
 */
public final class Lab1Calculator {

    private Lab1Calculator() {}

    public static double calculate(int n, int m) {
        if (n < 2) throw new IllegalArgumentException("n must be >= 2 (i starts from 2)");
        if (m < 3) throw new IllegalArgumentException("m must be >= 3 (j starts from 3)");

        final int C = 1;
        double s = 0.0;

        for (int i = 2; i <= n; i++) {
            int denominator = i + C;
            if (denominator == 0) throw new ArithmeticException("Division by zero in denominator at i=" + i);

            for (int j = 3; j <= m; j++) {
                int numerator = i / j;
                s += ((double) numerator) / ((double) denominator);
            }
        }
        return s;
    }
}
