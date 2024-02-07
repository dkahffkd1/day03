package if_;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		if(num ==0){
			System.out.println("0이다");
		}
			else if(num %3 ==0 && num %4==0) {
			System.out.println("3,4배수");
		}
		else if(num %3 ==0) {
			System.out.println("3배수");
		}
		else if(num %4 ==0) {
			System.out.println("4배수");
		}
		else if(num %3 !=0 && num%4 !=0) {
			System.out.println("배수 아님");
		}
		else {
			System.out.println("0이다");
		}

	}
	}
