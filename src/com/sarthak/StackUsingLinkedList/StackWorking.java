package com.sarthak.StackUsingLinkedList;
import java.util.Scanner;
public class StackWorking {
    static Node head=null;
    static Scanner input=new Scanner(System.in);
    public static void push(){
        Node node=new Node();
        System.out.println("Enter element to insert into the stack!!!");
        node.data=input.nextInt();
        node.next=head;
        head=node;
        System.out.println("Element inserted successfully!!!");
    }
    public static void pop(){
        if (head!=null){
            System.out.println(head.data+" successfully deleted from the stack!!!");
            head=head.next;
        }
        else System.out.println("Stack Underflow!!!");
    }
    public static void display(){
        if (head!=null){
            Node n=head;
            System.out.print("Elements in stack = ");
            while (n.next!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.print(n.data);
            System.out.println();
        }else System.out.println("Stack is Empty!!!");
    }
}
