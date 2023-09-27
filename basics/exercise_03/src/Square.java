public class Square {
    public double side = 8;
    public double squareArea;

    public void calculateSquareArea() {
        squareArea = Math.pow(side, 2);
        System.out.println("The area of the square is " + squareArea);
    }

}
