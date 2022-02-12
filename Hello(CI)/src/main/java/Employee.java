public class Employee {  
private int id;  
private String name;  
private Address address; 
private Department dpt;
private EffortDetails effort;
 private Location location;
//public Employee() {System.out.println("def cons");}  
  
public Employee(int id, String name, Address address, Department dpt, EffortDetails effort,Location location) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address = address; 
    this.dpt = dpt;
    this.effort = effort;
    this.location=location;
    System.out.println("Employee(int id, String name, Address address, EffortDetails effort)");
}  
  
void show(){  
    System.out.println("Employee Details: "+id+" "+name);  
    System.out.println("Employee Address Details:"+address.toString()); 
    System.out.println("Employee Dept Details:"+dpt.showd()); 
    System.out.println("Employee Effort Details:"+effort); 
    System.out.println("Employee location:"+location.getLongitude()+" "+location.getLatitude()); 
}  
  
}
