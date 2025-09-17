import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle AreaOfTriangle = new Triangle(100.2334,120.33);
        AreaOfTriangle.calculateArea();

        Rectangle AreaRectangle = new Rectangle(100.2334,120.33);
        AreaRectangle.calculateArea();
        Circle AreaCircle = new Circle(100.2334,3.14);
        AreaCircle.calculateArea();





    }
}