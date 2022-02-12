import java.util.List;

public class Location {
	int id;
	String name;
	List<Product> product;
	Product product1;//Aggregation
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Location(String name, List<Product> product,int id) {
		super();
		this.name = name;
		this.product = product;
		this.id=id;
	}
	public Location(Product product1) {
		super();
		this.product1 = product1;
	}
	
}
