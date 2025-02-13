public class threadtask1 extends Thread {
    public void run() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        threadtask1 thread = new threadtask1();
        thread.start();
    }
}