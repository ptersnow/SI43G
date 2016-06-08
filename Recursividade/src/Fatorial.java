
public class Fatorial {

	public static int fatorialIterativo (int n) {
		int i;
		int resultado = 1;
		
		System.out.println("fatorialIterativo");
		for (i = 1; i <= n; i++) {
			resultado *= i;
			System.out.print(resultado + " ");
		}
		
		return resultado;
	}
	
	public static int fatorialRecursivo (int n) {
		if (n == 1) {
			System.out.print("1");
			System.out.println();
			System.out.print("1 ");
			return 1;
		} else {
			System.out.print(n + " ");
			int res=fatorialRecursivo(n - 1) * n;
			System.out.print(res + " ");
			return res;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fatorialIterativo(10));
		
		System.out.println();
		System.out.println("fatorialRecursivo");
		
		System.out.println(fatorialRecursivo(10));
		
	}

}
