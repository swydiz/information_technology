package tasks.t3;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inp = console.nextLine();
        String[] arr = inp.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals("a") ||  arr[i].toLowerCase().equals("u") || arr[i].toLowerCase().equals("e") ||  arr[i].toLowerCase().equals("o") || arr[i].toLowerCase().equals("i")) {
                count += 1;
               
            }
        }
        
        System.out.println(count);
    } 
}
