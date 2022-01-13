package com.nikita.prvztasks;

public class Main {
    public static void main(String[] args) {

        new Server((request, response) -> {
            return "<html><body><h1>Hello, naive</h1></body></html>";

        }).bootstrap();
    }
}
