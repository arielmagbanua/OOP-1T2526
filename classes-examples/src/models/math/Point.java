package models.math;

public class Point {
    // attributes or instance variables
    public int x, y;

    // constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayPosition() {
        System.out.print("xPos = " + this.x + " yPos = " + this.y);
    }
}