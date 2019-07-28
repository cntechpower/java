package first;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner in=new Scanner(System.in);
			int price=100;
			System.out.println("*********************");
			System.out.println("京沪高铁自动售票机");
			System.out.println("票价:"+price+"元");
			System.out.println("请投币:");
			System.out.println("*********************");
			int coins=in.nextInt();
	//		System.out.println(coins >= price);
			if (coins>=price)
			{
				System.out.println("投币"+coins+"元,找零"+(coins-price)+"元");
			}else {
				System.out.println("投币金额不足!");
			}
		}
	}

}
