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

        // *********** Stream ***********
        System.out.println("Stream");
        List<Integer> numbers = List.of(4, 1, 8, 2, 5);

        // Filtering and Sorting using Stream API
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        // Map
        System.out.println("Map");
        numbers.stream()
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        // flatMap
        System.out.println("flatMap");
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        listOfLists.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        // flatMap with nested lists
        System.out.println("flatMap with nested lists");
        List<List<List<Integer>>> listOfListsOfLists = List.of(
                List.of(List.of(1, 2), List.of(3, 4)),
                List.of(List.of(5, 6), List.of(7, 8))
        );

        listOfListsOfLists.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        // Distinct
        System.out.println("Distinct");
        List<Integer> numbersWithDuplicates = List.of(1, 2, 2, 3, 4, 4, 5);
        numbersWithDuplicates.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // Peek
        System.out.println("Peek");
        List<Integer> numbersToPeek = List.of(1, 2, 3, 4, 5);
        numbersToPeek.stream()
                .peek(n -> System.out.println("Processing: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("Transformed: " + n))
                .sorted()
                .forEach(System.out::println);

        // Reduce
        System.out.println("Reduce");
        List<Integer> numbersToReduce = List.of(1, 2, 3, 4, 5);
        int sum = numbersToReduce.stream()
                .reduce(0, Integer::sum);
        // Print reduce value
        System.out.println("Sum: " + sum);

        // anyMatch
        System.out.println("anyMatch");
        List<Integer> numbersToMatch = List.of(1, 2, 3, 4, 5);
        boolean anyMatch = numbersToMatch.stream()
                .anyMatch(n -> n > 3);
        System.out.println("Any match > 3: " + anyMatch); // Output: true

        // allMatch
        System.out.println("allMatch");
        List<Integer> numbersToAllMatch = List.of(1, 2, 3, 4, 5);
        boolean allMatch = numbersToAllMatch.stream()
                .allMatch(n -> n > 0);
        System.out.println("All match > 0: " + allMatch); // Output: true

        // noneMatch
        System.out.println("noneMatch");
        List<Integer> numbersToNoneMatch = List.of(1, 2, 3, 4, 5);
        boolean noneMatch = numbersToNoneMatch.stream()
                .noneMatch(n -> n < 0);
        System.out.println("None match < 0: " + noneMatch); // Output: true

        // findFirst
        System.out.println("findFirst");
        List<Integer> numbersToFindFirst = List.of(1, 2, 3, 4, 5);
        Optional<Integer> first = numbersToFindFirst.stream()
                .filter(n -> n > 3)
                .findFirst();
        System.out.println("First match > 3: " + first.orElse(-1)); // Output: 4

        // findAny
        System.out.println("findAny");
        List<Integer> numbersToFindAny = List.of(1, 2, 3, 4, 5);
        Optional<Integer> any = numbersToFindAny.stream()
                .filter(n -> n > 3)
                .findAny();
        System.out.println("find any > 3: " + any.orElse(-1)); // Output: 4

        // Max
        System.out.println("Max");
        List<Integer> numbersToMax = List.of(1, 2, 3, 4, 5);
        Optional<Integer> max = numbersToMax.stream()
                .max(Integer::compareTo);
        System.out.println("Max: " + max.orElse(-1)); // Output: 5

        // Min
        System.out.println("Min");
        List<Integer> numbersToMin = List.of(1, 2, 3, 4, 5);
        Optional<Integer> min = numbersToMin.stream()
                .min(Integer::compareTo);
        System.out.println("Min: " + min.orElse(-1)); // Output: 1
    }
}