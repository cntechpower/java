package first;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fahrenheit 华氏度
		//centigrade 摄氏度
		int fahreheit;
		//int centigrade;
		Scanner in=new Scanner(System.in);
		System.out.println("Please input ℉");
		fahreheit=in.nextInt();
//		System.out.println("Please input ℃");
//		centigrade=in.nextInt();
//		System.out.println("℃ is: "+(fahreheit-32/(9/5))); //input 100, output 68
//		System.out.println(32/((float)(9/5.0)));
		System.out.println("℃ is: "+(int)(((fahreheit-32)/(9/5.0))));
		

	}

}
