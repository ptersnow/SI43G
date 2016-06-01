
public class Aplicacao {

	public static void main(String[] args) {
		PilhaGenerica<String> stringPilhaGenerica = new PilhaGenerica<String>();
		stringPilhaGenerica.push("abacaxi");
		stringPilhaGenerica.push("maca");
		stringPilhaGenerica.push("laranja");

		stringPilhaGenerica.print();
		
		String retorno = stringPilhaGenerica.pop();
		System.out.println("Removido: " + retorno);
		
		System.out.println();
		stringPilhaGenerica.print();
	}

}
