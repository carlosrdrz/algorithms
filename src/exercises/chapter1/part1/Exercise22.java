package exercises.chapter1.part1;

public class Exercise22 {
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
        int test[] = { 1, 4, 7, 22, 46, 89 };
        System.out.println("Result: " + indexOf(test, 90));
    }
}
