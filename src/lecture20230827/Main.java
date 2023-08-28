package lecture20230827;

public class Main {
    public static void main(String[] args) {

        // Car 클래스의 객체 생성
        Car car1 = new Car();
        car1.brand = "bmw";
        car1.model = "x5";
        car1.year = 2023;
        car1.setPrice(100000);
        System.out.println("car1의 브랜드는"+car1.brand);

        Car car2 = new Car("benz");
        car2.model = "E-class";
        car2.year = 2022;
        car2.setPrice(200000000);
        System.out.println("car2의pr77개 브랜드는 "+car2.brand+" "+"가격은 " + car2.gerPrice());

        Car car3 = new Car("audi", "Sclass", 2023, 10000000);
        int salePrice = car3.calculateSalePrice(10);
        System.out.println(("car3의 브랜드, 모델, 연식, 가격은")+ salePrice);
    }
}
