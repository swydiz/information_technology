package tasks.t1;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var age = console.nextInt();
        System.out.println(checkAge(age));
    }

    public static String checkAge(int age) {
        if (age >= 18) {
            return "совершеннолетний";
        } else {
            return "несовершеннолетний";
        }
    }
}
