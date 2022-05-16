package com.xhu.Methods;

import com.xhu.beans.Task;

interface List<E> {

    void addHead(Node1 node);//���ʹ�ø÷�����������ĵ�һ���ڵ㣬��head=tail=node����nextָ������

    void addTail(Node1 node);//���ʹ�ø÷�����������ĵ�һ���ڵ㣬��head=tail=node����nextָ������

    boolean isEmpty();//�ж������Ƿ�Ϊ��

    int length();//������

    E get(int index);//��ȡԪ��

    void set(int index,E data);//����index�޸�Ԫ��data

    void insert (int index,E data);//����index����Ԫ��

    E remove(int index);//ɾ��ָ��λ�õ�Ԫ��

    void clear();//�������

    String toString();// �����ʽ
}

public class LinkedList implements List {
    private Node1 head;                                        //ͷ���
    private Node1 rear;                                        //β�ڵ�
    private int size;                                            //����ĳ���

    public LinkedList() {
        head = null;
        rear = null;
        size = 0;
    }

    @Override
    public void addHead(Node1 node) {
        if(size == 0){
            rear = head = node;
            head.setNext(node);
        }else{
            rear.setNext(node);
            node.setNext(head);
            head = node;
        }
        ++size;
    }

    @Override
    public void addTail(Node1 node) {
        if(size == 0){
            rear = head = node;
            rear.setNext(node);
        }else{
            rear.setNext(node);
            node.setNext(head);
            rear = node;
        }
        ++size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 && head == null && rear == null;
    }

    @Override
    public int length() {
        if (head!=null) {
            Node1 temp = head;
            int size = 1;
            while (temp.next != head) {
                size++;
                temp = temp.next;
            }
        }
        else
            System.out.println("������Ϊ������");
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("���ҽǱ�Ƿ�");
        }
        if (index == 0) {
            return head.data;
        } else if (index == size) {
            return rear.data;
        } else {
            Node1 p = head;
            for (int i =1; i < index; i++) {
                p = p.next;
            }
            return p.data;
        }
    }

    @Override
    public void set(int index, Object e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("�޸ĽǱ�Ƿ�");
        }
        if (index == 0) {
            head.data = e;
        } else if (index == size) {
            rear.data = e;
        } else {
            Node1 p = head;
            for (int i = 1; i < index; i++) {
                p = p.next;
            }
            p.data = e;
        }
    }

    @Override
    public void insert(int index, Object e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("����Ǳ�Ƿ�");
        }
        Node1 n = new Node1(e, null);
        if (isEmpty()) {                //Ϊ�յ����
            head = n;
            rear = n;
            rear.next = head;
        } else if (index == 0) {        //ͷ��
            n.next = head;
            head = n;
            rear.next = head;
        } else if (index == size) {    //β��
            n.next = head;
            rear.next = n;
            rear = n;
        } else {                        //һ�����
            Node1 p = head;
            for (int i = 1; i < index - 1; i++) {
                p = p.next;
            }
            n.next = p.next;
            p.next = n;
        }
        size++;
    }


    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("ɾ���Ǳ�Ƿ�");
        }
        Object res = null;
        if (size == 1) {
            res = head.data;
            head = null;
            rear = null;
        } else if (index == 0) {
            res = head.data;
            head = head.next;
            rear.next = head;
        } else if (index == size - 1) {
            res = rear.data;
            Node1 p = head;
            while (p.next != rear) {
                p = p.next;
            }
            p.next = rear.next;
            rear = p;
        } else {
            Node1 p = head;
            for (int i = 1; i < index - 1; i++) {
                p = p.next;
            }
            Node1 del = p.next;
            res = del.data;
            p.next = del.next;
        }
        size--;
        return res;
    }

    @Override
    public void clear() {
        head = null;
        rear = null;
        size = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList:size = " + size + "\n");
        if (isEmpty()) {
            sb.append("[]");
        } else {
            sb.append('[');
            Node1 p = head;
            while (true) {
                sb.append(p.data);
                if (p.next == head) {
                    sb.append(']');
                    break;
                } else {
                    sb.append(',');
                }
                p = p.next;
            }
        }
        return sb.toString();
    }
}
