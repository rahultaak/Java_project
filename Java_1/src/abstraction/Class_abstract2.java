package abstraction;

public class Class_abstract2 extends Class_abstract{
	
	public void xyz()
	{
		System.out.println("body given to parant abstract method");
	}
	
	public static void main(String[] args) {
		Class_abstract2 obj = new Class_abstract2();
		
		obj.abc();
		obj.xyz();
	}

}
