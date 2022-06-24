package Demo1;

public class Private {

	private void p1() {
		
		System.out.println("Sonali");
	}
	
	void p2() {
		
		System.out.println("Dhanraj");
	}
	
	protected void p3() {
		
		System.out.println("Desale");
	}
	
	public void p4() {
		
		System.out.println("Bamrud");
	}
	public static void main(String[] args) {
		
		Private obj=new Private();
		
		obj.p1();
		obj.p2();
		obj.p3();
		obj.p4();
		
		

	}

}
