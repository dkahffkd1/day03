package if_;//2조 2번

import java.util.Scanner;

public class cd3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("연도 입력");
		year = sc.nextInt();
		if(year>=1&& 4000>=year ) {
			if((year%4==0 && year%100 !=0) || year%400==0) {
				System.out.println("1");
			}else {
				System.out.println("0");

			}
		}else {
			System.out.println("1~4000사이를 입력하세요");
		}


	}
}
