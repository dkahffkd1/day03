package if_;//2조 3번

import java.util.Scanner;

public class cd4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year, age, born;
	System.out.println("현재 년도를 입력합니다");
	System.out.println("나이를 입력합니다");
	year = sc.nextInt();
	age = sc.nextInt();
	born = year - age;
	if(born == 2000) {
		System.out.println("2000년대에 태어났습니다");
	}else if(born == 1990) {
		System.out.println("1990년대에 태어났습니다");
	}else if(born == 1980) {
		System.out.println("1980년대에 태어났습니다.");
	}else {
		System.out.println("1970년대에 태어났습니다.");
	
	}
	
	
}
}
