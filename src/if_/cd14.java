package if_;//5조 1번

import java.util.Scanner;

public class cd14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, money;
		System.out.println("나이를 입력");
		age = sc.nextInt();
		
		System.out.println("금액 입력");
		money = sc.nextInt();

		if(10<=age && age<=15) {
			if(money>=13000) {
				System.out.println("표를 구매할 수 있습니다");
			}
			else {
				System.out.println("표를 구매할 수 없습니다.");
			}
		}
		if(age>=19) {
			if(money>=15000) {
					System.out.println("표를 구매할 수 있습니다.");
			}else{
				System.out.println("표를 구매할 수 없습니다.");
			}
		}else {
			System.out.println("표를 구매할 수 없습니다.");
		}
		
	}
}
