package com.example.tango.Models;

public class User {
    private String username;
    private String message;
    private String time;
    private int imageId;
    private int unreadMessages;
    private boolean isOnline;

    public User(String username, String message, String time, int unreadMessages) {
        this.username = username;
        this.message = message;
        this.time = time;
        this.unreadMessages = unreadMessages;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getUnreadMessages() {
        return unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }
}
