package a1_basicAlgorithm;
// 연습1-1
// 네 값의 최댓값을 구하여 출력

import java.util.Scanner;

class Max4 {
	
	//--- a, b, c, d의 최댓값을 구하여 반환 ---//
	static int max4(int a, int b, int c, int d) {
		int max = a;						// 최댓값
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;

		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("네 정수를 입력하시오");
		System.out.println("a:"); 
		a=scanner.nextInt();
		
//		Scanner stdIn = new Scanner(System.in);
//		int a, b, c, d;
//
//		System.out.println("네 정수의 최댓값을 구합니다.");
//		System.out.print("a의 값 : ");  a = stdIn.nextInt();
//		System.out.print("b의 값 : ");  b = stdIn.nextInt();
//		System.out.print("c의 값 : ");  c = stdIn.nextInt();
//		System.out.print("d의 값 : ");  d = stdIn.nextInt();
//
//		int max = max4(a, b, c, d);		// a, b, c, d의 최댓값
//
//		System.out.println("최댓값은 " + max + "입니다.");
	}
}

