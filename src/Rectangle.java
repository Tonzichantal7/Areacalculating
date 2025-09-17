public class Rectangle extends Shape {
    public Double length;
    public Double width;
    public Rectangle(Double length, Double width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public Double calculateArea() {
        System.out.println("Area of Rectangle is " + length * width);
        return length * width;
    }

}
