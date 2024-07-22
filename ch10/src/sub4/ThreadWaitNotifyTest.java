package sub4;


/*
 * 날짜 : 2024/07/22
 * 이름 : 박경림
 * 내용 : 스레드 제어 실습하기 교제 p617 ~ 619
 * 
 * 
 * 
 */
class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "- methodA 작업 실행");
		
		notify(); // 다른 스레드 실행상태로 전환
		try {
			wait(); // 자기 자신을 일시정지상태로 전환
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "- methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}	
		
}
	
	


public class ThreadWaitNotifyTest {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		
		threadA.start();
		threadB.start();
		
		

		
		
	}
	

}
