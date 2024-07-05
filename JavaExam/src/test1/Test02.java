package test1;
import java.util.Scanner;

/*
 * 날짜 : 2024/07/03
 * 이름 : 박경림
 * 내용 : 자바 자료형 연습문제
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt(); // 사용자가 출생 년도를 입력하면 정수로 받음
		
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt(); // 사용자가 태어난 년도를 입력하면 정수로 받음
		
		System.out.print("이름 입력 : ");
		name = sc.next(); // 사용자가 이름을 입력하면 문자열로 받음
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요.\n당신은 올해 만 %d세 입니다.", name, age);
				
		sc.close();
		
				
				
	}

}
