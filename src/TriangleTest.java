public class TriangleTest {

    /**
     * isRightTriangle zwraca true, jeżeli triangle jest prostokątny
     *
     * @param triangle
     * @return
     */
    public boolean isRightTriangle(Triangle triangle) {

        if (triangle.getA() * triangle.getA() == triangle.getB() * triangle.getB() + triangle.getC() * triangle.getC() ||
                triangle.getB() * triangle.getB() == triangle.getA() * triangle.getA() + triangle.getC() * triangle.getC() ||
                triangle.getC() * triangle.getC() == triangle.getA() * triangle.getA() + triangle.getB() * triangle.getB()) {
            triangle.setIsRightTriangle(true);
        } else {
            triangle.setIsRightTriangle(false);
        }

        return triangle.getIsRightTriangle();
    }


}
