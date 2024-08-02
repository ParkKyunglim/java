package test02;


//Product 클래스
class Product {
 private String productId;
 private String productName;
 private int price;
 private int quantity;

 // 생성자
 public Product(String productId, String productName, int price, int quantity) {
     this.productId = productId;
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 // 가격 수정 메소드
 public void updatePrice(int newPrice) {
     this.price = newPrice;
     System.out.println(productName + " 가격 수정 됨"); 
 }

 // 재고 추가 메소드
 public void addStock(int amount) {
     this.quantity += amount;
     System.out.println(productName +" "+ quantity +"개 재고 추가 됨");
 }

 // 제품 정보 출력 메소드
 public void printProductInfo() {
     System.out.println("상품 ID: " + this.productId);
     System.out.println("상품 이름: " + this.productName);
     System.out.println("상품 가격: " + this.price);
     System.out.println("재고 수량: " + this.quantity);
 }
}

//Main 클래스
public class Main {
 public static void main(String[] args) {
     // 상품 객체 생성
     Product product = new Product("P001", "키보드", 35000, 10);

     // 상품 정보 출력
     product.printProductInfo();
     System.out.println("--------------------");

     // 가격 수정 및 재고 관리 테스트
     product.updatePrice(30000);
     System.out.println("--------------------");
     
     product.printProductInfo();
     System.out.println("--------------------");

     // 재고 추가
     product.addStock(5);
     System.out.println("--------------------");
     
     product.printProductInfo();
     System.out.println("--------------------");
 }
}


