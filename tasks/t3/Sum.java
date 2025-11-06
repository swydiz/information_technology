package tasks.t3;

import java.util.Scanner;

public class Sum {
        public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] arr = inp.split("");
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Integer.parseInt(arr[i].trim());
        }
        System.out.println(ans);
    }
}
