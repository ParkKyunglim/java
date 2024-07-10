package sub7;


public class AbstractTest {

	public static void main(String[] args) {
		
		
		//추상클래스는 객체생성 X
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		
		
		
		
	}
	
}
