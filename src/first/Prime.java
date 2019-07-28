package first;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int j) {
			boolean isPrimeStatus=true;
			for (int i=2;i<j;i++) {
				if(j%i==0) {
					isPrimeStatus=false;
					break;
				}
			}
			return isPrimeStatus;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		System.out.println("请输入一个数字:");
//		int n=in.nextInt();
		boolean isPrime=true;
		int count=0;
//		OUT:
		for (int j=1;j<=100;j++) {
			isPrime=true;
			for (int i=2;i<j;i++) {
				if(j%i==0) {
					isPrime=false;
	//				System.out.println(n+"不是素数,它可以被"+i+"整除");
					count++;
					break;
//					break OUT;
				}
			}
		if (isPrime==true) {
			System.out.print(j+",");
		}
//		else {
//			System.out.println(n+"不是素数");
//		}
		}
		System.out.println();
		System.out.println(isPrime(97));

	}

}
