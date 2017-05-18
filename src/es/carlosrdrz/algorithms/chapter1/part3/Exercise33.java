package es.carlosrdrz.algorithms.chapter1.part3;

import edu.princeton.cs.algs4.StdOut;

public class Exercise33 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedListDeque<>();
        StdOut.println(deque.isEmpty());

        // Add some items
        deque.pushLeft("one");
        deque.pushRight("two");
        deque.pushLeft("zero");
        deque.pushRight("three");
        StdOut.println();

        // Print all of them
        for (String s : deque) {
            StdOut.println(s);
        }

        // Remove some elements
        StdOut.println();
        StdOut.println(deque.popLeft());
        StdOut.println(deque.popRight());
        StdOut.println();

        // Print all of them
        for (String s : deque) {
            StdOut.println(s);
        }

        StdOut.println();
        StdOut.println(deque.isEmpty());
        StdOut.println();

        // Remove some elements
        StdOut.println(deque.popLeft());
        StdOut.println(deque.popRight());
        StdOut.println();

        StdOut.println(deque.isEmpty());
    }
}
