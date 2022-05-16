
package com.xhu.Methods;

import com.xhu.beans.Task;

class Node{//节点
    Task date;
    Node next;
    public Node(Task date) {
        this.date = date;
    }

    public Task getDate() {
        return date;
    }
}
public class SingleLinkedList {
    private Node head;
    private int size;

    public SingleLinkedList() {
    }

    public SingleLinkedList(Task date) {
        this.head = new Node(date);
        this.size = 1;
    }

    public int addBegin(Task date){
        try{
            Node temp = this.head;
            this.head = new Node(date);
            this.head.next = temp;
            this.size++;
        }catch (Exception e){
            System.out.println("addBegin异常"+e);
            return -1;
        }
        return 0;
    }

    public int addEnd(Task date){
        try{
            Node temp = this.head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(date);
            this.size++;
        }catch (Exception e){
            System.out.println("addEnd异常"+e);
            return -1;
        }
        return 0;
    }

    public int getSize(){
        return this.size;
    }

    public Task getNode(int index){
        if(index<0 || index>=this.size){
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.date;
    }
    public int remove(int index){
        if(index<0 || index>=this.size){
            return -1;
        }
        Node temp = this.head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return 0;
    }

}
