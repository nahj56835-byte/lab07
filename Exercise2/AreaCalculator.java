public class AreaCalculator {
    public double totalArea(Shape[] shapes) {
    double total = 0;
    for (Shape s : shapes) {
        total += s.area();
    }
    return total;
}
}
