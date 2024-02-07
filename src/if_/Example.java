package if_; // 가장 큰 수, 두번째로 큰 수, 마지막 수

import java.util.Scanner;

public class Ex06 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2, n3, max;
      System.out.println("수 입력");
      n1 = input.nextInt();
      n2 = input.nextInt();
      n3 = input.nextInt();
      String result1, result2;
      if(n1 > n2) {
         max = n1;
         result1 = "n1";
         result2 = "n2";
      }else {
         max = n2;
         result1 = "n2";
         result2 = "n1";
      }
      if( n3 > max) {
         System.out.println("n3가장 크다");
         System.out.println(result1+"두번째");
         System.out.println(result2+"세번째");
      }else {
         System.out.println(result1+"가장 크다");
         if(n2 > n1) {
            if(n1 >n3) {
               System.out.println("n1이 두번째");
               System.out.println("n3가 세번째");
            }else {
               System.out.println("n3이 두번째");
               System.out.println("n2가 세번째");
            }
         }else {
            if( n2 >n3) {
               System.out.println("n2이 두번째");
               System.out.println("n3가 세번째");
            }else {
               System.out.println("n3이 두번째");
               System.out.println("n2가 세번째");
            }
         }
      }
      /*
      if( n1 > n2 && n1 > n3) {
         System.out.println("n1이 가장 크다");
         if(n2 > n3) {
            System.out.println("n2 두번째");
            System.out.println("n3 세번째");
         }else {
            System.out.println("n3 두번째");
            System.out.println("n2 세번째");
         }
      }
      if( n2 > n1 && n2 > n3) {
         System.out.println("n2이 가장 크다");
         if(n1 > n3) {
            System.out.println("n1 두번째");
            System.out.println("n3 세번째");
         }else {
            System.out.println("n3 두번째");
            System.out.println("n1 세번째");
         }
      }
      if( n3 > n1 && n3 > n2) {
         System.out.println("n3이 가장 크다");
         if(n1 > n2) {
            System.out.println("n1 두번째");
            System.out.println("n2 세번째");
         }else {
            System.out.println("n2 두번째");
            System.out.println("n1 세번째");
         }
      }
      */
      
   }
}
