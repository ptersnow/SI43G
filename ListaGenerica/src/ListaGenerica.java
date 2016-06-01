public class ListaGenerica<T> {

	private NoGenerico<T> head = null;
	private NoGenerico<T> tail = null;
	
	public void insereNoFinal (T item) {
		NoGenerico<T> novoNo = new NoGenerico<T>();
		novoNo.setInfo(item);
		
		if (tail != null) {		
			novoNo.setAnterior(tail);
			tail.setProximo(novoNo);
			tail = novoNo;
		}
		else {
			if (head == null) {
				head = novoNo;
			}
			
			tail = novoNo;
		}
	}
	
	public void insereNoInicio (T item) {
		NoGenerico<T> novoNo = new NoGenerico<T>();
		novoNo.setInfo(item);
		
		if (head != null) {		
			novoNo.setProximo(head);
			head.setAnterior(novoNo);
			head = novoNo;
		}
		else {
			if (tail == null) {
				tail = novoNo;
			}
			
			head = novoNo;
		}
	}
	
	public NoGenerico<T> getHead() {
		return head;
	}
	
	public NoGenerico<T> getTail() {
		return tail;
	}
}
