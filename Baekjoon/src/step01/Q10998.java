package step01;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
public class Q10998 {
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		System.out.println(a * b);
	}
}
