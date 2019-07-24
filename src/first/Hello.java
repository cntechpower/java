package first;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World,你好");
//		Scanner in=new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
//		System.out.println("2+3="+2+3); //5
//		System.out.println("2+3="+(2+3));
		Scanner in=new Scanner(System.in);
//		System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt())); //需要输入两次
//		int price;
//		price=in.nextInt(); //输入的不是整数会导致java.util.InputMismatchException
//		int amount=100;
//		final int amount=100; //定义常量
//		amount=10; //final的常量不能进行改变
		int amount=100;
		int price=0;
		System.out.print("请输入票面:");
		amount=in.nextInt();
		System.out.print("请输入金额:");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
//		int no_init;
//		System.out.println(no_init); //The local variable no_init may not have been initialized
//		int yes_init = 0;
//		System.out.println(yes_init);
//		int price1=0,amount=0; //init multi variables in one line
	}

}
