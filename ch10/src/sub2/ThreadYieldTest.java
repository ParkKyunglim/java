package sub2;



class Sub1Thread extends Thread {
	
	@Override
	public void run() {
	
		for(int i=0 ; i<1000 ; i++) {
		System.out.println("Sub1 Thread 실행..." + i);
			
		
		Thread.yield(); // 다른 스레드에게 실행 양보	
		}
	}
}

	
class Sub2Thread extends Thread {
		
		@Override
		public void run() {
		
			for(int i=0 ; i<1000 ; i++) {
			System.out.println("Sub2 Thread 실행..." + i);
				
				
			
		}
	}	
	
	

public class ThreadYieldTest {
	
	public static void main(String[] args) {
	
		
		Sub1Thread sub1 = new Sub1Thread();
		Sub2Thread sub2 = new Sub2Thread();
		
		sub1.start();
		sub2.start();
		
		System.out.println("main 스레드 종료...");
		
		
		
	}
}
}
