package test;

public class ThrowsExamples {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		ThrowsExamples obj = new ThrowsExamples();
	    obj.calculate();
	}
	
	public void calculate(){
		try {
			method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void method1() throws InterruptedException {
		
		System.out.println("inside method1");
		Thread.sleep(3000);
		
	}
}
