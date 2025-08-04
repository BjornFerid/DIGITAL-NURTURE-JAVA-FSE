package com.example;

public class Student {
    private Pencil pencil;

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

    public void usePencil() {
        pencil.draw();
    }
}
