package plana;


public class obe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]); // Number of terms in the Fibonacci series
        long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        long sum=0,k=0;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
        	for(int j=0;j<n;j++)
        	{
        	sum=sum+fib[j];
        	k++;
            System.out.print(fib[j] + (j < n - 1 ? ", " : ""));
        }
        	System.out.println();
        }
        System.out.println(sum);
        System.out.println("total=");
        System.out.print(k);

}
}
