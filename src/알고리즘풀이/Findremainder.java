package 알고리즘풀이;


// 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 나머지를 return
// num1,num2는 0보다 크고, 100이하.


import java.util.Scanner;

public class Findremainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수(num1)를 입력하세요.");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수(num2)를 입력하세요.");
        int num2 = sc.nextInt();

        int result = num1 % num2;
        System.out.printf("나머지는 %d 입니다" , result );

        sc.close();
    }
}

///////////////////////
//solution 함수를 사용한 케이스.

//import java.util.Scanner;

//public class FindRemainder {
//    // solution 메서드를 클래스 내부에 정의합니다.
//    public static int solution(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 정수(num1)를 입력하세요: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("두 번째 정수(num2)를 입력하세요: ");
//        int num2 = sc.nextInt();
//
//        // solution 메서드를 호출하여 나머지를 계산합니다.
//        int result = solution(num1, num2);
//        System.out.printf("나머지는 %d 입니다.", result);
//
//        sc.close();
//    }
//}



