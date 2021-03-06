package es.carlosrdrz.algorithms.chapter1.part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Exercise23 {
    public static int indexOf(int [] a, int key) {
        return indexOf(a, key, 0, a.length - 1);
    }

    public static int indexOf(int[] a, int key, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid]) return indexOf(a, key, mid + 1, hi);
        else if (key < a[mid]) return indexOf(a, key, lo, mid - 1);
        else return mid;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int indexResult = indexOf(whitelist, key);

            if (args[0].compareTo("+") == 0) {
                if (indexResult == -1) System.out.println("Not in the whitelist: " + key);
            } else if (args[0].compareTo("-") == 0) {
                if (indexResult != -1) System.out.println("In the whitelist: " + key);
            }
        }
    }
}
