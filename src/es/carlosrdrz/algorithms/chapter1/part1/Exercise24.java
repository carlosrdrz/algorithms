package es.carlosrdrz.algorithms.chapter1.part1;

public class Exercise24 {
    public static int gcd(int p, int q) {
        System.out.println(p + " " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int p = new Integer(args[0]);
        int q = new Integer(args[1]);
        System.out.println("Result: " + gcd(p, q));
    }
}
