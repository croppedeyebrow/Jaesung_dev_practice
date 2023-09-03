package 변수의스코프;
// 변수가 할당되고 사용되는 범위 확인.


public class VarScopeClass {
    public static void main(String[] args) {
//        int value = 10; // int형으로 선언된 value 변수에 10을 대입
//        int sum = value + 20; // int형으로 선언된 sum에 value의 값 +20
//        System.out.println("SUM의 값 : " + sum);

//           int n =20;
//           if (n > 10) {
//               int m = 30;
//               m = n-10;
//               System.out.println("m 값 : " +m);
//           } // 자바 언어는 블록이 중요.
//           int k = n+m;

        // 문자 자료형 : 자바에서는 유니코드를 사용 (2바이트로 전세계의 모든 문자를 표시), 앞의 1바이트는 ASCII와 동일

//        char ch = 'A'; // 자바에서는 문자는 작은 따옴표를 사용, 실제 저장은 정수값으로 저장 됨. 유니코드로 저장되기 때문.
//        String cha = "A"; // 큰 따오묘는 문자열을 나타냄.
//        char ch2 = 66; //char형은 음수가 올 수 없음[코드값에는 음수가 존재하지 않음, 양수만 존재]
//
//        System.out.println(ch);
//        System.out.println((int)ch); // 명시적으로 형을 int형으로 변경함.
//        System.out.println(cha);
//        System.out.println(ch2);
//        System.out.println((int)ch2);

        //실수, 자료형 : float(4Byte, 32bite) , double(8바이트,64비트), 근사치 계산법, 실수표현은 가급적 줄여야 함.
//        float height = 175.5f;
//        double pi = 3.141592653389793;
        double num1 =0.1;
        for(int i = 0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);



    }
}
