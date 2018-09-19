/**
 * Triangle reprezentuje trójkąt (klasa powinna być zgodna z JavaBeans).
 */
public class Triangle {
    private double a, b, c;
    private boolean isRightTriangle;
    private TriangleTest test = new TriangleTest();


    public void printInfo() {

        System.out.printf("Triangle: %.2f, %.2f, %.2f is ", a, b, c);

        if (isRightTriangle) {
            System.out.println("right triangle.");
        } else {
            System.out.println("NOT right triangle");
        }
    }

    public void setIsRightTriangle(boolean isRightTriangle) {
        this.isRightTriangle = isRightTriangle;
    }

    public void setA(double a) {
        this.a = a;
        test.isRightTriangle(this);
    }

    public void setB(double b) {
        this.b = b;
        test.isRightTriangle(this);
    }

    public void setC(double c) {
        this.c = c;
        test.isRightTriangle(this);
    }

    public boolean getIsRightTriangle() {
        return isRightTriangle;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
