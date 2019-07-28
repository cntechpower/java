package first;

import java.util.Scanner;

public class Guessnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int randNumber=(int)(Math.random()*100+1);
		int guess;
		int count=0;
		do{
			guess=in.nextInt();
			count=count+1;
			if (guess>randNumber) {
				System.out.println("偏大");
			}
			if (guess<randNumber) {
				System.out.println("偏小");
			}
		}while(guess!=randNumber);
		System.out.println("恭喜你猜对了, 你猜了"+count+"次");

	}

}
