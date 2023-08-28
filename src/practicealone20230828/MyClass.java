package practicealone20230828;

public class MyClass {
    public static void main(String[] args) {
        int a = 10;
        double b=a;

        double c=20;
        int d= (int) c;

        System.out.println();
    }
}

class Test{
    public static void main(String[] args) {

        int a=2;
        int b=3;

        System.out.print(a);    //print후 줄바꿈을 하지 않는다.
        System.out.println(b);  //print후 줄바꿈을 한다.



        final double PI = 3.0; //final은 상수 선언 함수이다. 이후에 코드 내에서는 이를 바꿀 수 없다.
        double won = PI*2;
        System.out.println(won);
    }

}

