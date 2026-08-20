package pack1;

public class parameter {
	int age;
	String name;
 public parameter(int age , String name) {
	 this.age=age;
	 this.name=name;
	 
	 System.out.println("para called");
 }
 
 public static void main(String args[]) {
	 parameter p= new parameter(22,"himanshu");
	 
	 System.out.println(p.age+" "+p.name);
	 
 
 
 
 
 }
 
 
 
 
 
 
 
 
 
}
