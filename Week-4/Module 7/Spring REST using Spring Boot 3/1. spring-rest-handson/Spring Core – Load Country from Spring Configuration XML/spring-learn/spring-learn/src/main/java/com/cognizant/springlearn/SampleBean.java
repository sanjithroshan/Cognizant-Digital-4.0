package com.cognizant.springlearn;

public class SampleBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}
