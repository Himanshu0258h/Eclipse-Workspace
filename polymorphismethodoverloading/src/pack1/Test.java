package pack1;
// its a compile time polymorphism 
public class Test {
	
	
	void sum(int a){
		System.out.println("sum 1 called ");
	}
	
	
	//same method name with different argument 
	void sum( int a, int b ) {
		System.out.println(a+b);
		
	}
	
	void sum(float c , float d) {
		System.out.println(c+d);
		
	}
	/**
	 * @param args
	 */
	public static void main(String []args) {
		
		Test t = new Test();
		t.sum(12);
		t.sum(12, 20);
		
		t.sum(20.4f,32.4f);
		
	}

}
