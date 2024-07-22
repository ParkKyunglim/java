package sub5;

class SubThread extends Thread {
	
	private String name;

	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println(name + "main Thread 실행...");
			
			try {
				Thread.sleep(1000); // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}System.out.println(name + "main Thread 종료...");
	}
	
	
public class DaemoThreadTest {
	
	public static void main(String[] args) {
		
		SubThread sub = new SubThread("Sub");
		sub.setDaemon(true); // 데몬스레드 설정
		
		sub.start();
		
		for(int i=0 ; i<10 ; i++) {
			try {
				Thread.sleep(1000); // 스레드 1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main Thread 실행...");
		}
		System.out.println("main Thread 종료...");
		
		
		
		
		
		
		
		
	}
}


}