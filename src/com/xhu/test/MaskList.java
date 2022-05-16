package com.xhu.test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.xhu.beans.Task;

/**
 *
 * @author MLS
 */

    public class MaskList<T> {

    public int m_Size;
    public int m_Length;
    public static Task[] data;

    public MaskList(int m_Size) {
        this.m_Size = m_Size;
        data = new Task[m_Size+1];
        m_Length = 0;
    }

    public void ClearList(){
        data = null;
        m_Length = 0;

    }

    public boolean ListEmpty(){
        if (m_Length ==0){
            return true;
        }else {
            return false;
        }
    }

    public int ListLength(){
        return m_Length;
    }

    public Task GetElem(int i){
        if (i<0 || i>=m_Length) {
            System.out.println("i=" + i);
            return null;
        }else {
            System.out.println("data[i]="+data[i]);
            return data[i];
        }
    }

    public int LocateElem(Task e){
        for (int i = 0;i<m_Length;i++){
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    public boolean PriorElem(Task currentElem,Task preElem){
        int i = LocateElem(currentElem);
        if (i == -1)
            return false;
        if (i ==0)
            return false;
        preElem = data[i-1];
        return true;
    }
    
    public boolean NextElem(Task currentElem,Task nextElem){
        int i = LocateElem(currentElem);
        if (i == -1)
            return false;
        if (i == m_Length-1)
            return false;
        nextElem = data[i+1];
        return true;
    }
    
    public void ListTraverse(){
        for (Task i :
                data) {
            System.out.println(i);
        }
    }

    public boolean ListInsert(int i,Task e){
        //System.out.println(e);
//        if (m_Length == m_Size)
//            return false;
        if (i<0 || i>m_Size)
            return false;
//        for (int k=m_Length;k>=i;k--){
//            data[k+1] = data[k];
//        }

        data[i] = new Task(e);
        System.out.println(data[i]);
        m_Length++;
        return true;
    }

    public boolean ListDelete(int i,Task e){
        e = data[i];
        for (int k=i+1;k<m_Length;k++){
            data[k-1] = data[k];
        }
        m_Length--;
        return true;
    }
}


