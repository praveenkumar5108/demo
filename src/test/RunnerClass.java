package test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Employee emp1 = new Employee();
		
		emp1.EmpId = 2323;
		emp1.Salary = 30000;
		//emp1.department = "CSE";
		emp1.display();
		
		
		Employee emp2 = new Employee(23232,40484);
		
		//emp2 = null; this causes null pointer exception
		
		Employee emp3 = new Employee();
		emp3.name = "Praveen";
		emp3.age = 23;
		emp3.city = "Nellore";
		emp3.EmpId = 232;
		emp3.Salary = 3423232;
		
			
		
		emp3.display();
		
		emp2.display();
		
		Polymorphism p1 = new Polymorphism();
		
		p1.add(12, 27);
		p1.add(19, 21, 2);
		p1.add(12.33, 1212.323);
		
		Account a1 = new Account();
		a1.setAccountNum(23232434);
		
		System.out.println(a1.getAccountNum());
		
	}

}
