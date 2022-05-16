package com.xhu.panel;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

import com.xhu.Methods.SingleLinkedList;
import com.xhu.beans.Task;
import com.xhu.daos.taskDaoImpl;
import com.xhu.JPanels.myFrame;
import com.xhu.Methods.*;
import com.xhu.test.MaskList;

public class myPanel extends JPanel {
    private static ArrayList<Task> al;
    private static int width;//jPanel 宽
    private static int height;//jPanel 高
    private static int methodChoose;
    private static MaskList<Task> maskList;//顺序存储
    private static SingleLinkedList singleLinkedList;//单向链表
    private static DoubleLink doubleLink;//双向链表
    private static LinkedList ls;//单向循环链表
    private static DoubleLinkedList doubleLinkedList;//双向循环链表
    private static DoublyCircularLinkedList doublyCircularLinkedList;//双向循环链表
    private int currX;
    private int currY;

    public static MaskList<Task> getMaskList() {
        return maskList;
    }

    public static SingleLinkedList getSingleLinkedList() {
        return singleLinkedList;
    }

    public static DoubleLink getDoubleLink() {
        return doubleLink;
    }

    public static LinkedList getLs() {
        return ls;
    }

    public static DoubleLinkedList getDoubleLinkedList() {
        return doubleLinkedList;
    }

    public static DoublyCircularLinkedList getDoublyCircularLinkedList() {
        return doublyCircularLinkedList;
    }

    public myPanel() {
        initComponents();
    }
    public void chooseStructure(int index,Graphics g){
        switch (index){
            case 0:
                InitMaskList(g);
                break;
            case 1:
                InitSingleLinkedList(g);
                break;
            case 2:
                InitDoubleLinkedList(g);
                break;
            case 3:
                InitSingleCircleLinkedList(g);
                break;
            case 4:
                InitDoubleCircularLinkedList(g);
                break;
            case 5:
                InitDoubleCircularLinkedList1(g);
                break;

        }

    }





    @Override
    public void paint(Graphics g) {
        super.paint(g);
        /**
         * 初始化数据
         */
        al = new taskDaoImpl().selectAll();
        methodChoose = myFrame.chooseIndex;
        System.out.println("method="+methodChoose);
        g.setFont(new Font("微软雅黑", Font.BOLD, 24));
        width = this.getSize().width;//自适应大小
        height = this.getSize().height;//自适应大小
        currX = 1;
        currY =20;
        chooseStructure(methodChoose,g);
    }

    //========顺序存储=========
    private void InitMaskList(Graphics g){
        if (al.size() == 0) {
            return;
        }
        maskList = new MaskList<Task>(al.size());
        for (int i = 0; i < al.size(); i++) {
            maskList.ListInsert(i+1,al.get(i));
        }
        System.out.println("================");
        for (int i = 0; i < al.size(); i++) {
////          Task task = new Task();
//            Task task = maskList.GetElem(i);
//            //System.out.println(task);
//            //System.out.println(task);
            drawMaskList(g,al.get(i).getTaskId()+"");
        }
        System.out.println("================");

    }
    private void drawMaskList(Graphics g,String str){
        if(currX+100>width){
            currY += 50;
            currX =1;
        }
        g.drawRect(currX,currY,60,40);
        g.drawString(str,currX+10,currY+10+20);
        currX += 60;
    }

    //===========单向链表=========
    private void InitSingleLinkedList(Graphics g) {
        if (al.size() == 0) {
            return;
        }
        singleLinkedList = new SingleLinkedList(al.get(0));
        for (int i = 1; i < al.size(); i++) {
            singleLinkedList.addEnd(al.get(i));
        }

        for (int i = 0; i < singleLinkedList.getSize(); i++) {
            drawRectLink(g,singleLinkedList.getNode(i).getTaskId()+"");
        }


    }

    private void drawRectLink(Graphics g,String str){
        if(currX+100>width){
            currY += 50;
            currX =1;
        }
        g.drawRect(currX,currY,60,40);
        g.drawString(str,currX+10,currY+10+20);
        g.drawLine(currX+60,currY+20,currX+100,currY+20);
        g.drawLine(currX+100,currY+20,currX+90,currY-10+20);
        g.drawLine(currX+100,currY+20,currX+90,currY+10+20);
        currX += 100;
    }

    //===========双向链表=========

    private void InitDoubleLinkedList(Graphics g){
        if (al.size() == 0) {
            return;
        }
        doubleLink = new DoubleLink();
        for (int i = 0; i < al.size(); i++) {
            //System.out.println("al="+al.get(i));
            doubleLink.insert(i,al.get(i));
        }
        for (int i = 0; i < doubleLink.length(); i++) {
            //System.out.println(doubleLink.get(i));
            drawDoubleRectLink(g,doubleLink.get(i).getTaskId()+"");
        }

    }

    private void drawDoubleRectLink(Graphics g,String str){
        if(currX+100>width){
            currY += 50;
            currX =1;
        }
        g.drawRect(currX,currY,60,40);
        g.drawString(str,currX+10,currY+10+20);
        g.drawLine(currX+60,currY+20,currX+100,currY+20);

        g.drawLine(currX+60,currY+20,currX+70,currY+20-10);
        g.drawLine(currX+60,currY+20,currX+70,currY+20+10);

        g.drawLine(currX+100,currY+20,currX+90,currY-10+20);
        g.drawLine(currX+100,currY+20,currX+90,currY+10+20);
        currX += 100;
    }
    //=======单向循环链表=========

    private void InitSingleCircleLinkedList(Graphics g){
        if (al.size() == 0) {
            return;
        }
        ls = new LinkedList();
        for (int i = 0; i < al.size(); i++) {
            ls.addHead(new Node1<Task>(al.get(i)));
        }

        for (int i = 0; i < ls.length(); i++) {
            String id = ls.get(i).toString().split("taskId=")[1].split("taskBtime=")[0].trim();
            drawSingleCircleLinkedList(g,id);

        }

        g.drawLine(currX-90,currY,40,0);
        g.drawLine(40,0,40,20);
        g.drawLine(40,20,40-5,20-5);
        g.drawLine(40,20,40+5,20-5);

    }

    private void drawSingleCircleLinkedList(Graphics g,String str){
        if(currX+100>width){
            currY += 50;
            currX =1;
        }
        g.drawRect(currX,currY,60,40);
        g.drawString(str,currX+10,currY+10+20);
        g.drawLine(currX+60,currY+20,currX+100,currY+20);
        g.drawLine(currX+100,currY+20,currX+90,currY-10+20);
        g.drawLine(currX+100,currY+20,currX+90,currY+10+20);

        currX += 100;
    }

    //============双向循环链表=============

    private void InitDoubleCircularLinkedList(Graphics g){
        if (al.size() == 0) {
            return;
        }
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        for (int i = 0; i < al.size(); i++) {
            doubleLinkedList.addhead(al.get(i));
        }

        for (int i = 0; i < doubleLinkedList.size(); i++) {
            drawDoubleRectCircularLink(g,al.get(i).getTaskId()+"");
        }
        //画头和尾的连线
        g.drawLine(currX-90,currY,40,0);
        g.drawLine(40,0,40,20);
        g.drawLine(currX-90,currY,currX-100,currY+10);
        g.drawLine(currX-90,currY,currX-100,currY-10);

        g.drawLine(40,20,40-5,20-5);
        g.drawLine(40,20,40+5,20-5);
    }

    private void drawDoubleRectCircularLink(Graphics g,String str){
        if(currX+100>width){
            currY += 50;
            currX =1;
        }
        g.drawRect(currX,currY,60,40);
        g.drawString(str,currX+10,currY+10+20);
        g.drawLine(currX+60,currY+20,currX+100,currY+20);

        g.drawLine(currX+60,currY+20,currX+70,currY+20-10);
        g.drawLine(currX+60,currY+20,currX+70,currY+20+10);

        g.drawLine(currX+100,currY+20,currX+90,currY-10+20);
        g.drawLine(currX+100,currY+20,currX+90,currY+10+20);
        currX += 100;
    }
    //===========双向循环链表1==============
    private void InitDoubleCircularLinkedList1(Graphics g){
        if (al.size() == 0) {
            return;
        }
        DoublyCircularLinkedList doublyCircularLinkedList = new DoublyCircularLinkedList();
        for (int i = 0; i < al.size(); i++) {
            doublyCircularLinkedList.updateIndexData(i,al.get(i));
        }
        for (int i = 0; i < al.size(); i++) {
            drawDoubleRectCircularLink1(g,al.get(i).getTaskId()+"");
        }
        g.drawLine(currX-90,currY,40,0);
        g.drawLine(40,0,40,20);
        g.drawLine(currX-90,currY,currX-100,currY+10);
        g.drawLine(currX-90,currY,currX-100,currY-10);

        g.drawLine(40,20,40-5,20-5);
        g.drawLine(40,20,40+5,20-5);

    }

    private void drawDoubleRectCircularLink1(Graphics g,String str){
        if(currX+100>width){
            currY += 50;
            currX =1;
        }
        g.drawRect(currX,currY,60,40);
        g.drawString(str,currX+10,currY+10+20);
        g.drawLine(currX+60,currY+20,currX+100,currY+20);

        g.drawLine(currX+60,currY+20,currX+70,currY+20-10);
        g.drawLine(currX+60,currY+20,currX+70,currY+20+10);

        g.drawLine(currX+100,currY+20,currX+90,currY-10+20);
        g.drawLine(currX+100,currY+20,currX+90,currY+10+20);
        currX += 100;
    }
    //=========================


    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
