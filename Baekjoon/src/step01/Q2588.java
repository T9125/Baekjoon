package step01;

import java.util.Scanner;

//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
public class Q2588 {
	public static void main(String[] args) {
		int a;
		String b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.next();
		
		sc.close();
		
		//charAt(index): 문자열을 문자들이 모인 배열이라고 보고 인덱스를 참조하여 해당 문자를 반환한다. 이때 반환되는 값은 아스키코드 값인 문자(char)이다.
		//즉 charAt(index)는 아스키코드 값이 나온다는 것을 뜻하며, 해당 값을 아스키코드 값이 아니게 하기 위해 '0'을 뺀다. '0'은 아스키코드 48이다.   
		System.out.println(a * (b.charAt(2) - '0'));
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a * (b.charAt(0) - '0'));
		System.out.println(a * Integer.parseInt(b));
	}
}
