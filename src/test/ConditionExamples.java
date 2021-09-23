package test;

public class ConditionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=50; i++) {
			if (i%2 == 0) {
				System.out.println("even number" + i); 
			}
			else {
				System.out.print("Odd number: " + i);
			}
		}
		
		// ===================================================
		
		int age  = 18;  // eligible for voting
		
		//int age  = 17;  // sorry, you will eligible for voting by next year
		
		//int age = 16; //sorry, you are not  eligble for voting
		
		if (age >= 18) {
			System.out.println("eligible for voting");
	    }else if(age == 17) {
	    	System.out.println("sorry, you will eligible for voting by next year");
	    }else {
	    	System.out.println("sorry, you are not  eligble for voting");
	    }

	}

}
