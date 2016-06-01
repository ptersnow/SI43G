public class NoGenerico<T> {
	private T item;
	private NoGenerico<T> proximo;
	
	public NoGenerico() {
		this.proximo = null;
	}
	
	public NoGenerico(T item) {
		this.item = item;
		this.proximo = null;
	}
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public NoGenerico<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(NoGenerico<T> proximo) {
		this.proximo = proximo;
	}	
}