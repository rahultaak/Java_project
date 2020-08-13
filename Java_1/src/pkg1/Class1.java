package pkg1;

public class Class1 {
	public void m1()
	{
		this.m2();
		System.out.println("parent default method");
	}
	public void m2()
	{
		System.out.println("Parent 1 parameterized method");
				
	}
	public void m3()
	{
		this.m1();
		System.out.println("parent 2 parameterized method");
				
	}
	public void m4()
	
	{
		this.m3();
		System.out.println("parent 3 parameterized method");
				
	}
	public void m5()
	{
		this.m4();
		System.out.println("parent 4 parameterized method");
				
	}
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.m5();
	}



}
