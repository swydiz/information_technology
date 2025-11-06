package tasks.t2;
import java.util.Scanner;

public class Dublicates {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var arg = console.nextLine();
        String[] num = arg.split(",");
        System.out.println(has(num));
    }

    public static boolean has(String[] num) {
        for (var i = 0; i < num.length; i++) {
            for (var y = i+1; y < num.length; y++) {
            if (Integer.parseInt(num[i].trim()) == Integer.parseInt(num[y].trim())) {
                return true;
            } 
        }
        }
         return false; 
    }
}
