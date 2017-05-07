package es.carlosrdrz.algorithms.chapter1.part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise28 {
    private static int indexOf(int [] a, int key) {
        return indexOf(a, key, 0, a.length - 1, 0);
    }

    private static int indexOf(int[] a, int key, int lo, int hi, int depth) {
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

        // Create a new array with the same size, and copy elements
        // on it as long as it is not duplicated
        int[] withoutDuplicates = new int[whitelist.length];
        int withoutDuplicatesInd = 0;

        for(int i = 0; i < whitelist.length; i++) {
            if (i == whitelist.length - 1 || whitelist[i] != whitelist[i + 1]) {
                withoutDuplicates[withoutDuplicatesInd] = whitelist[i];
                withoutDuplicatesInd++;
            }
        }

        // Now, if there were duplicates, we create a new array so
        // we remove the zeros from the final elements in the array
        int[] finalWhitelist;
        if (withoutDuplicatesInd != 0) {
            finalWhitelist = Arrays.copyOf(withoutDuplicates, withoutDuplicatesInd);
        } else {
            finalWhitelist = whitelist;
        }

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (indexOf(finalWhitelist, key) == -1)
                StdOut.println(key);
        }
    }
}
