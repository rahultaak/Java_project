package pkg1;

public class Constructor {
	public Constructor() {
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public Constructor(int a) {
		this();
		System.out.println("1 paramatrised constructor");
	}
	public Constructor(int a,int b) {
		this(1);
		System.out.println("2 paramatrised constructor");
	}
	public Constructor(int a,int b,int c) {
		this(1,2);
		System.out.println("3 paramatrised constructor");
	}
	public Constructor(int a,int b,int c,int d)
	
	{
		
		System.out.println("4 paramatrised constructor");
	}
	public static void main(String[] args) {
		Constructor s = new Constructor(1,2,3);
	}

}
