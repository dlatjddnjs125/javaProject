package generics;

public class Product<T, M> {
	private T kind;
	private M model;

	public void setKind(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setModer(M model) {
		this.model = model;

	}

	public M getModel() {
		return model;
	}

}
