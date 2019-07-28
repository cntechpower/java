package display;

public class Display {
	private int value=0;
	private int limit=0;
	public Display(int limit) {
		this.limit=limit;
	}
	public void tik() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	int getValue(){ //不加限定符,会是friendly类型,只能在同一个包中访问
		return this.value;
	}
	public int publicgetValue(){ //public可以被任何位置访问
		return this.value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display min=new Display(60);
		for (int i=0;i<14;i++) {
			min.tik();
			System.out.println(min.getValue());
			
		}

	}

}
