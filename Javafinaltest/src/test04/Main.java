package test04;


class Book {
	// 속성
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed; // 초기값: false

    // 생성자
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // 메서드
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("도서대출 : " + title);
        } else {
            System.out.println(title + " 이미 대출됨");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("도서반납 : " + title);
        } else {            
            System.out.println(title + " 이미 반납됨");
        }
    }

    public void getBookInfo() {        
        System.out.println("도서명 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("대출여부 : " + (!isBorrowed ? "가능" : "불가능"));
    }

    // Getter 도서 제목 반환 메서드
    public String getTitle() {
        return title;
    }
}

class Member {
	// 속성
    private String name;
    private String memberId;
    private Book borrowedBook;

    // 생성자
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    // 메서드
    public void borrowBook(Book book) {
        book.borrowBook();
        borrowedBook = book;
    }

    public void returnBook(Book book) {
        book.returnBook();
        borrowedBook = null;
    }

    public void getMemberInfo() {
    	System.out.println("회원명 : " + name);
    	System.out.println("아이디 : " + memberId);
    	
    	if(borrowedBook != null) {
    		System.out.println("대출한 도서 : " + borrowedBook.getTitle());
    	}else {
    		System.out.println("대출한 도서 : 없음");
    	}    	
    }
}

//Main 클래스
public class Main {
public static void main(String[] args) {
	// 도서 생성
    Book book = new Book("이것이 자바다", "신용권", "101-1234-1001");
    
    // 회원 생성
    Member member = new Member("홍길동", "A001");

    // 도서 정보 출력
    book.getBookInfo();
    System.out.println("--------------------");
    
    // 도서 대출
    member.borrowBook(book);
    System.out.println("--------------------");
    
    // 도서 정보 출력
    book.getBookInfo();
    System.out.println("--------------------");
            
    // 회원 정보 출력
    member.getMemberInfo();
    System.out.println("--------------------");
            
    member.borrowBook(book);
    System.out.println("--------------------");
    
    // 도서 반납
    member.returnBook(book);
    System.out.println("--------------------");        

    // 회원 정보 출력
    member.getMemberInfo();
    System.out.println("--------------------");
}
}