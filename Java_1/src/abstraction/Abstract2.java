package abstraction;

public class Abstract2 implements Abstract{
	
public void abc()
{
	System.out.println("body given to abc method");
}

public void xyz()
{
	System.out.println("body given to xyz method");
}

public static void main(String[] args) {
	
	Abstract2 obj = new Abstract2();
	obj.abc();
	obj.xyz();
}
}
