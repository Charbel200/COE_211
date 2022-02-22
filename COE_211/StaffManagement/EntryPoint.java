import java.util.*;
import java.lang.Math;
public class EntryPoint {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	
	
	int y = 0;
	int rand = (int)(Math.random() * 10);
		while (y<rand){
	System.out.println("Please input the employee's first name: ");  
		String FirstName= scan.next();  


	System.out.println("Please input the employee's last name: ");  
		String LastName= scan.next();

	System.out.println("Please input the employee's age: ");  

		int Age= scan.nextInt();

	
	
	System.out.println("Please input the employee's Monthly Salary: ");  

		double MonthlySalary= scan.nextDouble();

	Employee Person= new Employee(FirstName,LastName,Age,MonthlySalary);

	System.out.println("Employee information:" + Person.FirstName + " " + Person.LastName + ", " + Person.Age + ", " + Person.MonthlySalary);
        	String x= Person.FirstName + " " + Person.LastName + ", " + Person.Age + ", " + Person.MonthlySalary;
	 
         
                y++;
		int Executions = rand-y;
        System.out.println("You have " + Executions + " insertions left");
}
	 


 

		
	}
}