package test07;

class Product {
	// 속성
    protected String productId;
    protected String productName;
    protected int price;
    protected int quantity;

    // 생성자
    public Product(String productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // 상품 정보 출력 메서드
    public void printProductInfo() {
        System.out.println("상품코드 : " + productId);
        System.out.println("상품이름 : " + productName);
        System.out.println("상품가격 : " + price);
        System.out.println("재고수량 : " + quantity);
    }
}

class Computer extends Product {
    // 속성
    private String manufactor;

    // 생성자
    public Computer(String productId, String name, int price, int quantity, String manufactor) {
        super(productId, name, price, quantity);
        this.manufactor = manufactor;
    }

    // 상품 정보 출력 메서드 ★부모 클래스의 printProductInfo 메서드 호출 출력, 추가로 제조사 정보 출력
    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("제조사 : " + manufactor);
    }
}


class Clothes extends Product {
    // 속성
    private String size;

    // 생성자
    public Clothes(String productId, String name, int price, int quantity, String size) {
        super(productId, name, price, quantity);
        this.size = size;
    }

    // 상품 정보 출력 메서드
    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("사이즈 : " + size);
    }
}


public class Main {
    public static void main(String[] args) {
    	// 컴퓨터 객체 생성
        Computer computer = new Computer("E001", "데스크탑", 150, 10, "삼성전자");
        computer.printProductInfo();        
        System.out.println("----------------");      
        
        // 의류 객체 생성
        Clothes tshirt = new Clothes("C001", "T-Shirt", 20, 50, "L");
        tshirt.printProductInfo();
        System.out.println("----------------");
    }
}