package tasks.t3;

import java.util.ArrayList;
import java.util.Scanner;

public class Filter {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        inp = inp.replace(" ", "").replace("[", "").replace("]", "");
        String[] arr = inp.split(",");
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                ans.add(Integer.parseInt(arr[i]));
            }
        }
        System.out.println(ans);
    } 
}
