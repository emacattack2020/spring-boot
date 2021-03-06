package com.example.demo.server;

public class Server {
    private String name;
    private int capacity;
    private int id;

    public Server() {
    }

    public Server(String name, int capacity, int id) {
        this.name = name;
        this.capacity = capacity;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
