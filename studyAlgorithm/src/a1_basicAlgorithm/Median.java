package a1_basicAlgorithm;
// 3개의 정숫값을 입력하고 중앙값을 구하여 출력

import java.util.Scanner;

class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a 값 : ");  
        int a = stdIn.nextInt();
        System.out.print("b 값 : ");  
        int b = stdIn.nextInt();
        System.out.print("c 값 : ");  
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}