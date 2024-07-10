package sub7;

public abstract class Animal {

	// 추상 클래스 - 추상 메서드를 갖는 클래스, 상속을 위한 클래스, 실제 구현 X
	public void move() {
		     System.out.println("Animal move...");
		  }

		
		public abstract void hunt();
		
}
