package pack1;


class paymentprocess{
	void done() {
		
		System.out.println("your payment done suceessfully");
	}
}

class googlepay extends paymentprocess{
	@Override
	 void done()
	 {
		 System.out.println("payemtn done throgh gpay");
	 }
}


class paytm extends paymentprocess{
	@Override
	 void done()
	 {
		 System.out.println("payement done throgh paytm");
	 }
}




public class payment {
	
	public static void main(String args []) {
		
		paymentprocess p ;	
		
		p = new googlepay();
		p.done();
		
		p= new paytm();
		p.done();
	
		
		
		
		
		
	}

}
