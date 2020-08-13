package pkg1;

public class Class2 extends Class1 {
	public void n1()
	{
		super.m5();
		System.out.println("child default method");
	}
	public void n2()
	{
		this.n1();
		System.out.println("child 1 parameterized method");
	}

	public void n3()
	{
		this.n2();
		System.out.println("child 2 parameterized method");
	}

	public void n4()
	{
		this.n5();
		System.out.println("child 3 parameterized method");
	}
	public void n5()
	{
		this.n3();
		System.out.println("child 4 parameterized method");
	}
	
	public static void main(String[] args) {
		Class2 obj =new Class2();
		obj.n4();
	}

}
