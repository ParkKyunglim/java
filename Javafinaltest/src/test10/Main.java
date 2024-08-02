package test10;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface Product {
	
    String getName();
    int getPrice();
}

class Clothes implements Product {
    private String name;
    private int price;

    public Clothes(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Food implements Product {
    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}


class Customer {
    private String uid;
    private String name;
    private String hp;

    public Customer(String uid, String name, String hp) {
        this.uid = uid;
        this.name = name;
        this.hp = hp;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }
    
    public String getHp() {
		return hp;
	}
}
class Order {
    private int orderNo;
    private Customer customer;
    private List<Product> products;
    private int totalAmount;

    public Order(int orderNo, Customer customer) {
        this.orderNo = orderNo;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    public int getOrderNo() {
		return orderNo;
	}

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}

class ShoppingMall {
    private List<Customer> customers;
    private List<Order> orders;
    private HashMap<String, List<Order>> customerOrders;

    public ShoppingMall() {
        customers = new ArrayList<>();
        orders = new ArrayList<>();
        customerOrders = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        customerOrders.put(customer.getUid(), new ArrayList<>());
    }

    public void addOrder(Order order) {
        orders.add(order);
        customerOrders.get(order.getCustomer().getUid()).add(order);
    }

    public List<Order> getOrders() {
		return orders;
	}
}

class Electronics implements Product {
    private String name;
    private int price;

    public Electronics(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}




public class Main {
	 public static void main(String[] args) {
       ShoppingMall shoppingMall = new ShoppingMall();

       // 고객 생성
       Customer customer1 = new Customer("A101", "김유신", "010-1234-1001");
       Customer customer2 = new Customer("A102", "김춘추", "010-1234-1002");

       // 고객 추가
       shoppingMall.addCustomer(customer1);
       shoppingMall.addCustomer(customer2);

       // 제품 생성
       Product laptop = new Electronics("노트북", 800000);
       Product tshirt = new Clothes("티셔츠", 15000);
       Product banana = new Food("바나나", 3000);

       // 주문 생성
       Order order1 = new Order(1, customer1);
       order1.addProduct(laptop);
       order1.addProduct(tshirt);

       Order order2 = new Order(2, customer2);
       order2.addProduct(tshirt);
       order2.addProduct(banana);

       // 주문 추가
       shoppingMall.addOrder(order1);
       shoppingMall.addOrder(order2);

       // 모든 주문 출력
       List<Order> orders = shoppingMall.getOrders();
       for (Order order : orders) {
           System.out.println("주문번호 : " + order.getOrderNo());
           System.out.println("고객이름 : " + order.getCustomer().getName());
           System.out.println("주문금액 : " + "￦" + order.getTotalAmount());
           System.out.println("주문목록");
           for (Product product : order.getProducts()) {
               System.out.println(" - " + product.getName() + " ￦" + product.getPrice());
           }
           System.out.println();
       }
   }
}