package if_;

public class Ex06 {
	public static void main(String[] args) {
		int n1=10, n2=20, n3=30;
		if( n1 > n2 && n1 > n3) {
			System.out.println("n1이 가장 크다.");
	}
		//가장 큰 수, 두 번째 큰 수, 마지막 수
		if(n1 > n2) {
			if(n1>n3) {
				System.out.println("n1이 가장 크다");
					
			}else {
				System.out.println("n3이 가장 크다");
			}
		}
}
		
}
