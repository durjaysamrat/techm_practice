public class threadtask5 {

    static class PrimeSumThread extends Thread {
        int start, end;
        long sum = 0;

        PrimeSumThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }

        public long getSum() {
            return sum;
        }

        private boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int limit = 100;
        int numThreads = 4;
        int range = limit / numThreads;
        
        PrimeSumThread[] threads = new PrimeSumThread[numThreads];
        
        for (int i = 0; i < numThreads; i++) {
            int start = i * range + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * range;
            threads[i] = new PrimeSumThread(start, end);
            threads[i].start();
        }
        
        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
            totalSum += threads[i].getSum();
        }
        
        System.out.println("Sum of all prime numbers up to " + limit + ": " + totalSum);
    }
}