package practicealone20230828;

public class MyClass2 {
    public static void main(String[] args) {
        int x=190;
        int y=255;

        System.out.println(x+""+y); //중간 공백을 표현할 수 있는 ""가 들어갔지만, 아무 입력값이 없기에 그냥 붙여서 출력된다.

    }
}
class Student{
    public String ID;
    public int password;
    //Student class를 미리 선언하여 Example 에서 실행되도록 한다.
}
class Example{
    public static void main(String[] args) {
        Student s=new Student();
        //Student class의 영향을 받는 객체 s를 새로이 생성한다.
        s.ID="num";
        s.password=12;

        System.out.print(s.ID);
        System.out.println(s.password);
        //아, 참고로 s.ID출력하고 줄바꿈 안했으니까 결과는 num12로 나올 것이다.
    }
}