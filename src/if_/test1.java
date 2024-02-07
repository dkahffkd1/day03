package if_;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("수 입력");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}
		if(a<b) {
			System.out.println(b);
		}
			
		}
}