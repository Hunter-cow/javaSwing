/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xhu.Methods;

import com.xhu.beans.Task;

/**
 *
 * @author 钟平洋
 */



class kouzhaoNode {
    Task task;
    kouzhaoNode prior;
    kouzhaoNode next;

    public kouzhaoNode() {
        this(null,null,null);
    }


    public kouzhaoNode(Task object) {
        this(object,null,null);
    }

    public kouzhaoNode(Task object, kouzhaoNode prior, kouzhaoNode next) {
        this.task = object;
        this.prior = prior;
        this.next = next;
    }

    @Override
    public String toString() {
        return "kouzhaoNode{" + "Task=" + task + '}';
    }

}


public class DoubleLink {
    kouzhaoNode head;

    public DoubleLink() {
        head=new kouzhaoNode();
        head.prior=head;
        head.next=head;
        
    }
    public int length(){
      kouzhaoNode  node = head.next;
        int j = 0;
        while(!node.equals(head)){
            j++;
            node = node.next;
        }
        return j;
    }
    public void display(){
        kouzhaoNode node=head.next;
        while(!node.equals(head)){
            System.out.println(node.task);
            node=node.next;
        }
    }
   public void insert(int i,Task task) {
        if(i<0 || i>length()){
            System.out.println("下标不合法");
            return;
        }
         kouzhaoNode node = head;
         int j = 0;
         while(!node.next.equals(head) && j<i){
             j++;
             node = node.next;
         }
         kouzhaoNode newNode = new kouzhaoNode(task);
        node.next.prior = newNode;
        newNode.prior = node;
        newNode.next = node.next;
        node.next = newNode;

       
   }
   public kouzhaoNode getNode(int i) {
        if(i<0 || i>length()){
            System.out.println("下标不合法");
            return null;
        }
       kouzhaoNode node = head.next;
        if(node.equals(head)){
            return null;
        }
        int j =0;
        while(j<i){
            j++;
            node = node.next;
        }
        return node;
    }

    public Task get(int i) {
        return getNode(i).task;
    }
   
    
}
