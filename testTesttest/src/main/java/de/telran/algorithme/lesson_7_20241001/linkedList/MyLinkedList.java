package de.telran.algorithme.lesson_7_20241001.linkedList;



public class MyLinkedList {
    private Node head; //ccылка на первый элемент
    public Node getHead() {
        return head;
    }
    //first element
    public void pushToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public boolean removeFirst() {
        if (this.head == null) {
            return false;
        }
        this.head = this.head.getNext();
        return true;
    }

    // Last element
    public void pushToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Find current last element
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(newNode);
    }



    public void removeLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        Node previous = null;
        if (current.getNext() == null) { // one element
            head = null;
        } else {
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            if (previous != null) {
                previous.setNext(null); // remove last node
            }
        }
    }


    // --- Index ---
    public void pushToIndex(int index, int data) {
        Node newNode = new Node(data);
        Node current = head;
        int jump; //tekuschij index
        if (index < 1) {
            System.out.println("index out of bounds");
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }




    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}
