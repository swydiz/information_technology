package tasks.t3;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        inp = inp.replace(" ", "");
        String[] arr = inp.split(",");
        String[] arr1 = arr[0].split("");
        String[] arr2 = arr[1].split("");
       
        System.out.println(is(arr1, arr2));
    } 

    public static boolean is(String[] arr1, String[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int y = 0; y < arr1.length; y++) {
                if (arr1[i].equals(arr2[y])) {
                    count++;
                    
                }
                
            } 
        }
      
        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int y = i+1; y < arr1.length; y++) {
                if (arr1[i].equals(arr1[y])) {
                    c ++;
                }
            }
        }
        if (count == arr1.length + 2*c) {
            return true;
        }
        return false;
    }

}
