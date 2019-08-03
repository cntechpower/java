package dome;

public class DVD extends Item{
	private String director;
	
	public DVD(String title, String director, int palyingTimes, String comment) {
		//super(); //子类会自动调用父类的构造函数, 会使用super(args1,args2)中的两个参数来调用父类构造函数.super()则不使用参数调用.
		super(title,palyingTimes,comment);
		this.director = director;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DVD=");
		super.print();
		
	}

}
