public class Triangle extends Shape{
public Triangle(Double length, Double width) {
    super(length, width);
}
@Override
public Double calculateArea(){
        System.out.println("Area ofTriangle is " + (length * width)/2);
        return (length*width)/2;
    }
    }


