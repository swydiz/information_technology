package tasks.t3;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        inp = inp.replace("[", "").replace("]", "");
        String[] arr = inp.split(",");
        int max = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i].trim()) > max) {
                max = Integer.parseInt(arr[i].trim());
            } 
           
        }
        for (int i = 0; i < arr.length; i++) { 
             if (Integer.parseInt(arr[i].trim()) < max & Integer.parseInt(arr[i].trim()) >= ans) {
                ans = Integer.parseInt(arr[i].trim());
                
            }
        }

        System.out.println(ans);
    } 

}
