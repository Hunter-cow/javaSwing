package com.xhu.daos;

import com.xhu.beans.Task;

import java.util.ArrayList;

public interface baseDao {
    int insert(Task task);
    ArrayList<Task> selectAll();
    int updateTask(Task bookInfo);
    int deleteTask(int taskId);
    Task selectOne(int taskId);
}
