package com.hello;

public class Student {
    private Pen pen;

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void writeSomething() {
        pen.write();
    }
}
