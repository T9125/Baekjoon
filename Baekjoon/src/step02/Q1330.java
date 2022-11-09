package step02;

import java.util.Scanner;

//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class Q1330 {
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		if (a < b) {
			System.out.println("<");
		} else if (a > b) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
		
	}
}
