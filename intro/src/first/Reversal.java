package first;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int source=in.nextInt();
		int result=0;
		do {
			int digit=source%10;
			result=result*10+digit;
			source=source/10;
		}while(source!=0);
		System.out.println("Result is: "+result);

	}

}
