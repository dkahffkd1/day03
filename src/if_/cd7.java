package if_; //1조 3번

import java.util.Scanner;

public class cd7 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter String:");
		String str=scan.next();
		
		
		
		if(str.contains("a")) {
			System.out.println("O");
		}
		else {
			System.out.println("x");
		}
		
		
	}
}