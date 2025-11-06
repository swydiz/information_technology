package tasks.t1;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var days = console.nextInt();
        System.out.println(daysToWeeks(days));
    }

    public static String daysToWeeks(int days) {
        var week = days / 7;
        var day = days - (week * 7);
        var weekText = "";
        var dayText = "";

        if (week == 1) {
            weekText = "неделя";
        } else if (week >= 2 && week <= 4) {
             weekText = "недели";
        } else {
             weekText = "недель";
        }

        if (day == 1) {
            dayText = "день";
        } else if (day >= 2 && day <= 4) {
             dayText = "дня";
        } else {
             dayText = "дней";
        }
        
        return week + " " + weekText + " и " + day + " " + dayText;
    }
}
