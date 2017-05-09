package es.carlosrdrz.algorithms.chapter1.part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise29 {
    public static int rank(int[] values, int key) {
        return rank(values, key, 0, values.length - 1);
    }

    private static int rank(int[] values, int key, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if (key > values[mid]) {
            return rank(values, key, mid + 1, hi);
        // We keep looking at the left as long as the key is smaller or the value on the
        // left is the same one
        } else if (key < values[mid] || (mid > 0 && values[mid - 1] == values[mid])) {
            return rank(values, key, lo, mid - 1);
        } else {
            // mid is the index of the first value of key in values, and therefore
            // also the number of elements smaller than key
            return mid;
        }
    }

    public static int count(int[] values, int key) {
        return count(values, key, 0, values.length - 1);
    }

    private static int count(int[] values, int key, int lo, int hi) {
        // We are going to do the same thing, but instead of looking for values at the
        // left, lets do it for values at the right.

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if (key > values[mid]) {
            return count(values, key, mid + 1, hi);
        } else if (key < values[mid]) {
            return count(values, key, lo, mid - 1);
        // Here, if we found key in values[mid], we check if values[mid + 1] is
        // also key, and if it is we set mid to that index and continue
        } else if (mid < values.length - 1 && values[mid] == values[mid + 1]) {
            return count(values, key, mid + 1, mid + 1);
        } else {
            // Therefore, mid is the index of the most right-positioned value of key
            // in the array. rank - 1 is the index of the most left-positioned value, so if we
            // subtract them we get the number of elements in the array
            return mid - (rank(values, key) - 1);
        }
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        System.out.println(rank(whitelist, 11));
        System.out.println(count(whitelist, 2));
    }
}
