package sub2;

public class Book {
	// 도서관 관리 시스템의 일부로 Book 클래스를 정의하시오. 이 클래스는 다음 요구사항을 충족
	
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	// 생성자 : 초기화
	public Book (String title, String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = availableCopies;
		
	}
	
	
	
	
	public boolean borrowBook() { 
		
		if(availableCopies > 0) {
			availableCopies--;
			return true;
		}
			return false;
		}
		
			
		
	public void returnBook() {
			availableCopies++;
	
		}

	public void show() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("책 저자 : " + this.author);
		System.out.println("책 ISBN : " + this.isbn);
		System.out.println("이용 가능한 복사본 수 : " + this.availableCopies);
		
	}
	
	
	
	

	
	// Setter
	public String getTitle() {
		return title;
			}
	
	public void setTitle(String title) {
		
	}
			
	
	public String getauthor() {
		return title;
			}
	
	public void setAuthor(String author) {
		this.author = title;
			}
	
	
	
	public String getIsbn() {
		return isbn;
			}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
			}
	
	
	
	
	public int getAvailableCopies() {
		return availableCopies;
			}
	
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
			}

}
