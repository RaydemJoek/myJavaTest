package test;

public class Homework1 {

	public static void main(String[] args) {
		// 用Java代码编写求出水仙花数abc = a^3 + b^3 + c^3，例如153 = 1^3 + 2^3 + 3^3，3位数
		for (int i = 0; i <= 999; i++) {
			int a = i/100;
			int b = i%100/10;
			int c = i%10;
			if( i >= 100 && a*a*a + b*b*b + c*c*c == i ) {
				System.out.println(i);
			}
		}
	}
}
