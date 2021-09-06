package javaCodes;

public class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void printList(Node head) {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + "<->");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            head.prev = tail.next = null;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }
    }

    public void insertAtBeg(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            head.prev = null;
            tail.next = null;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
            head.prev = null;
        }
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            head.prev = tail.next = null;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void insertAt(int index, int data) {
        Node node = new Node(data);
        if (head == null) {
            throw new NullPointerException();
        } else {
            if (index == 0) {
                insertAtBeg(data);
            } else {
                Node n = head;
                Node temp = null;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                temp = n.next;
                temp.prev = n;
                n.next = node;
                node.prev = n;
                temp.prev = node;
            }
        }
    }
    
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.add(10);
        dlist.add(20);
        dlist.add(30);
        dlist.printList(dlist.head);
        dlist.insertAtBeg(50);
        dlist.printList(dlist.head);
        dlist.insertAtEnd(1230);
        dlist.printList(dlist.head);
        dlist.insertAt(3, 12340);
        dlist.printList(dlist.head);
    }

}