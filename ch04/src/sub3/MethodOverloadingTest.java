package sub3;

public class MethodOverloadingTest {
	public static void main(String[] args) {
		
		int r1 = add(3);
		int r2 = add(1, 2);
		double r3 = add(1.0, 2.1);
		String r4 = 
		
	}
	// 오버로드 메서드 정의
	   public static int add(int a) {
	      return a + a;   
	   }
	   
	   public static int add(int a, int b) {
	      return a + b;
	   }
	      
	   public static double add(double a, double b) {
	      return a + b;
	   }   
	   
	   public static String add(String a, String b) {
	      return a + b;
	   }
	   
	   }
}
