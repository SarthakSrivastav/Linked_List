package com.sarthak.QueueUsingLinkedList;
import java.util.Scanner;
public class QueueWorking {
    static Node front;
    static Node rear;
    static Scanner input=new Scanner(System.in);
    public static void enqueue(){
        Node node=new Node();
        System.out.println("Enter element to insert into the Queue:");
        node.data=input.nextInt();
        if (front==null&&rear==null){
            front=node;
            rear=node;
        }else {
            rear.next=node;
            rear=node;
        }
        System.out.println("Data inserted successfully!!!");
    }
    public static void dequeue(){
        if (front!=null&&rear!=null) {
            System.out.println(front.data + " deleted successfully!!!");
            if (front==rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
            }
        }else System.out.println("Queue Underflow!!!");
    }
    public static void display(){
        if (front!=null){
            Node n=front;
            System.out.print("Element present into the queue= ");
           while (n!=rear){
               System.out.print(n.data+" ");
               n=n.next;
           }
            System.out.println(n.data);
        }else System.out.println("Queue is Empty!!!");
    }
}
