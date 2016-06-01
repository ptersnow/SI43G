
public class Aplicacao {

	public static void main(String[] args) {
		FilaGenerica<String> fila = new FilaGenerica<>();
		fila.add("Nome1");
		fila.add("Nome2");
		fila.add("Nome3");
		
		fila.print();
		
		String nome = fila.remove();
		System.out.println(nome);
		
		fila.print();
		
		
		FilaGenerica<Integer> integerFila = new FilaGenerica<>();
		integerFila.add(3);
		integerFila.add(15);
		integerFila.add(1);
		
		integerFila.print();
		
		Integer i = integerFila.remove();
		System.out.println("Removido: " + i);
		
		integerFila.print();
	}
}
