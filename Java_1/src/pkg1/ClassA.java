package pkg1;

public class ClassA {
	
	public ClassA() {
		this(1,2,3);
		System.out.println("parent default constructor");
	}
	
	public ClassA(int a) {
		this(1,2,3,4);
		System.out.println("parent 1 parameterized constructor");
	}
	public ClassA(int a,int b) {
		this(1);
		System.out.println("parent 2 parameterized constructor");
	}

	public ClassA(int a,int b,int c) {
		System.out.println("Parent 3 parameterized constructor");
	}
	public ClassA(int a,int b,int c,int d) {
		this();
		System.out.println("parent 4 parameterized constructor");
	}
	
	public static void main(String[] args) {
		ClassA obj1 = new ClassA(1,2);
	}
	
	
	
}
