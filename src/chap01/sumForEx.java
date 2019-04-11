package chap01;

import java.util.Scanner;

public class sumForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터n까지의 합을 구하시올");
		
		System.out.print("n의 값은 :");
		int n = sc.nextInt();
		
		int sum = 0 ;
		
		for(int i = 1 ; i<=n ; i++) {
			if(i<n) { System.out.print(i+"+");
			}else System.out.print(i);
			sum += i;
		}
		
		System.out.println("="+sum);
	}

}
