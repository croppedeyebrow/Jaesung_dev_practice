package 상수와리터럴;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이번 달 총 수입을 입력하세요");
        int income = sc.nextInt();
        System.out.println("당신이 내야 할 세금은 " +income*TAX_RATE);

    }


}
