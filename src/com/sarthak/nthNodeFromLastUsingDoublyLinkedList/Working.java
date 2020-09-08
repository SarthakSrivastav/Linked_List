package com.sarthak.nthNodeFromLastUsingDoublyLinkedList;
import java.util.Scanner;
public class Working {
    static Node head;
    static Node tail;
    static boolean onlyOne=true;
    static int count=0;
    static Scanner input=new Scanner(System.in);

    public static void insert(){
        Node node=new Node();
        System.out.println("Enter Element to insert into the List:");
        node.data=input.nextInt();
        if (head==null&&tail==null){
            head=node;
            node.next=null;
            node.previous=null;
        }
        else {
            Node ptr1=head;
            Node ptr2=head;
            while (ptr1.next!=null){
                ptr2=ptr1;
                ptr1=ptr1.next;
            }
            ptr1.next=node;
            if (onlyOne) {
                node.previous = ptr2;
                onlyOne=false;
            }else {
                node.previous = ptr2.next;
            }
            node.next=null;
        }
        tail=node;
        count++;
        System.out.println("New Node Created Successfully!!!");
    }
    public static void displayInOriginalOrder(){
        if (head!=null){
            Node n=head;
            System.out.print("Elements of List In Original Order = ");
            while (n.next!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println(n.data);
            System.out.println(count);
        }else System.out.println("List is Empty!!!");
    }
    public static void displayInReverseOrder(){
        if (tail!=null){
            Node n=tail;
            System.out.print("Elements of List In Reverse Order = ");
            while (n.previous!=null){
                System.out.print(n.data+" ");
                n=n.previous;
            }
            System.out.println(n.data);
        }else System.out.println("List is Empty!!!");
    }
    public static void nthNodeFromEnd(){
        System.out.println("Enter Position Of Node From End Which You Want To Retrieve:");
        int position=input.nextInt();
        if (position!=0&&position<=count){
            Node n=tail;
           if (position==1){
               System.out.println(position+"th Node From End = "+n.data);
           }
           else {
               for (int i=1; i<position; i++){
                   n=n.previous;
               }
               System.out.println(position+"th Node From End = "+n.data);
           }
        }else System.out.println("Position Doesn't Exist!!!");
    }
}
