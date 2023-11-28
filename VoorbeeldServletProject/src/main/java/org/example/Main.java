package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            new ServletServer().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}