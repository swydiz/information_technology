package tasks.t3;

import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] arr = inp.split(",");
        int a = Integer.parseInt(arr[0].trim());
        int b = Integer.parseInt(arr[1].trim());
        int c = Integer.parseInt(arr[2].trim());
        System.out.println(is(a, b, c));
        
}

    public static boolean is(int a, int b, int c) {
        return (a + b > c && a + c > b && c + b > a);
    }
}