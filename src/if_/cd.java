package if_;

import java.util.Scanner;

public class cd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A,B,C,D,E,F, result;
		
	F = 400;
	
	System.out.println("시험 점수");
	A= sc.nextInt();
	B= sc.nextInt();
	C= sc.nextInt();
	D= sc.nextInt();
	E= sc.nextInt();
	result = A+B+C+D+E;
	
	if((A<60) || (B<60) || (C<60) || (D<60) ||(E<60)) {
		System.out.println("불합격 입니다.");
	}
	else {
		System.out.println("합격 입니다.");
	}
	
	
	if(result > 400) {
		System.out.println("합격 입니다");
		
	}else {
		System.out.println("불합격 입니다.");
	}
}
}
