final class final1 //final class
{	final String b;{	//Instance member;
	b="Ganesh";
}
	final void met() //final method
	{
		final String a="Raaj";//local variable
		System.out.println("Ganesh"+a);
	}
	
	int add(final int a,final int b)//Parameter
	{
		return a+b;
	}
}										//In the derived class Final class cannot be overidden

public class FinalExample {
public static void main(String[] args) {
	final1 f= new final1();
	f.met();
	System.out.println(f.add(3, 4));
	
	
}
}
