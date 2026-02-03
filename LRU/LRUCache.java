package LRU;

import java.util.HashMap;

public class LRUCache {
    private int currentSize;
    private int maxCapacity;

    private Node head;
    private Node tail;

    private HashMap<Integer, Node> cacheMap;

    public LRUCache(int capacity) {
        this.maxCapacity = capacity;
        this.currentSize = 0;

        this.head = new Node();
        this.tail = new Node();

        this.head.next = this.tail;
        this.tail.previous = this.head;

        this.cacheMap = new HashMap<>();

    }

    public int get(int key) {
        if (!cacheMap.containsKey(key))
            return -1;

        Node targetNode = cacheMap.get(key);
        removeNode(targetNode);
        addNodeToHead(targetNode);

        return targetNode.value;

    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            Node existingNode = cacheMap.get(key);
            existingNode.value = value;

            removeNode(existingNode);
            addNodeToHead(existingNode);
        } else {
            Node newNode = new Node(key, value);

            cacheMap.put(key, newNode);

            addNodeToHead(newNode);
            currentSize++;

            if (currentSize > maxCapacity) {
                Node lruNode = tail.previous;

                cacheMap.remove(lruNode.key);
                removeNode(lruNode);

                currentSize--;
            }
        }
    }

    public void removeNode(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    public void addNodeToHead(Node node) {
        node.next = head.next;
        node.next.previous = node;
        node.previous = head;

        head.next = node;

    }
}
