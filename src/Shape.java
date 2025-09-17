public class Shape {
    public Double length;
    public Double width;
    public  Double PI;
    public Shape(){
        length = 100.1045;
        width = 200.290;
    }
    public Shape( Double ShapesLength,Double ShapesWidth ) {
        this.length = ShapesLength;
        this.width = ShapesWidth;
    }
    public Double calculateArea(){

        System.out.println(length * width);
        return length*width;

    }

}
