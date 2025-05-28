package a1_basicAlgorithm;// +와 -를 번갈아 출력(2)(개선)

import java.util.Scanner;

class Alternative2a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
        	System.out.println("몇번 반복?:");
        	n=stdIn.nextInt();
        }while(n<=0);
        for(int i =0; i<n/2;i++) {
        	System.out.print("+-");
        }
        if(n%2==1) {
        	System.out.println("+");
        }
        System.out.println("+와 -를 번갈아 n개 출력합니다.");

//        do {
//            System.out.print("n값: ");
//            n = stdIn.nextInt();
//        } while (n <= 0);
//
//        for (int i = 1; i <= n / 2; i++)
//            System.out.print("+-");
//
//        if (n % 2 != 0)
//            System.out.print("+");
    }
}