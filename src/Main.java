// Scott L. Parrish 01/21/2026
// SDEV 200 Module 1 Exercise 9.9
// Main class to test and show the use of RegularPolygon class.
//

public class Main {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The area of the first object is: " + poly1.getArea());
        System.out.println("The perimeter of the first object is: " + poly1.getPerimeter());
        System.out.println("The area of the second object is: " + poly2.getArea());
        System.out.println("The perimeter of the second object is: " + poly2.getPerimeter());
        System.out.println("The area of the third object is: " + poly3.getArea());
        System.out.println("The perimeter of the third object is: " + poly3.getPerimeter());
    }
}