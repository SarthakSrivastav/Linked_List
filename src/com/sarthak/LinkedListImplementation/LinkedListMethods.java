package com.sarthak.LinkedListImplementation;
import java.util.Scanner;
public class LinkedListMethods {
    static Scanner input=new Scanner(System.in);
    static Node head;
    static int count=0;
        public static void insertAtLast(){
            Node node = new Node();
            System.out.println("Enter element to Insert into the list!");
            node.setData(input.nextInt());
            node.setNext(null);
            if (head==null){
                head=node;
            }
            else{
                Node n=head;
                while (n.getNext()!=null){
                    n=n.getNext();
                }
                n.setNext(node);
            }
        }
        public static void insertAtFirst(){
            Node node = new Node();
            System.out.println("Enter element to Insert into the list!  ");
            node.setData(input.nextInt());
            node.setNext(head);
            head=node;
        }
        public static void insertBetweenNodes(){
            if (head==null){
                System.out.println("List is empty!!");
            }else {
                Node n = head;
                Node node = new Node();
                System.out.println("Enter the node data after which you want to insert new Node:");
                int givenNode = input.nextInt();
                System.out.println("Enter the value to insert into the node:");
                node.setData(input.nextInt());
                while (n.getData() != givenNode) {
                    n = n.getNext();
                }
                node.setNext(n.getNext());
                n.setNext(node);
                System.out.println("Data added successfully into the list!!!");
            }
        }
        public static void show(){
            Node node=head;
            if (head!=null) {
                System.out.print("List elements are: ");
                while (node.getNext() != null) {
                    System.out.print(node.getData() + " ");
                    node = node.getNext();
                    count++;
                }
                System.out.println(node.getData());
            }
            System.out.println("Total elements in the list is = "+(count+1));
        }
}