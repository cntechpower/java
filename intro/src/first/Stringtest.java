package first;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A';
		char a1='\u0041';
		char c='C';
		System.out.println(c-a);
		System.out.println((char)(a1-('A'-'a')));
		String s=new String("hello");
		String s1=s+12; //12会被转为string,然后进行相加.
		System.out.println(s1);

	}

}
