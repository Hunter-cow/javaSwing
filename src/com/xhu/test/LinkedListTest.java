package com.xhu.test;

import com.xhu.Methods.LinkedList;

import com.xhu.Methods.Node1;
import com.xhu.beans.Task;


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
//        ls.addTail(new Node1<String>("3",null));
//        ls.addTail(new Node1<String>("5",null));
//        ls.addTail(new Node1<String>("4",null));
//        ls.addTail(new Node1<String>("6",null));
//        ls.addTail(new Node1<String>("2",null));
//        ls.addHead(new Node1<String>("1",null));
//        ls.addHead(new Node1<Task>(new Task()));

        System.out.println("���Ԫ�غ������Ϊ: "+ls);
        ls.toString();

        System.out.println("������Ϊ��"+ls.length());

        ls.insert(2,9);
        System.out.println("������λ��2����Ԫ��9: "+ls);

        ls.remove(5);
        System.out.println("������λ��5ɾ��Ԫ��: "+ls);

        System.out.println("�������λ��Ϊ2����Ԫ��:   "+ ls.get(2));

        ls.set(4,8);
        System.out.println("�޸�����λ�õ�4��Ԫ��Ϊ8:   "+ls);

        System.out.println("�������");
        ls.clear();
        System.out.println(ls);
    }
}
