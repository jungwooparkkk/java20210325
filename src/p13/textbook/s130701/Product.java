package p13.textbook.s130701;

public class Product<T, M> {
	private T Kind;
	private M model;
	
	public T getKind() {
		return Kind;
	}

	public void setKind(T kind) {
		Kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
	
}
class Tv {}