package generics;

class Apple {
	int price;
	String kind;
	
	
	Apple() {}
	
	 Apple(int price,String kind) {
		this.price =price;
		this.kind = kind;
	}
	 
	 
	
	
	@Override
	public boolean equals(Object obj) {
		Apple a = (Apple) obj;
		return this.kind.equals(kind);
	}
}
class Orange {
	
}
public class Box<T> {
	T box;
	public void setBox(T box) {
		this.box = box;
				
	}
	
	public T getBox() {
		return box;
	}
	
}
