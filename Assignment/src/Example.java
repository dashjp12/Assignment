interface inter
{
	void met1();
	default int met2()
	{
		return 10;
	}
}

class Example1 implements inter
{
	public void met1()
	{
		System.out.println("Example");
	}
	public int met2()
	{
		return 0;
	}
}

public class Example {
	inter i=new Example1();
	
		

}
