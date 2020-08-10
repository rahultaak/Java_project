package pkg1;

public class Java_1 {
	int roll_no,ID_no;
	
public void display1()
{
	System.out.println("welcome in automation class");
}

public void display2()
{
	System.out.println("java is a easy language");
}

public static void main(String[] args) {
	
	Java_1 obj = new Java_1();
	obj.display1();
	obj.display2();
	int a=obj.roll_no=23;
	int b=obj.ID_no =00232;
	System.out.println("my roll no is "+a);
	System.out.println("my id number is "+b);
	
}
}
