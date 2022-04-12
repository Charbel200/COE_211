import java.util.Scanner;
public class Lab9{
	public static void main(String[] args){
		int[] grades = new int[5] ;	
		int nbr = 0 , att = 0, attendance,midgrade;
		double avg1,avg2,avg3;
		Scanner scan = new Scanner(System.in);
		for(nbr = 0;nbr<5;nbr++){
		System.out.println("Enter the grade over 100 of assignement" + " " +(nbr+1));
		grades[nbr]=scan.nextInt();
		}
		
		

		System.out.println("Input the number of attented lab");
		attendance = scan.nextInt();
		System.out.println("Input the midterm grade");
		midgrade=scan.nextInt();
		
			avg1= (grades[0] +grades[1]+grades[2]+grades[3]+grades[4])*(double)0.3/5;
			avg2 = attendance/7*5;
			avg3 = midgrade*(double)0.3;
		System.out.println("Assignments(30%):" + avg1);
		System.out.println("attendance(5%):" + avg2);
		System.out.println("midterm(30%):" + avg3);
	}
}