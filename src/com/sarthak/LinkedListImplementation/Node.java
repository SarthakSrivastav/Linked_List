package com.sarthak.LinkedListImplementation;
public class Node {
        private int data;
        private Node next;
        public int getData() {
                return data;
        }
        public void setData(int data) {
                this.data = data;
        }
        public void setNext(Node next) {
                this.next = next;
        }
        public Node getNext() {
                return next;
        }
}