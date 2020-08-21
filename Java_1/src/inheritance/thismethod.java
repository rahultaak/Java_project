package inheritance;

public class thismethod {
	
	public void method1()
	{
		System.out.println("default method");
		this.method2();
	}
	public void method2()
	{
		System.out.println("1 paramatrized method");
		this.method3();
	}
	public void method3()
	{
		System.out.println("2 paramatrized method");
		this.method5();
	}
	public void method4()
	{
		System.out.println("3 paramatrized method");
		this.method1();
	}
	public void method5()
	{
		System.out.println("4 paramatrized method");
		
	}
	
	public static void main(String[] args) {
		
		thismethod s = new thismethod();
		s.method4();
	}
}
