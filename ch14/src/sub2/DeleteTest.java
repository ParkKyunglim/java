package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		

		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
	
		try {
			// 1단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계
			Statement stmt = conn.createStatement();
			
			// 3단계
			stmt.executeUpdate("DELETE FROM `user1` WHERE `uid`='J101'");
			
			// 4단계 -  Resultset 결과처리 (Select일 경우)
			// 5단계 - 접속 종료

					stmt.close();
					conn.close();
		} catch (Exception e) {
			e.printStackTrace();
	}	
		System.out.println("Delete 완료...");
	
		
	}
}

