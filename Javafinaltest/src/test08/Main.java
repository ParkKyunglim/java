package test08;

class Person {
	protected String name;
	protected String birth;
	
	public Person(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	// 정보 출력 메서드
    public void printPersonInfo() {        
        System.out.println("이름 : " + name);
        System.out.println("생년월일 : " + birth);
    }
}


class Employee extends Person {
	// 속성
    protected String employeeId;
    protected String dept;
    protected int salary;

    // 생성자
    public Employee(String name, String birth, String employeeId, String dept, int salary) {
    	super(name, birth);
        this.employeeId = employeeId;
        this.dept = dept;
        this.salary = salary;
    }

    // 급여 인상 메서드
    public void raiseSalary(int amount) {
    	this.salary += amount;
        System.out.println("급여 인상");
    }
    
    // 부서 변경 메서드
    public void changeDepartment(String newDept) {
        this.dept = newDept;
        System.out.println("부서 변경");
    }

    // 직원 정보 출력 메서드
    public void printEmployeeInfo() {
    	printPersonInfo();
        System.out.println("직원 아이디 : " + employeeId);        
        System.out.println("부서 : " + dept);
        System.out.println("급여 : " + salary);
    }
}

class Developer extends Employee {
    // 속성
    private String field;

    // 생성자
    public Developer(String name, String birth, String employeeId, String dept, int salary, String field) {
        super(name, birth, employeeId, dept, salary);
        this.field = field;
    }

    // 프로그래밍 언어 변경 메서드
    public void changeField(String newField) {
        this.field = newField; // 새로운 분야를 받아 개발 분야 속성을 변경
        System.out.println("개발 분야 변경");
    }

    // 직원 정보 출력 메서드
    public void printDeveloperInfo() {
        super.printEmployeeInfo();
        System.out.println("개발분야 : " + field);
    }
}

public class Main {
    public static void main(String[] args) {
    	Person person = new Person("김유신", "1990-05-07");
        person.printPersonInfo();
        System.out.println("-------------------");
        
        Employee emp = new Employee("김춘추", "1992-07-14", "E001", "영업부", 200);
        emp.printEmployeeInfo();
        System.out.println("-------------------");
                
        Developer dev = new Developer("이순신", "1995-10-21", "D001", "개발부", 300, "프론트엔드");
        dev.printDeveloperInfo();
        System.out.println("-------------------");
        
        // 부서 변경 테스트
        emp.changeDepartment("인사부");
        emp.printEmployeeInfo();
        System.out.println("-------------------");
                
        // 급여 인상 테스트
        dev.changeField("백엔드");
        dev.raiseSalary(50);        
        dev.printDeveloperInfo();
        System.out.println("-------------------");
    }
}