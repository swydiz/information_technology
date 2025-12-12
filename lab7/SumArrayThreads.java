package lab7;

public class SumArrayThreads {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        int mid = array.length / 2;

        SumThread thread1 = new SumThread(array, 0, mid); 
        SumThread thread2 = new SumThread(array, mid, array.length);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = thread1.getSum() + thread2.getSum();

        System.out.println("Общая сумма элементов массива: " + totalSum);
    }
}
