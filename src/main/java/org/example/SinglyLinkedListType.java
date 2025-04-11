package org.example;

public class SinglyLinkedListType {
    private Node head;
    private int size;

    public SinglyLinkedListType() {
        this.head = null;
        size = 0;
    }

    public int get(int index) {
        if(index > size || index < 0) return -1;
        Node node = head;
        for(int i =0 ; i< index; i++) node = node.next;
        return node == null ? -1 : node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        if (isEmpty()) {
            head = new Node(val);
            return;
        }
        Node node = new Node(val);
        Node dummy = head;
        while (dummy.next != null) dummy = dummy.next;
        dummy.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return ;
        Node node = new Node(val);
        if(isEmpty()){
            head = node;
            size++;
            return;
        }
        Node dummy = head;
        for(int i = 0; i< index; i++) dummy = dummy.next;
        if(size == index){
            dummy.next = node;
            size++;
            return;
        }
        node.next = dummy.next;
        dummy.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index >= size || index < 0)return;
        Node current = head;
        Node previous = null;
        for(int i = 0; i<index ;i++){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            head = head.next;
        }else {
            previous.next = current.next;
        }
        size--;
    }

    public boolean isEmpty() {
        return head == null;
    }


    private static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

    }
}
