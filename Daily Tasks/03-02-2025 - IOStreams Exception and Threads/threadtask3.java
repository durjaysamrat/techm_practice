import java.util.Arrays;

public class threadtask3 {

    static class SortThread extends Thread {
        int[] arr;
        int start, end;

        SortThread(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        public void run() {
            Arrays.sort(arr, start, end);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {5, 2, 8, 1, 3, 7, 4, 6};
        int mid = arr.length / 2;

        SortThread t1 = new SortThread(arr, 0, mid);
        SortThread t2 = new SortThread(arr, mid, arr.length);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}