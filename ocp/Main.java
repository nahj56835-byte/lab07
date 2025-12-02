package ocp;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(2),
            new Square(3),
            new Triangle(5, 2)
        };
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total area: " + calculator.totalArea(shapes));
    }
}
