package if_; //3조 1번

import java.util.Scanner;

public class cd8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 국어,영어,수학,점수,학년,평균,총점;
		System.out.println("국어 점수");
		국어 = sc.nextInt();
		System.out.println("영어 점수");
		영어 = sc.nextInt();
		System.out.println("수학 점수");
		수학 = sc.nextInt();
		평균 = (국어+영어+수학)/3;
		System.out.println("학년");
		학년 = sc.nextInt();
		총점 = 국어+영어+수학;

		System.out.println(총점);
		System.out.println(평균);
		if(1<=학년 && 3>=학년) {
			if(평균>=65) {
				System.out.println("합격입니다");
			}else {
				System.out.println(65-평균+"점 미달로 불합격입니다.");
			}
		}
		if(4<=학년 && 5>=학년){
			if(평균>=75) {
				System.out.println("합격입니다");
			}else {
				System.out.println(평균-75 +"점 미달로 불합격입니다.");
			}

		}if(6<=학년) {
			if(평균>=80) {
				System.out.println("합격입니다.");

			}else {
				System.out.println(80- 평균+"미달로 불합격 입니다.");
			}
		}
	}
}
/* 1. package if_day03;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade;
		int kor, eng, math;
		int sum;		
		double avg;
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		sum = kor + eng + math;
		avg = sum / 3.0;
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +avg);
		if(1 <= grade && 3 >= grade) {
			if(avg >= 65) {
				System.out.println("합격입니다.");
			}
			else {	
				System.out.println(65 - avg +"점 미달로 불합격입니다.");
			}
		}
		if(4 <= grade && 5 >= grade) {
			if(avg >= 75) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println(75 - avg +"점 미달로 불합격입니다.");
			}
		}
		if(grade == 6) {
			if(avg >= 80) {
				System.out.println("합격입니다.");
			}
			else {	
				System.out.println(80 - avg +"점 미달로 불합격입니다.");
			}		
		}
	}
}
*/