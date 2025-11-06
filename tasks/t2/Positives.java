package tasks.t2;
import java.util.Scanner;

public class Positives {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var arg = console.nextLine();
        String[] num = arg.split(",");
        System.out.println(sumPos(num));
    }

    public static int sumPos(String[] args) {
        var count = 0;
        for (String i : args) {
            if (Integer.parseInt(i.trim()) > 0) {
                count += Integer.parseInt(i.trim());
            }

        }
        return count;
    }
}
