package if_;//1조 1번

import java.util.Scanner;

public class cd5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("정수를 입력하세요");
	int a= sc.nextInt();
	if(a>=0) {
		System.out.println(a+"는 양수입니다");
	}else {
		System.out.println(a+"는 음수입니다");
	}
		
	
}
}
