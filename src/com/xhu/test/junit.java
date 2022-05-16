
package com.xhu.test;

import com.xhu.Methods.DoubleLink;
import com.xhu.Methods.DoubleLinkedList;
import com.xhu.Methods.SingleLinkedList;
import com.xhu.beans.Task;
import com.xhu.daos.taskDaoImpl;
import com.xhu.jdbcutils.JDBCUtil;
import org.junit.Test;

import java.util.ArrayList;

public class junit {
    @Test
    public void testDb(){
        JDBCUtil jdbcUtil = new JDBCUtil();
        System.out.println(jdbcUtil.getConnection());

    }
    @Test
    public void testSingleLinkedList(){
        SingleLinkedList singleLinkedList = new SingleLinkedList(new Task());
        singleLinkedList.addEnd(new Task(1,"1","1","20","111"));
        singleLinkedList.addEnd(new Task(1,"1","1","20","111"));
        singleLinkedList.addEnd(new Task(1,"1","1","20","111"));
        singleLinkedList.addEnd(new Task(1,"1","1","20","111"));
        int size = singleLinkedList.getSize();
        System.out.println("长度为"+size);
        Task node = singleLinkedList.getNode(2);
        System.out.println(node);

        for(int i=1;i<singleLinkedList.getSize()-1;i++){
            System.out.println(singleLinkedList.getNode(i));
        }
        singleLinkedList.remove(1);
        System.out.println("删除后:");
        for(int i=1;i<singleLinkedList.getSize();i++){
            System.out.println(singleLinkedList.getNode(i));
        }
    }
    @Test
    public void testInsert(){
        //int k = new taskDaoImpl().insert(new Task(110,"22","23","10","早上"));
        ArrayList<Task> tasks = new taskDaoImpl().selectAll();
        System.out.println(tasks);
        //System.out.println(k>0?"成功":"失败");
    }
    @Test
    public void doublelinkedinsert(){
//        DoubleLink doubleLink = new DoubleLink();
//        doubleLink.insert(0,new Task(1,"1","1","1","1"));
//        doubleLink.insert(1,new Task(2,"1","1","1","1"));
//        System.out.println(doubleLink.get(0));
//        System.out.println(doubleLink.get(1));
//        doubleLink.display();
//        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//        doubleLinkedList.addhead(new Task(1,"1","1","1","90"));
//        doubleLinkedList.addhead(new Task(2,"1","1","1","90"));
//        System.out.println(doubleLinkedList.size());
//        doubleLinkedList.display();

//        DoublyCircularLinkedList doublyCircularLinkedList = new DoublyCircularLinkedList();
//        doublyCircularLinkedList.updateIndexData(1);

    }


}
