package if_; //1조 2번

import java.util.Scanner;

public class cd6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A,B,C, result ;
	
	System.out.println("1.덧셈");
	System.out.println("2.뺄셈");
	System.out.println("3.나눗셈");
	System.out.println("4.곱셈");
	System.out.println("5.나머지");
	
	System.out.println("기능");
	C = sc.nextInt();
	

	
if(C==1) {
	System.out.println("덧셈입력");
	System.out.println("첫번째 값");
	A = sc.nextInt();
	System.out.println("두번째 값");
	B = sc.nextInt();
	result = A+B;
	System.out.println("결과값 : " + result);
}else if(C==2) {
	System.out.println("뺄셈입력");
	System.out.println("첫번째 값");
	A = sc.nextInt();
	System.out.println("두번째 값");
	B = sc.nextInt();
	result = A-B;
	System.out.println("결과값 : " + result);
}else if(C==3) {
	System.out.println("곱셈입력");
	System.out.println("첫번째 값");
	A = sc.nextInt();
	System.out.println("두번째 값");
	B = sc.nextInt();
	result = A*B;
	System.out.println("결과값 : " + result);
}else if(C==4) {
	System.out.println("나눗셈 입력");
	System.out.println("첫번째 값");
	A = sc.nextInt();
	System.out.println("두번째 값");
	B = sc.nextInt();
	result = A/B;
	System.out.println("결과값 : " + result);
}else if(C==5) {
	System.out.println("나머지 입력");
	System.out.println("첫번째 값");
	A = sc.nextInt();
	System.out.println("두번째 값");
	B = sc.nextInt();
	result = A%B;
	System.out.println("결과값 : " + result);
}else {
	System.out.println("해당하는 기능이 없습니다");

}
	
	
	
	
	
}
}
