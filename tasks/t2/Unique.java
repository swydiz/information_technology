package tasks.t2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var input = console.nextLine();
        
        String cleaned = input.replace("[", "").replace("]", "");
        String[] line = cleaned.split(",");
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String str : line) {
            if (!str.trim().isEmpty()){
            numbers.add(Integer.parseInt(str.trim()));}
            }
        ArrayList<Integer> uniq = new ArrayList<>();
        for (Integer nm: numbers) {
            if (!uniq.contains(nm)) {
                uniq.add(nm);
            }
        }
    Collections.sort(uniq);
        System.out.println(uniq.toString().replace(" ", ""));
        }
}
