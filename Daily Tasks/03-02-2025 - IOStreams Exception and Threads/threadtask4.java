public class threadtask4 {

    static class MultiplyThread extends Thread {
        int[][] A, B, result;
        int row;

        MultiplyThread(int[][] A, int[][] B, int[][] result, int row) {
            this.A = A;
            this.B = B;
            this.result = result;
            this.row = row;
        }

        public void run() {
            for (int j = 0; j < B[0].length; j++) {
                result[row][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    result[row][j] += A[row][k] * B[k][j];
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] result = new int[A.length][B[0].length];
        
        MultiplyThread[] threads = new MultiplyThread[A.length];
        
        for (int i = 0; i < A.length; i++) {
            threads[i] = new MultiplyThread(A, B, result, i);
            threads[i].start();
        }
        
        for (int i = 0; i < A.length; i++) {
            threads[i].join();
        }
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
