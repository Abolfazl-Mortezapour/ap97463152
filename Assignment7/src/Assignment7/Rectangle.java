package Assignment7;

import java.awt.*;

public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle(Double width , Double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(int nextInt) {

    }

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String getSize() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String toString() {
        return "Rectangle"+"\t"+width+"\t"+length+"\t"+ getArea()+"\t"+ getPerimeter();
    }

}