package com.xhu.Methods;


import com.xhu.beans.Task;

class DupNode {
    private Task data;//数据域
    private DupNode next;//后继指针域
    private DupNode previous;//前驱指针域

    public DupNode(Task data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public Task getData() {
        return data;
    }

    public void setData(Task data) {
        this.data = data;
    }

    public DupNode getNext() {
        return next;
    }

    public void setNext(DupNode next) {
        this.next = next;
    }

    public DupNode getPrevious() {
        return previous;
    }

    public void setPrevious(DupNode previous) {
        this.previous = previous;
    }
    //显示该结点的数据
    public void display() {
        System.out.print( data + " ");
    }
}

public class DoublyCircularLinkedList {
    private DupNode head;
    private int length = 0;
 
    public DoublyCircularLinkedList() {
        this.head = null;
    }
 
    //修改指定位置的结点数据
    public void updateIndexData(int index, Task data) {
        if(head == null){
            System.out.println("空表");
        }
        if(index > length || index < 1) {
            System.out.println("结点位置不存在，可更新的位置为1到"+length);
        }else {
            DupNode curNode = head;
            int count =1;//while也可以用for循环方式解决
            while(count != index) {
                curNode =curNode.getNext();
                count++;
            }
            curNode.setData(data);
        }
    }
 
   
    }
 
  