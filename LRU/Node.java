package LRU;

public class Node {
    int key;
    int value;
    Node previous;
    Node next;

    Node() {
    }

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
