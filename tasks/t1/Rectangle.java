package tasks.t1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double len = console.nextDouble();
        double wid = console.nextDouble();
        System.out.println(rectangleArea(len, wid));
    }

    public static double rectangleArea(double len, double wid) {
        return len * wid;
    }
    
}