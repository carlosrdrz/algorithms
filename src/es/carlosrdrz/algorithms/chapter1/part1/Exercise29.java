package es.carlosrdrz.algorithms.chapter1.part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise29 {
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

    public static int rank(int[] values, int key) {
        return indexOf(values, key) + 1;
    }

    public static int count(int[] values, int key) {
        int firstElement = indexOf(values, key);

        if (firstElement == -1) {
            return 0;
        } else {
            int result = 1;
            for (int i = firstElement + 1; i < values.length; i++) {
                if (values[i] == key) {
                    result++;
                } else break;
            }

            return result;
        }
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
