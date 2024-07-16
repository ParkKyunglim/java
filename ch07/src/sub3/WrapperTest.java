package sub3;


/*
 * 날짜 : 2024/07/15
 * 이름 : 박경림
 * 내용 : 자바 Wrapper 클래스 실습하기
 * 
 */
public class WrapperTest {

	public static void main(String[] args) {
		
		// 기본타입(Primitive)
		int		var1 = 1;
		double 	var2 = 3.14;
		boolean var3 = true;
		
		// 포장
		Integer box1 = var1;
		Double box2 = var2;
		Boolean box3 = var3;
		
		System.out.println("box1 : " + box1);
		System.out.println("box2 : " + box2);
		System.out.println("box3 : " + box3);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "2.12";
		String str3 = "false";
		
		
		
		
		
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		// 문자열 -> Wrapper 변환
		
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		
		// Wrapper  -> 문자열 변환
		int		r1 = w1;
		double 	r2 = w2;
		boolean r3 = w3;
		
		System.out.println("wr1 : " + wr1);
		System.out.println("wr2 : " + wr2);
		System.out.println("wr3 : " + s3);
		
		// Wrapper  -> 기본타입 변환
		
		
		// 문자열 -> 기본타입 변환
		
	}
}
