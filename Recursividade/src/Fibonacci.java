import java.util.Scanner;

public class Fibonacci {

	public static int fibonacciIterativo(int n) {
		int a, b, c, i;
		
		a = 1;
		b = 1;
		c = 0;
		for (i = 2; i <= n; i++) {
			c = a;
			
			a = a + b;
			b = c;
		}
		
		return a;
	}
	
	public static int fibonacciRecursivo(int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		} else {
			int n1 = fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
			System.out.print(n1 + " ");
			return n1;
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		n = leitor.nextInt();
		
		System.out.println(fibonacciIterativo(n));
		System.out.println(fibonacciRecursivo(n));
	}
}
