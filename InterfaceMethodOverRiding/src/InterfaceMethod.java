abstract class a
{
	int i;
	 void met5() {
		 System.out.println("Ganesh");
	 }
}

class xyz extends a
{
	void met5()
	{
		System.out.println("GaneshRaaj");
	}
}

class main
{
	 public static void main(String args[])
	 {
		 a a=new xyz();
		 a.met5();
	 }
	 
}


interface inter
{
	void met1();
	default int met2()
	{
		return 10;
	}
}

class Example implements inter
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
public class InterfaceMethod {

	public static void main(String[] args) {
		inter i=new Example();
		i.met2();
		i.met1();
	}

}
