// Scott L. Parrish 11/3/2025
// SDEV 200 Module 1 Exercise 9.9
// Main class to test and show the use of RegularPolygon class.
//

public class Main {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(poly1.getArea());
        System.out.println(poly2.getPerimeter());
        System.out.println(poly3.getN());
    }
}