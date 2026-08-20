package PAck1;


class Parent{
	void sum() {
		System.out.println("suceessfully from parent class");
	}
}

class child extends Parent{
	
	@Override
	void sum() {
		System.out.println("suceessfully from chiild class");
		
	}
	
	
}

public class upcasting {
	public static void main(String args[]) {
		Parent p= new child();
		p.sum();
		
	//	child c= (child) new Parent();
		//c.sum();
	}

}
