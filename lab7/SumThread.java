package lab7;

class SumThread extends Thread {
    private int[] array;  
    private int start;   
    private int end;     
    private int sum = 0;  

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
