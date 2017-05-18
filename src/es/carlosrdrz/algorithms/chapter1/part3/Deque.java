package es.carlosrdrz.algorithms.chapter1.part3;

public interface Deque<Item> extends Iterable<Item> {
    boolean isEmpty();
    int size();
    void pushLeft(Item item);
    void pushRight(Item item);
    Item popLeft();
    Item popRight();
}
