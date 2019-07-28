package first;

import java.util.Scanner;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr1= {1,2,3,4,5,6,7,8};
//		System.out.println("arr1's length is :"+arr1.length);
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println("arr["+i+"]"+"is: "+arr1[i]);
//		}
		int indexArr=-1;
		int num=in.nextInt();
		for(int i=0;i<arr1.length;i++) {
			if (arr1[i]==num) {
				indexArr=i;
				break;
			}
		}
		if (indexArr==-1) {
			System.out.println(num+"在数组中不存在");
		}else {
			System.out.println(num+"在数组中存在,元素为arr1["+indexArr+"]");
		}
		for (int k : arr1) { //for-each
			if (k==num) {
				System.out.println("Found");
				break;
			}
		}
	}

}
