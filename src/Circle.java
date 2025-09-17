public class Circle extends Shape {
    Double radius = 100.100;
    Double  PI =3.14 ;
    public Circle(Double radius , Double PI){
        super();
    }
@Override
public Double calculateArea() {
         System.out.println("area of circle is "+PI * radius * radius);
        return PI*radius*radius ;
    }
}
