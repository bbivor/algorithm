package chap01;

import java.util.Scanner;

public class sumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하시오");
		
		System.out.println("n의 값");
		
		int sum = 0;
		
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		
		System.out.println("1부터 n까지의 합은"+sum+"입니다.");
	}

}
