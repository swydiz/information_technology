package tasks.t3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] arr = inp.split(" ");
        System.out.println(revW(arr));
    } 

    public static String revW(String[] arr) {
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                return ans += arr[i];
            }
            ans += arr[i] + " ";
        }
        return ans;
    }
}
