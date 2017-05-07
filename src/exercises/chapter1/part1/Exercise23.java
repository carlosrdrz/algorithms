package exercises.chapter1.part1;

import java.util.Scanner;

public class Exercise23 {
    private static int indexOf(int [] a, int key) {
        return indexOf(a, key, 0, a.length - 1, 0);
    }

    private static int indexOf(int[] a, int key, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) System.out.print("\t");
        System.out.println(lo + " " + hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid]) return indexOf(a, key, mid + 1, hi, depth + 1);
        else if (key < a[mid]) return indexOf(a, key, lo, mid - 1, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        int whitelist[] = { 1, 4, 7, 22, 46, 89 };
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int intFromStdin = sc.nextInt();
            int whitelistIndex = indexOf(whitelist, intFromStdin);

            if (args[0].compareTo("+") == 0) {
                if (whitelistIndex == -1) System.out.println("Not in the whitelist: " + intFromStdin);
            } else if (args[0].compareTo("-") == 0) {
                if (whitelistIndex != -1) System.out.println("In the whitelist: " + intFromStdin);
            }
        }
    }
}
