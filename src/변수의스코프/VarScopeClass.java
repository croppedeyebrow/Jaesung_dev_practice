package 변수의스코프;
// 변수가 할당되고 사용되는 범위 확인.
public class VarScopeClass {
    public static void main(String[] args) {
//        int value = 10; // int형으로 선언된 value 변수에 10을 대입
//        int sum = value + 20; // int형으로 선언된 sum에 value의 값 +20
//        System.out.println("SUM의 값 : " + sum);

           int n =20;
           if (n > 10) {
               int m = 30;
               m = n-10;
               System.out.println("m 값 : " +m);
           } // 자바 언어는 블록이 중요.
           int k = n+m;


    }
}
