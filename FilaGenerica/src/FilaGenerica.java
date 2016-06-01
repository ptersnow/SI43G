
public class FilaGenerica<T> {

	private int size;
	private NoGenerico<T> cabeca;
	private NoGenerico<T> cauda;
	
	FilaGenerica() {
		cabeca = null;
		cauda = null;
		size = 0;
	}
	
	public void add(T item) {
		NoGenerico<T> novoNo = new NoGenerico<>();
		novoNo.setItem(item);
		novoNo.setProximo(null);
		
		if (size == 0) {
			cabeca = novoNo;
			cauda = novoNo;
		} else {
			cauda.setProximo(novoNo);
			cauda = novoNo;
		}
		
		size++;
	}
	
	public T remove() {
		T item = null;
		if (size > 0) {
			item = cabeca.getItem();
			cabeca = cabeca.getProximo();
			size--;
		}
		
		return item;
	}
	
	public void print() {
		NoGenerico<T> noGenerico;
		if (size > 0) {
			noGenerico = cabeca;
			while(noGenerico != null) {
				System.out.print(noGenerico.getItem());
				noGenerico = noGenerico.getProximo();
			}
			System.out.println("");
		} else {
			System.out.println("Fila vazia.");
		}
	}
	
	public int getSize () {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public NoGenerico<T> getCabeca() {
		return cabeca;
	}
	
	public void setCabeca(NoGenerico<T> cabeca) {
		this.cabeca = cabeca;
	}
	
	public NoGenerico<T> getCauda() {
		return cauda;
	}
	
	public void setCauda(NoGenerico<T> cauda) {
		this.cauda = cauda;
	}	
}
