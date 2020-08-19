package pkg1;

public class polymorphism {
	
	public void sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("the result is "+ c);
	}
	public int sum(int a,int b,int d)
	{
		int c;
		c=a+b+d;
		System.out.println("the result is "+ c);
		return c;
	
	}
	public static void main(String[] args) {
		polymorphism obj = new polymorphism();
		obj.sum(2, 10, 45);
	}

}
