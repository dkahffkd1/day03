package if_; //3조 3번

import java.util.Scanner;

public class cd10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E;
		System.out.println("수학점수 입력");
		E = sc.nextInt();
		if(E>=90) {
			System.out.println("A학점");
		}else if(E>=80) {
			System.out.println("B학점");
		}else if (E>=70) {
			System.out.println("C학점");
		}else if (E>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
	}
}
