package test;
import java.util.Scanner;
/*import javax.swing.plaf.synth.SynthSpinnerUI;*/

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*int a  = 20;
	    int area = a*a;
	    System.out.println("area of sqaure is:" + area);*/
	     
	    int width ;
	    int height;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Width");
	    width = scan.nextInt();
	    System.out.println("Enter height");
	    height = scan.nextInt();
	    int rec_area = width * height;
	    System.out.println("area of rectangle is:" + rec_area);
	    
	     

	}

}
