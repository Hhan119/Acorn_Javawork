package test.mypac;

// 포괄 클래스(Generic Class) FruitBox<Apple, Melon, Orange> t1 =null;
public class FruitBox<T>{ 
	//필드 
	private T item;
	
	
	//과일을 포장하는 메소드
	public void pack(T item) {
		this.item=item;
	}
	
	//과일을 꺼내는 메소드
	public T unPack() { 
		return this.item;
	}
}
