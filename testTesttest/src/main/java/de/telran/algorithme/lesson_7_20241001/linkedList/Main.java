package de.telran.algorithme.lesson_7_20241001.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList lists = new MyLinkedList();
        System.out.println(" - pushToHead - ");
        lists.pushToHead(5);
        lists.pushToHead(3);
        lists.pushToHead(6);
        lists.print();


        System.out.println(" - removeFirst - ");
        lists.removeFirst();
        lists.print();

        System.out.println(" - pushToTail - ");
        lists.pushToTail(7);
        lists.print();

        System.out.println(" - removeLast - ");
        lists.removeLast();
        lists.print();

        System.out.println(" - PushToIndex - ");
        lists.pushToIndex(1,10);
        lists.print();
    }
}
