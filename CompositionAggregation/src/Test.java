import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Horlicks");
		Product p2=new Product(1,"Horlicks");
		Product p3=new Product(1,"Horlicks");
										
		List<Product> p=new ArrayList<>();	//One Object logically depends on the Other-Composition
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
}

}
