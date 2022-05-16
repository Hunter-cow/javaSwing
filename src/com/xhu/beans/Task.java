
package com.xhu.beans;

public class Task {
    private int taskId;
    private String taskBtime;
    private String taskEtime;
    private String taskNum;
    private String taskDesc;

    public Task() {
    }

    public Task(int taskId, String taskBtime, String taskEtime, String taskNum, String taskDesc) {
        this.taskId = taskId;
        this.taskBtime = taskBtime;
        this.taskEtime = taskEtime;
        this.taskNum = taskNum;
        this.taskDesc = taskDesc;
    }
    public Task(Task task) {
        this.taskId = task.getTaskId();
        this.taskBtime = task.getTaskBtime();
        this.taskEtime = task.getTaskEtime();
        this.taskNum = task.getTaskNum();
        this.taskDesc = task.getTaskDesc();
    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskBtime() {
        return taskBtime;
    }

    public void setTaskBtime(String taskBtime) {
        this.taskBtime = taskBtime;
    }

    public String getTaskEtime() {
        return taskEtime;
    }

    public void setTaskEtime(String taskEtime) {
        this.taskEtime = taskEtime;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    @Override
    public String toString() {

        return "taskId=" + taskId+"\ntaskBtime=" + taskBtime + "\ntaskEtime=" +taskEtime + "\ntaskNum=" + taskNum + "\ntaskDesc=" + taskDesc;
    }
    
}
