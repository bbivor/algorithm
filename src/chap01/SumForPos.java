package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		}while (n<=0);
		
		int sum = 0;
		
		for(int i = 0 ; i<=n ; i++) {
			sum += i;
		}
		
		System.out.println("1분터 "+n+"까지의 합"+sum+"입니다.");
	}

}
