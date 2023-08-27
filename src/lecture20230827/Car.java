package lecture20230827;

public class Car {

    //맴버변수, 필드, 변수
    public String brand;
    public String model;
    public int year;


    //메서드 만드는 법
    //접근제어자 리턴타입 메서드면 (파라미터1, 파라미터2...){ 로직 }
    private int price;

    //기본 생성자
    Car(){}
    //생성자 오버로딩


    //brand만 받는 생성자
    Car(String brand){
        this.brand=brand;
    }
    //brand, price, model, year
    Car(String brand, String model, int year, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    //getter
    public int gerPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int calculateSalePrice(int discount) {
        return this.price -discount;
    }
}
