package com.task.taskdemo;

public class Triplet {

    private String leftConnection, rightConnection, message, reverse;

    public Triplet(String leftConnection, String message, String rightConnection) {
        this.leftConnection = leftConnection;
        this.rightConnection = rightConnection;
        this.message = message;
    }

    public String getreverse(){
        return new StringBuilder(rightConnection).reverse().toString();
    }

    public String getLeftConnection() {
        return leftConnection;
    }

    public void setLeftConnection(String leftConnection) {
        this.leftConnection = leftConnection;
    }

    public String getRightConnection() {
        return rightConnection;
    }

    public void setRightConnection(String rightConnection) {
        this.rightConnection = rightConnection;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "leftConnection='" + leftConnection + '\'' +
                ", rightConnection='" + rightConnection + '\'' +
                ", message='" + message + '\'' +
                '}';
    }


}
