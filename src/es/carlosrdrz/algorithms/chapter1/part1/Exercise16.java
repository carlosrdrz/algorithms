package es.carlosrdrz.algorithms.chapter1.part1;

/*
    exr1(1) = 11
    exr1(3) = 3 + exr(1) + 3 = 3113
    exr1(2) = 22
    exr1(4) = exr(1) + 4 + exr(2) + 4 = 114224
    exr1(6) = exr1(3) + 6 + exr1(4) + 6 = 311361142246
*/

public class Exercise16 {
    private static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}
