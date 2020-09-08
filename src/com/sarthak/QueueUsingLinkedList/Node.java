package com.sarthak.QueueUsingLinkedList;
import java.util.Scanner;
public class Node extends QueueWorking {
    Node next;
    int data;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean exit=true;
        while (exit){
            System.out.println("Enter Your Choice:");
            switch (input.nextInt()){
                case 1:enqueue();break;
                case 2:dequeue();break;
                case 3:display();break;
                case 4:exit=false;break;
                default:
                    System.out.println("Invalid Input!!!");
            }
        }
    }
}
