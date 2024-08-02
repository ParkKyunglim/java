package test01;
/*
 * 날짜 : 2024/08/01
 * 이름 : 박경림
 * 내용 : 자바 총정리 문제 
 */



class StudentScore {
	// 속성
    private String studentName;
    private String studentId;
    private String subject;
    private double score; // 실수형 변수
    
    // 생성자: 객체가 생성될 때 호출, 초기화
    public StudentScore(String studentName, String studentId, String subject, double score) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }

    // 성적 수정 메서드
    public void updateScore(double newScore) {
        if (newScore >= 0.0 && newScore <= 100.0) { // 점수가 0~100 사이인지 확인 -> 범위 내에 있으면 "수정 완료" 출력
            this.score = newScore;
            System.out.println("점수 수정 완료");
        } else {
            System.out.println("잘못된 점수 입력");
        }
    }

    // 성적 조회 메서드 ★현재 저장된 점수를 반환하는 메서드
    public double getScore() {
        return score;
    }

    // 학생 정보 출력 메서드
    public void printStudentInfo() {
        System.out.println("학생이름 : " + studentName);
        System.out.println("학생 ID : " + studentId);
        System.out.println("과목 : " + subject);
        System.out.println("점수 : " + score);
    }    
}

public class Main {
	public static void main(String[] args) {
        // 학생 성적 객체 생성
        StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);

        // 학생 정보 출력
        student.printStudentInfo();
        System.out.println("--------------------");

        // 성적 수정 및 조회 테스트
        student.updateScore(98.0);
        System.out.println("--------------------");
        
        // 유효하지 않은 성적 입력
        student.updateScore(102.0);
        System.out.println("--------------------");
        
        // 학생 정보 출력
        student.printStudentInfo();
        System.out.println("--------------------");        
    }
}







