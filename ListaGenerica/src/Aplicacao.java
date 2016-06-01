public class Aplicacao {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Augusto");
		Cliente cl2 = new Cliente("Jose");
		Cliente cl3 = new Cliente("Maria");
		
		ListaGenerica<Cliente> listaCliente = new ListaGenerica<>();
		listaCliente.insereNoInicio(cl1);
		listaCliente.insereNoInicio(cl2);
		listaCliente.insereNoFinal(cl3);

		NoGenerico<Cliente> no = listaCliente.getHead();
		while (no != null) {
			System.out.println(no.getInfo().getNomeCompleto());
			no = no.getProximo();
		}		
	}

}