package com.sarthak.StackUsingLinkedList;
import java.util.Scanner;
public class Node extends StackWorking {
    Node next;
    int data;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean exit=true;
        while (exit){
            System.out.println("Enter Your Choice:");
            switch (input.nextInt()){
                case 1:push();break;
                case 2:pop();break;
                case 3:display();break;
                case 4:exit=false;break;
                default:
                    System.out.println("Invalid Input!!!");
            }
        }
    }
}
