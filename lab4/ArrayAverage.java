package lab4;

public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {1, 2, "hello", 4, 5};
        int sum = 0;
        int count = 0;
        try {
            for (int i = 0; i <= arr.length; i++) { // намеренно выходим за границы
                if (arr[i] instanceof Integer) {
                    sum += (int) arr[i];
                    count++;
                } else {
                    throw new NumberFormatException("Элемент "  + arr[i] + " не является числом");
                }
            }
            double ans = (double) sum / count;
        System.out.println(ans);   
    } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Выход за границу массива");   
    } catch (NumberFormatException e) {
        System.err.println("Неверные данные: " + e.getMessage());
    } 
    
}
}
