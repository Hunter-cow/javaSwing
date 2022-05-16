package com.xhu.Methods;


import com.xhu.beans.Task;

class ListNode {
    public ListNode pre;//ǰһ���ڵ��ַ
    public ListNode next;//��һ���ڵ��ַ
    public Task val;//��ֵ
    public ListNode(Task val){
        this.val=val;
    }

}



public class DoubleLinkedList {
    public ListNode head;//ͷ�ڵ�
    //���ݸ���
    public int size(){
        int count=0;
        ListNode cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //ͷ�巨
    public  void addhead(Task date){
        ListNode newnode =new ListNode(date);
        if (this.head==null){
            this.head= newnode;
        }
        else{
            newnode.next=this.head;
            this.head.pre=newnode;
            this.head=newnode;
        }
    }
    //β�巨
    public void addlast(Task date){
        ListNode newnode=new ListNode(date);
        if (this.head==null){
            this.head=newnode;
        }
        else {
            ListNode cur=this.head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=newnode;
            newnode.pre=cur;
        }
    }
    //����λ�ò���
    public boolean addindex(int index,Task data){
        //�ж������Ƿ�Ϸ�
        if(index > size() || index < 0){
            System.out.println("�±겻�Ϸ�!");
            return false;
        }
        else if(index == 0){
            addhead(data);
            return true;
        }
        else if(index == size()){
            addlast(data);
            return true;
        }
        else {
            ListNode node = new ListNode(data);
            //ѭ�������ҵ�indexָ��Ľڵ�
            ListNode cur = this.head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            //�����½ڵ�
            node.next = cur;
            node.pre = cur.pre;
            cur.pre.next = node;
            cur.pre = node;
            return true;
        }
    }
    //���Ұ����ؼ���key�Ƿ���������
    public boolean contains(Task key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //ɾ����һ�γ��ֹؼ���Ϊkey�Ľڵ�
    public void remove(Task key){
        if(this.head == null){
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
            this.head.pre = null;
            return;
        }
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                if(cur.next == null){
                    cur.pre.next = null;
                    cur.pre = null;
                    return;
                }
                else{
                    //��һ�γ��ֲ������һ���ڵ�
                    cur.pre.next = cur.next;
                    cur.next.pre = cur.pre;
                    return;
                }
            }
            else{
                cur = cur.next;
            }
        }
    }
    //ɾ������ֵΪkey�Ľڵ�
    public void removeall(Task key){
        if(this.head == null){
            return;
        }
        ListNode cur = this.head.next;
        while(cur != null){
            if(cur.val.getTaskId() == key.getTaskId()){
                if(cur.next == null){
                    cur.pre.next = null;
                    cur.pre = null;
                }else{
                    cur.pre.next = cur.next;
                    cur.next.pre = cur.pre;
                }
            }
            cur = cur.next;
        }
        if(this.head.val == key){
            this.head = this.head.next;
            if(this.head != null){
                this.head.pre = null;
            }
        }
    }

    //show
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //����
    public void clear(){
        ListNode cur = this.head;
        while(this.head != null) {
            cur = cur.next;
            this.head.pre = null;
            this.head.next = null;
            this.head = cur;
        }
    }
}

