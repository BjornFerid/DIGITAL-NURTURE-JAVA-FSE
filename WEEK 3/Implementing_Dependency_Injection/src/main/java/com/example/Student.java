package com.example;

public class Student {
    private Pen pen;


    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void doSomething() {
        pen.write();
    }
}

