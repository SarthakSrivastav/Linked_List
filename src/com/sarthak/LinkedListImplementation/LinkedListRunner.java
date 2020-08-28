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
                case 3:insertBetweenNodes();break;
                case 4:show();break;
                case 5:exit=true;
                default:
                    System.out.println("Invalid Input!!!");
            }
        }
    }
}
