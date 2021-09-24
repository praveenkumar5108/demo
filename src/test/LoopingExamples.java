package test;

public class LoopingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		int [] array1 = {11,34,55,22,23,76};
		
		String str1 = "Clean India Green India";
		String str2 = "";
		 
	    for (i = 1; i <= 10; i++) {
	    	System.out.println(i);
	    }
	    
	  //to print all elements in an array
	  	for(int b =0; b <= array1.length-1; b++) {
	  		System.out.println(array1[b]);
	  	}
	  	
	  	//============================================================================
	  	
	  	// reverse order 
	  	for(int k = array1.length-1; k>=0; k--) {
	  		System.out.println(array1[k]);
	  		
	  	}
	  	
	  	// ============================================================================
	  	
	  	//for each loop to get all values
	  	for(int values : array1) {
	  		System.out.println(values);
	  	}
		
	  	
	  	// ================================================================================
	  	
	  	for(int j = 0; j <= str1.length()-1; j++) {
	  		System.out.println(str1.charAt(j));
	  	}
	  		
	  	//=====================================================================
	  	
	  	for(int c = str1.length()-1; c >= 0; c--) {
	  		str2 += str1.charAt(c);
	  		System.out.println("reverse of str1 is:" +str2);
	  		
	  	}
	  	
	  	//=================================================================
	  	// counting words
	  	// trim will remove spaces beginning and ending of the string
	  	String[] words = str1.trim().split(" "); // {"Clean", "India", "Green", "India"}
	  	
	  	System.out.println("total words are :" + words.length);
	  	
	  	
	  	//=============================================================================================
	  	
	  	// while loop
	  	
	  	int x = 1;
	  	
	  	while (x <= 10){
	  		System.out.println(x);
	  		
	  		x += 1;
	  	}
	  	
	  	//=============================================================================================
	  	
	  	// printing digits from a number
	  	int n1 = 436721;
	  	
	  	int count = 0;
	  	
	  	while (n1 > 0) {
	  		int r = n1 % 10;
	  		System.out.print(r);
	  		count ++;
	  		n1 = n1/10;
	  	}
	  	System.out.print("total number of digits are" + count);
	  	
	  	
	  	// ======================================================================================================
	  	
	  	// do while loop
	  	int n2  = 10;
	  	
	  	do {
	  		System.out.print(n2);
	  		n2--;

	  	}while(n2>0);
	  	
	  	
	  	//======================================================================================================
	  	
	  	


	}

}
