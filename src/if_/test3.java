package if_;

import java.util.Scanner;

public class test3 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2 , n3;
      /*
      System.out.println("수 입력");
      n1 = input.nextInt();
      n2 = input.nextInt();
      if( n1 > n2 ) {
         System.out.println("n1이 n2보다 크다");
      }
      if( n2 > n1 ) {
         System.out.println("n2이 n1보다 크다");
      }
      if( n2 == n1 ) {
         System.out.println("같다 같다");
      }
      */
      System.out.println("세 수 입력");
      n1 = input.nextInt();
      n2 = input.nextInt();
      n3 = input.nextInt();
      int max = 0;
      if(n1 > n2) {
         max = n1;
      }
      if(n2 > n1) {
         max = n2;
      }
      if(n3 > max) {
         max = n3;
      }
      System.out.println("가장 큰 수 : "+max);
      /*
      if(n1 > n2 && n1 > n3) {
         System.out.println("n1이 가장 크다");
      }
      if(n2 > n1 && n2 > n3) {
         System.out.println("n2이 가장 크다");
      }
      if(n3 > n1 && n3 > n2) {
         System.out.println("n3이 가장 크다");
      }
      */
   }
}


