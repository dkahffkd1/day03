package if_;

import java.util.Scanner;//2조 1번

public class cd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("점수 입력");
		System.out.println("학년 입력");
		a = sc.nextInt();
		b = sc.nextInt();


		if(a>=60) {
			if(b !=4) {
				System.out.println("합격");

			}else if(a>=70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}

	}

}
