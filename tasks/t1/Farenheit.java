package tasks.t1;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double temp = console.nextInt();
        System.out.println(toFarenheit(temp));
    }

    public static double toFarenheit(double temp) {
        return temp * 9/5 + 32;
    }
}
