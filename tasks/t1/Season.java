package tasks.t1;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var num = console.nextInt();
        System.out.println(season(num));
    }

    public static String season(int num) {
        if (num == 1 | num == 2 | num == 12) {
            return "зима";
        } else if (num >= 3 && num <= 5) {
            return "весна";
        } else if (num >= 6 && num <= 8) {
            return "лето";
        } else if (num >= 9 && num <= 11) {
            return "осень";
        } else {
            return "ошибка";
        }
    }
}
