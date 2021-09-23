package test;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FName = "Praveen";
		String LName = "Kumar";
		
		String FullName = FName + " " + LName;
		System.out.println("FullName is :" + FullName.length());
		System.out.println("FullName in uppercase :" + FullName.toUpperCase());
		
		
       String NewName = FullName.replace(" ", ",");
       System.out.println("NewName is :" + NewName);
    		 
	}

}
