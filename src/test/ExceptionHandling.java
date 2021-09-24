package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b[] = {12,2,3,};
		
		try {
			System.out.println(a/0);
			System.out.println(b[5]);
			
		}catch(NullPointerException e) {
			
			e.printStackTrace();
			System.out.println("inside NullPointer");
		
		}catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("inside arthematic exception");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("inside generic exception");
			
		}finally {
			System.out.println("inside finally");
		}
		
		System.out.println("after arthematic exception");
		
	}

	}
