public class Triangle {
    public double base = 5;
    public double hight = 4;
    public double triangleArea;

    public void calculateTriangleArea() {
        triangleArea = (base * hight) / 2;
        System.out.println("The area of the triangle is " + triangleArea);
    }

}