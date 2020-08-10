package pkg1;

public class exp_2 {
	
	//((((10-2)+2)-2)*2)/2)
	public int sum(int a,int b)
	{
		int c =a+b;
		System.out.println("the sum result is "+c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("the sub result is "+c);
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("result of mul is " +c);
		return c;
	}
	
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("the result of div is " +c);
	}
	
	public static void main(String[] args) {
		
		numeric_operation obj = new numeric_operation();
		int f= obj.sub(10, 2);
		int d =obj.sum(f, 2);
		int e= obj.sub(d, 2);
		
		int g = obj.mul(e, 2);
		obj.div(g, 2);
		
		
		
		
	}

}
