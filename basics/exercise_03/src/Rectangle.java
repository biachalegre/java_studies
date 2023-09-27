public class Rectangle {
    public double hight = 10;
    public double width = 5;
    public double rectangleArea;

    public void calculateRectangleArea() {
        rectangleArea = hight * width;
        System.out.println("The area of the rectangle is " + rectangleArea);
    }

}
