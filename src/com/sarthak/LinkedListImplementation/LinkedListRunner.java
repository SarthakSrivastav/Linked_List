package com.sarthak.LinkedListImplementation;
import java.util.Scanner;
public class LinkedListRunner extends LinkedListMethods {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit=false;
        while (!exit){
            System.out.println("Enter Your choice:");
            switch (input.nextInt()){
                case 1:insertAtFirst();break;
                case 2:insertAtLast();break;
                case 3:insertAfterGivenNode();break;
                case 4:insertBeforeGivenNode();break;
                case 5:deleteNodeAtStart();break;
                case 6:deleteAtLast();break;
                case 7:deleteTheNodeByPosition();break;
                case 8:nthNodeFromLast();break;
                case 9:show();break;
                case 10:exit=true;break;
                default:
                    System.out.println("Invalid Input!!!");
            }
        }
    }
}
