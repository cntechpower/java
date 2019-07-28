package first;

import java.util.Scanner;

public class Maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int v1,v2,v3,max;
		System.out.println("Please Input Three Numbers:");
		v1=in.nextInt();
		v2=in.nextInt();
		v3=in.nextInt();
		if (v1>v2){
			max=v1;
		}else{
			max=v2;
		}
		
		if(v3>max){
			max=v3;
		}
		System.out.println("Max Number is:"+max);
		//程序应该使用单一出口,不应该在所有地方中进行输出
		
		System.out.println("Please Select:");
		int hello;
		hello=in.nextInt();
		switch(hello) {
		case 1:
			System.out.println("你好");
			break;
		case 2:
			System.out.println("你吃饭了么?");
		case 3:
			System.out.println("再见");
			break;
		default:
			System.out.println("啊, 什么啊?");
			break;
		}

	}

}
