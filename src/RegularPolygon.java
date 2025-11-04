// Scott L. Parrish 11/3/2025
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
}
