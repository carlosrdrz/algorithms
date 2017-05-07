package es.carlosrdrz.algorithms.chapter1.part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise22 {
    public static int indexOf(int [] a, int key) {
        return indexOf(a, key, 0, a.length - 1, 0);
    }

    public static int indexOf(int[] a, int key, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) System.out.print("\t");
        System.out.println(lo + " " + hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid]) return indexOf(a, key, mid + 1, hi, depth + 1);
        else if (key < a[mid]) return indexOf(a, key, lo, mid - 1, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }
    }
}
