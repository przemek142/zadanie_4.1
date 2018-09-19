/**
 * Main
 */
public class Zadanie4_1 {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.setA(3.0);
        triangle.setB(4.0);
        triangle.setC(5.0);

        triangle.printInfo();
        triangle.setA(4.0);
        triangle.printInfo();
        triangle.setB(3.0);
        triangle.printInfo();

        System.out.println("Triangle is rightangle: " + triangle.getIsRightTriangle());
    }
}
