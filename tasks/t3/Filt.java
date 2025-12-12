package tasks.t3;

import java.util.Scanner;

public class Filt {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] arr = inp.split(" ");
        int ans = 0;
        for (int i=0; i<arr.length; i++) {
            if (!arr[i].equals("")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
