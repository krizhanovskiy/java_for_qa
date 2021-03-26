package ru.stqa.jfqa.sandbox;

public class Square {

    public Double l;

    public Square(Double l) {
        this.l = l;
    }

    public double area() {
        return this.l * this.l;
    }
}
