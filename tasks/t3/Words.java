package tasks.t3;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        int ans = 0;
        String[] arr = inp.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                ans++;
            }
        }
         System.out.println(ans);
    }
}
