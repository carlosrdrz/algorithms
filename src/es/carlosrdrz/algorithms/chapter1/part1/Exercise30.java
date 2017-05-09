package es.carlosrdrz.algorithms.chapter1.part1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise30 {
    public static int gcd_memoized(int[][] cache, int p, int q) {
        if (cache[p][q] != 0) return cache[p][q];
        if (q == 0) return p;
        int r = p % q;
        int res = gcd_memoized(cache, q, r);
        cache[p][q] = res;
        return res;
    }

    public static void main(String[] args) {
        int n = 40;
        int[][] cache = new int[n][n];
        boolean[][] result = new boolean[n][n];

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                result[i][j] = (gcd_memoized(cache, i, j) == 1);
            }
        }

        StdOut.print("      ");
        for (int i = 2; i < n; i++) { StdOut.printf("%4d", i); }
        StdOut.print("\n      ");
        for (int i = 2; i < n; i++) { StdOut.print("----"); }
        StdOut.print("\n");

        for (int i = 2; i < n; i++) {
            StdOut.printf("%4d |", i);

            for (int j = 2; j < n; j++) {
                StdOut.printf("%4d", result[i][j] ? 1 : 0);
            }
            StdOut.print("\n");
        }
    }
}
