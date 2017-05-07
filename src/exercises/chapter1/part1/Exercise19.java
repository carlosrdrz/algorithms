package exercises.chapter1.part1;

public class Exercise19 {
    private static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static long cachedFibonacci(int n, long[] results) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (results[n] != 0) return results[n];
        long result = cachedFibonacci(n - 1, results) + cachedFibonacci(n - 2, results);
        results[n] = result;
        return result;
    }

    private static long newFibonacci(int n) {
        long[] cachedResults = new long[n + 1];
        return cachedFibonacci(n, cachedResults);
    }

    public static void main(String[] args) {
        for (int n = 0; n < 90; n++) {
            System.out.println(n + " " + newFibonacci(n));
        }
    }
}
