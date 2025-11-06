package tasks.t2;

import java.util.Scanner;

public class Clamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var arg = console.nextLine();
        String[] num = arg.split(",");
        System.out.println(clamp(num));
    }

    public static int clamp(String[] num) {
        var value = Integer.parseInt(num[0].trim());
        var min = Integer.parseInt(num[1].trim());
        var max = Integer.parseInt(num[2].trim());
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    }
}
