// Scott L. Parrish 01/21/2026
// SDEV 200 Module 1 Exercise 9.9
// RegularPolygon Class to represent n-sided regular polygons.
//
public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;


    public RegularPolygon() {
    }
    public RegularPolygon(int numberOfSides, double sideLength) {
        n = numberOfSides;
        side = sideLength;
    }
    public RegularPolygon(int numberOfSides, double sideLength, double xCoord, double yCoord) {
        n = numberOfSides;
        side = sideLength;
        x = xCoord;
        y = yCoord;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter() {
        return side * n;
    }
    public double getArea() {
        return n * Math.pow(side, 2) * (4 * Math.tan(Math.PI/n));
    }
}
