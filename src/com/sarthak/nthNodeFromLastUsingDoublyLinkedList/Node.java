package com.sarthak.nthNodeFromLastUsingDoublyLinkedList;
import java.util.Scanner;
public class Node extends Working{
    Node next;
    Node previous;
    int data;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean exit=true;
        while (exit){
            System.out.println("Enter Your Choice:");
            switch (input.nextInt()){
                case 1:insert();break;
                case 2:displayInOriginalOrder();break;
                case 3:displayInReverseOrder();break;
                case 4:nthNodeFromEnd();break;
                case 5:exit=false;break;
                default:
                    System.out.println("Invalid Input!!!");
            }
        }
    }

}
