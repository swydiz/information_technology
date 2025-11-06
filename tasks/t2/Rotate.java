package tasks.t2;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var arg =  console.nextLine();
        int start = arg.indexOf('[');
        int end = arg.indexOf(']');
        String content = arg.substring(start + 1, end);
        String[] num = content.split(",");
        System.out.println(Arrays.toString(rotate(num)));
    }
    public static String[] rotate(String[] num) {
        String[] a = new String[num.length];
        a[0] = (num[num.length - 1]).trim();
        for (var i = 1; i < num.length; i++) {
            a[i] = num[i-1].trim();
        }
        return a;
    } 
}
