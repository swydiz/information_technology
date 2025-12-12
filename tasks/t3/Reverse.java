package tasks.t3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] arr = inp.split(" ");
        System.out.println(revW(arr));
    } 

    public static StringBuilder revW(String[] arr) {
        StringBuilder ans = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                return ans.append(arr[i]);
            }
            ans.append(arr[i]).append(" ");
        }
        return ans;
    }
}
