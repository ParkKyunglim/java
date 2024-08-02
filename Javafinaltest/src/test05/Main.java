package test05;


class Subject {
	// 속성
    private String subName;
    private Student[] students; // 수강생 목록 저장하는 'Student' 객체 배열
    private int studentCount;

    // 생성자
    public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10]; // 초기 크기 10의 배열
        this.studentCount = 0;
    }

    // 과목을 수강 목록에 추가하고 과목 객체에도 학생을 추가 초기 성적은 0으로 설정
    public void addStudent(Student student) {
        students[studentCount++] = student;
    }    

    public void printSubjectInfo() {
        System.out.println("과목명 : " + subName); // 과목 목록에서 찾아 성적 설정
        System.out.print("수강생 : ");
        
        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i].getName() + ", ");
        }
        
        System.out.println();
    }

    // Getter
    public String getSubName() {
        return subName;
    }
}

class Student {
	// 속성
    private String name;
    private String studentId;
    private Subject[] subjects;
    private int[] scores;
    private int subjectCount;

    // 생성자
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new Subject[10]; // 초기 크기 10의 배열
        this.scores = new int[10];
        this.subjectCount = 0;
    }

    // 메서드
    public void enrollSubject(Subject subject) {        
        subjects[subjectCount] = subject;
        subject.addStudent(this);
        scores[subjectCount++] = 0; // 성적은 아직 입력되지 않음
        
        System.out.println(name + " - " + subject.getSubName() + " 과목 신청완료");
    }

    public void setScore(Subject subject, int score) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].equals(subject)) {
            	scores[i] = score;
            	System.out.println(name + " - " + subject.getSubName() + " 점수 입력완료");    	
                return;
            }
        }        
    }

    public void printStudentInfo() {
        System.out.println("학생명 : " + name);
        System.out.println("아이디 : " + studentId);
        System.out.println("성적");
        for (int i = 0; i < subjectCount; i++) {        	
            System.out.println(" - " + subjects[i].getSubName() + ":" + scores[i]);
        }
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
    	// 과목 생성
        Subject java = new Subject("자바");
        Subject database = new Subject("데이터베이스");

        // 학생 생성
        Student student1 = new Student("김유신", "S001");
        Student student2 = new Student("김춘추", "S002");

        // 학생 과목 수강 신청
        student1.enrollSubject(java);
        student1.enrollSubject(database);
        System.out.println("-------------------------");
        
        // 학생 과목 수강 신청
        student2.enrollSubject(java);
        student2.enrollSubject(database);
        System.out.println("-------------------------");

        // 성적 입력
        student1.setScore(java, 96);
        student1.setScore(database, 90);
        System.out.println("-------------------------");
        
        // 성적 입력
        student2.setScore(java, 86);
        student2.setScore(database, 76);
        System.out.println("-------------------------");

        // Subject 정보 출력
        java.printSubjectInfo();        
        System.out.println("-------------------------");
        
        // Subject 정보 출력
        database.printSubjectInfo();
        System.out.println("-------------------------");
                
        // 학생 정보 출력
        student1.printStudentInfo();
        System.out.println("-------------------------");
        
        // 학생 정보 출력
        student2.printStudentInfo();
        System.out.println("-------------------------");
	}
}