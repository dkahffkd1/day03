package if_;//7조 2번


import java.util.Scanner;

public class cd12 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age;
	System.out.println("나이를 입력하시오");
	age = sc.nextInt();
	
	if(age<20) {
		System.out.println("10대 입니다,"+ (20-age)+"후에 성인이 됩니다.");
	}else if(age<30) {
		System.out.println("20대 입니다.");
	}
		else if(age<40) {
			System.out.println("30대 입니다.");
	}
		else if(age<50) {
			System.out.println("40대 입니다.");
		}
		else if(age<60) {
			System.out.println("50대 입니다.");
	}
		else if(age<70) {
			System.out.println("60대 입니다.");
		}
		else if(age<80) {
			System.out.println("70대 입니다.");
		}
		else if(age<90) {
			System.out.println("80대 입니다.");
		}
		else if(age<100) {
			System.out.println("90대 입니다.");
		}
		else {
			System.out.println("100살이상 존재하지 않습니다.");
		}
		
	}
	
}
