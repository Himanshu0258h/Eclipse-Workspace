package Pack1;



class A{
	
        int add(int a , int b) {
	    return a+b;
       }
}

class B{
	    A ob= new A();
        int display() {
	    return ob.add(10, 20);
	
       }

        int sum() {
	    return ob.add(12, 30);
	
       }
}

class C extends A{
	    void count() {
	    System.out.println("system c called ");
	    }
	
}


public class Multilevel {
	public static void main(String []args) {
		
		C b=new C();
		B c= new B();
		System.out.println(c.display());
		System.out.println(c.sum());
		b.count();
		
		
	}
}

