package com.sarthak.LinkedListImplementation;
import java.util.Scanner;
public class LinkedListMethods {
    static Scanner input = new Scanner(System.in);
    static Node head;
    static int count = 0;
    public static void insertAtLast() {
        Node node = new Node();
        System.out.println("Enter element to Insert into the list!");
        node.setData(input.nextInt());
        node.setNext(null);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
        count++;
    }
    public static void insertAtFirst() {
        Node node = new Node();
        System.out.println("Enter element to Insert into the list!  ");
        node.setData(input.nextInt());
        node.setNext(head);
        head = node;
        count++;
    }

    public static void insertAfterGivenNode() {
        if (head == null) {
            System.out.println("List is empty!!");
        } else {
            Node n = head;
            boolean found = true;
            Node node = new Node();
            System.out.println("Enter the node data after which you want to insert new com.sarthak.nthNodeFromLast.Node:");
            int givenNode = input.nextInt();
            System.out.println("Enter the value to insert into the node:");
            node.setData(input.nextInt());
            while (n.getData() != givenNode) {
                n = n.getNext();
                if (n.getNext() == null && n.getData() != givenNode) {
                    System.out.println("Given com.sarthak.nthNodeFromLast.Node is not present in the list!!!");
                    found = false;
                    break;
                }
            }
            if (found) {
                node.setNext(n.getNext());
                n.setNext(node);
                System.out.println("Data added successfully into the list!!!");
            }
            count++;
        }
    }

    public static void insertBeforeGivenNode() {
        if (head == null)
            System.out.println("List is Empty!!!");
        else {
            Node node = new Node();
            System.out.println("Enter the node data before which you want to insert new com.sarthak.nthNodeFromLast.Node:");
            int value = input.nextInt();
            System.out.println("Enter the value to insert into the New com.sarthak.nthNodeFromLast.Node:");
            int newNodeData = input.nextInt();
            node.setData(newNodeData);
            if (head.getData() == value) {
                node.setNext(head);
                head = node;
                System.out.println("Data Inserted Successfully!!!");
            } else {
                com.sarthak.LinkedListImplementation.Node n = head;
                boolean found = true;
                while ((n.getNext()).getData() != value) {
                    n = n.getNext();
                    if (n.getNext() == null) {
                        System.out.println("Given com.sarthak.nthNodeFromLast.Node is not present in the list!!!");
                        found = false;
                        break;
                    }
                }
                if (found) {
                    node.setNext(n.getNext());
                    n.setNext(node);
                    System.out.println("Data Inserted Successfully!!!");
                }
            }
            count++;
        }
    }
    public static void deleteNodeAtStart() {
        if (head != null) {
            head = head.getNext();
            count--;
            System.out.println("Deletion successful!!!");
        } else System.out.println("List is empty");
    }

    public static void deleteAtLast() {
        if (head != null) {
            if (head.getNext()==null){
                head=null;
                System.out.println("com.sarthak.nthNodeFromLast.Node Deleted Successfully!!!");
            }else {
                Node n = head;
                while ((n.getNext()).getNext() != null) {
                    n = n.getNext();
                }
                n.setNext(null);
                System.out.println("com.sarthak.nthNodeFromLast.Node Deleted Successfully!!! ");
            }
            count--;
        } else System.out.println("List is Empty!!!");
    }
    public static void deleteTheNodeByPosition() {
        System.out.println("Enter the position:");
        int position = input.nextInt();
        if (position <= count) {
                Node n1 = head;
                Node n2 = head;
                if (position == 1) {
                   deleteNodeAtStart();
                } else if (position == count) {
                    deleteAtLast();
                } else {
                    int co=1;
                    while (co != position) {
                        n1 = n2;
                        n2 = n2.getNext();
                        co++;
                    }
                    n1.setNext(n2.getNext());
                    count--;
                    System.out.println("com.sarthak.nthNodeFromLast.Node Deleted Successfully!!!");
                }
        }
        else System.out.println("position not exist!!!");
    }
    public static void nthNodeFromLast(){
        Node n=head;
        System.out.println("Enter the com.sarthak.nthNodeFromLast.Node Position From Last Which You Want to fetch:");
        int positionFromLast=input.nextInt();
        if (positionFromLast<=count){
            if (positionFromLast==count){
                System.out.println("Required node "+positionFromLast+" from last  is = "+n.getData());
            }else {
                int positionFromStarting = count - positionFromLast;
                int i = 1;
                while (i != positionFromStarting) {
                    n = n.getNext();
                    i++;
                }
                System.out.println("Required node " + positionFromLast + " from last  is = " + (n.getNext()).getData());
            }
        }else System.out.println("Position does not exist!!!");
    }
        public static void show () {
            Node node = head;
            if (head != null) {
                System.out.print("List elements are: ");
                while (node.getNext() != null) {
                    System.out.print(node.getData() + " ");
                    node = node.getNext();
                }
                System.out.println(node.getData());
                System.out.println("Total elements in the list is = " + count);
            } else System.out.println("List is Empty!!!");
    }
}