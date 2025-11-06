package lab4;


public class DivisionTest {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        try {
            if (b == 0) {
                throw new CustomDivisionException("Ошибка. Деление на ноль");
            }
            double ans = (double) a/b;
            System.out.println(ans);
        } catch (CustomDivisionException e) {
            System.err.println(e.getMessage());
            Log.logEx(e);
        }
    }
    
}
