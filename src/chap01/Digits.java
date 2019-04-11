package chap01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n ;
		System.out.println("2자리의 정수를 입력해주세요.");
		
		do {
			System.out.print("입력 : ");
			n = sc.nextInt();
		}while (n<10 || n>99);
		
		System.out.println("답은"+n);
	}


}
