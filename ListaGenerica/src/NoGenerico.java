public class NoGenerico<T> {

	private NoGenerico<T> proximo;
	private NoGenerico<T> anterior;
	
	private T info;

	NoGenerico () {
		proximo = null;
		anterior = null;
	}
	
	public NoGenerico<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoGenerico<T> proximo) {
		this.proximo = proximo;
	}

	public NoGenerico<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoGenerico<T> anterior) {
		this.anterior = anterior;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
}