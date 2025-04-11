package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // *********** Array ***********
        // We work with primitive types in Java
        ArrayType array = new ArrayType();
        array.printArray(new int[]{1, 2, 3, 4, 5});
        array.bubbleSort(new int[]{5, 4, 3, 2, 1});
        array.insertionSort(new int[]{5, 4, 3, 2, 1});
        array.quickSort(new int[]{5, 4, 3, 2, 1}, 0, 4);
        array.mergeSort(new int[]{5, 4, 3, 2, 1}, 0, 4);

        // *********** List ***********
        // We work with reference types in Java
        ListType<String> listTypeString = new ListType<>();
        listTypeString.printList(List.of("Hello", "World", "Java"));

        ListType<Integer> listTypeInteger = new ListType<>();
        listTypeInteger.printList(List.of(1, 2, 3, 4, 5));

        // *********** Singly Linked List ***********
        // We work with reference types in Java

        System.out.println("Singly Linked List");
        SinglyLinkedListType singlyLinkedList = new SinglyLinkedListType();
        singlyLinkedList.addAtHead(1);
        singlyLinkedList.addAtTail(2);
        singlyLinkedList.addAtIndex(1, 3);
        System.out.println(singlyLinkedList.get(0)); // Output: 1
        System.out.println(singlyLinkedList.get(1)); // Output: 2
        System.out.println(singlyLinkedList.get(2)); // Output: 3
        singlyLinkedList.deleteAtIndex(1);
        System.out.println(singlyLinkedList.get(1)); // Output: 3

        // *********** Doubly Linked List ***********
        // We work with reference types in Java
        // Each operation has a time complexity
        System.out.println("Doubly Linked List");

        LinkedList<Integer> doublyLinkedList = new LinkedList<>();
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        System.out.println(doublyLinkedList.get(0)); // Output: 1
        System.out.println(doublyLinkedList.get(1)); // Output: 2
        System.out.println(doublyLinkedList.get(2)); // Output: 3
        doublyLinkedList.remove(1);
        System.out.println(doublyLinkedList.get(1)); // Output: 3

        // *********** LIFO ***********
        // We can use also the Stack class
        System.out.println("LIFO Stack");
        Deque<Integer> lifo = new ArrayDeque<>();
        lifo.push(1);
        lifo.push(2);
        lifo.push(3);
        System.out.println(lifo.peek()); // Output: 3
        lifo.remove();
        System.out.println(lifo.peek()); // Output: 2

        // *********** FIFO ***********
        System.out.println("FIFO Queue");
        Queue<Integer> fifo = new ArrayDeque<>();
        fifo.add(1);
        fifo.add(2);
        fifo.add(3);
        System.out.println(fifo.peek()); // Output: 1
        fifo.remove();
        System.out.println(fifo.peek()); // Output: 2

        // *********** HashSet ***********
        // Complexity O(1) for add, remove, and contains
        System.out.println("HashSet");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Java");
        hashSet.add("Hello"); // Duplicate, will not be added
        System.out.println(hashSet); // Output: [Hello, World, Java]
        System.out.println(hashSet.contains("Java")); // Output: true
        System.out.println(hashSet.contains("Python")); // Output: false

        // *********** HashMap ***********
        // Complexity O(1) for get, put, and remove
        System.out.println("HashMap");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println(hashMap.get("Two")); // Output: 2
        System.out.println(hashMap.get("Four")); // Output: null
        hashMap.remove("Two");
        System.out.println(hashMap.get("Two")); // Output: null
        System.out.println(hashMap); // Output: {One=1, Three=3}

        // *********** TreeSet ***********
        // Complexity O(log n) for add, remove, and contains
        System.out.println("TreeSet");
        Set<String> treeSet = new TreeSet<>();

    }
}