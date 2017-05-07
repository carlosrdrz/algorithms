package es.carlosrdrz.algorithms.chapter1.part1;

public class Exercise20 {
    /*
      ln(5!) = ln(5) + ln(4) + ln(3) + ln(2) + ln(1)
     */

    private static double ln_factorial(int n) {
        if (n == 1) return 0;
        return Math.log(n) + ln_factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(n + " " + ln_factorial(n));
    }
}
