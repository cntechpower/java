package first;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		//int inch;
		double inch;
		System.out.println(1.2-1.1); //0.09999999999999987,浮点数的计算会不准确
		Scanner in=new Scanner(System.in);
		System.out.println("Please input foot:");
		foot=in.nextInt();
		System.out.println("Please input inch:");
//		inch=in.nextInt(); //可以使用nextInt来给double进行赋值
		inch=in.nextFloat();
		System.out.println("Foot="+foot+",inch:"+inch);
		System.out.println((foot+inch/12)*0.3048); //6/12=0
		System.out.println((foot+inch/12.0)*0.3048); //6/12.0=0.5
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"CM");

	}

}
