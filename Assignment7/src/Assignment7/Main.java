package Assignment7;

import java.util.*;
import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[]args){

    Shape[] ShapeArray = new Shape[10];

    Random rand = new Random();

    for( int i=0 ; i< 10 ; i++){

        switch (rand.nextInt(3)){
            case 0:
                ShapeArray[i] = new Circle(rand.nextInt(10));
                break;
            case 1:
                ShapeArray[i] = new Rectangle(rand.nextInt(10));
                break;
            case 2:
                ShapeArray[i] = new Square(rand.nextInt(10));
                break;
        }
    }

        System.out.println("before sorting the shapes:\n");
        for(Shape shape: ShapeArray) {
            System.out.format("%s\n", shape.toString());
        }

        Arrays.sort(ShapeArray);
        System.out.println("\n");

        System.out.println("After sorting the shapes:\n");
        for(Shape shape: ShapeArray) {
            System.out.format("%s\n", shape.toString());
        }

        }

    }

