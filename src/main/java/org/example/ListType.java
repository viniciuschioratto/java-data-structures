package org.example;

import java.util.List;

public class ListType<T> {

    /**
     * This method prints the elements of a list.
     * It is using reference data type List<T>.
     * @param list the list to be printed
     */
    public void printList(List<T> list) {
        list.forEach(System.out::println);
    }
}
