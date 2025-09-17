public class Circle extends Shape {
    public Circle(Double length, Double width) {
        super(length, width);
    }

    public Double calculateArea() {
         System.out.println(length * width );
        return length*width ;
    }
}