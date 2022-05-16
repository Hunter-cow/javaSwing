package com.xhu.daos;

import com.xhu.beans.Task;
import com.xhu.jdbcutils.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class taskDaoImpl implements baseDao{
    @Override
    public int insert(Task task) {
        int i = 0;
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement =null;
        String sql = "insert into task values(?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, task.getTaskId());
            preparedStatement.setString(2, task.getTaskBtime());
            preparedStatement.setString(3, task.getTaskEtime());
            preparedStatement.setString(4, task.getTaskNum());
            preparedStatement.setString(5, task.getTaskDesc());
            i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("插入成功~");
            } else {
                System.out.println("插入失败~");
            }
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("错误 " + sql);
        }

        return i;
    }

    @Override
    public ArrayList<Task> selectAll() {
        ArrayList<Task> al = new ArrayList<Task>();
        ResultSet resultSet = null;
        String sql = "select * from task";
        Connection connection = JDBCUtil.getConnection();
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int taskId = resultSet.getInt("taskId");
                String taskBtime = resultSet.getString("taskBtime");
                String taskEtime = resultSet.getString("taskEtime");
                String taskNum = resultSet.getString("taskNum");
                String taskDesc = resultSet.getString("taskDesc");
                Task task = new Task(taskId, taskBtime, taskEtime, taskNum, taskDesc);
                al.add(task);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return al;
    }

    @Override
    public int updateTask(Task task) {
        int i = 0;
        Connection connection = JDBCUtil.getConnection();
        String sql = "update task set taskBtime=?,taskEtime=?,taskNum=?,taskDesc=? where taskId=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, task.getTaskBtime());
            preparedStatement.setString(2, task.getTaskEtime());
            preparedStatement.setString(3, task.getTaskNum());
            preparedStatement.setString(4, task.getTaskDesc());
            preparedStatement.setInt(5, task.getTaskId());
            i = preparedStatement.executeUpdate();
            if(i>0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int deleteTask(int taskId) {
        int i = 0;
        String sql = "delete from task where taskId =?";
        Connection connection = JDBCUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,taskId);
            i = preparedStatement.executeUpdate();
            if(i>0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public Task selectOne(int taskId) {
        Task task = null;
        String sql = "select * from task where taskId= ?";
        Connection connection = JDBCUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,taskId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int taskID = resultSet.getInt("taskId");
                String taskBtime = resultSet.getString("taskBtime");
                String taskEtime = resultSet.getString("taskEtime");
                String taskNum = resultSet.getString("taskNum");
                String taskDesc = resultSet.getString("taskDesc");
                task = new Task(taskID, taskBtime, taskEtime, taskNum, taskDesc);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return task;
    }
}

