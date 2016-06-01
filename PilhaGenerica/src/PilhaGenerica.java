
public class PilhaGenerica<T> {

	private int size;
	private NoGenerico<T> topo;
	
	PilhaGenerica() {
		size = 0;
		topo = null;
	}
	
	public void push(T item) {
		NoGenerico<T> novoNo = new NoGenerico<T>();
		novoNo.setItem(item);
		
		if (size == 0) {
			topo = novoNo;
		} else {
			novoNo.setProximo(topo);
			topo = novoNo;
		}
		
		size++;
	}
	
	public T pop() {
		T item = null; 		
		
		if (size > 0) {
			item = topo.getItem();
			topo = topo.getProximo();
			size--;
		}
		
		return item;
	}
	
	public void print() {
		NoGenerico<T> no = topo;
		
		if (size > 0) {
			while (no != null) {
				System.out.println(no.getItem());
				no = no.getProximo();
			}
		} else {
			System.out.println("Pilha vazia");
		}
	}
}
