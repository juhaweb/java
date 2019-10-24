package sub1;

					//  제네릭 기호가 있다고 선언해줘야함. <T>
public class FruitBox<T> {

	private T fruit;
	
	// Getter : 외부로 클래스의 멤버를 전달하기 위한 메서드 
	public T getF() {
		return fruit;
	}
	
	// Setter : 외부에서 클래스의 멤버를 전달 받기 위한 메서드
	public void setF(T fruit) {
		this.fruit = fruit;
	}
		
	
}
