public class Circle {
    public double radius = 10;
    public double pi = 3.14;
    public double circleArea;

    public void calculateCircleArea() {
        circleArea = pi * (Math.pow(radius, 2));
        System.out.println("The area of the circle is " + circleArea);
    }

}