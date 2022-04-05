import java.io.*;
import java.util.Scanner;
import java.io.File;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      
	Scanner scan = new Scanner(System.in);
	FileWriter wtr = new FileWriter(new File("expenses.txt"));
	Scanner fileScan = new Scanner(new File("expenses.txt"));
	BufferedWriter buff = new BufferedWriter(wtr);
	PrintWriter outToFile = new PrintWriter(buff);
	String name,what,answer,info;
	double many;
	String redo = "y";




	do{
	System.out.println("Input your name: ");
	name = scan.nextLine();

	System.out.println("What did you purchase?");
	what = scan.nextLine();

	System.out.println("How much did you pay? (in USD) ");
	many = scan.nextDouble();
	scan.nextLine();


	outToFile.print(name + " purchased " + what + " for " + many + " US Dollars.");
	outToFile.println();


	System.out.println("Would you like to log another purchase? (y/n)");
	answer = scan.nextLine();
	}while(answer.equalsIgnoreCase(redo));


	outToFile.close();
	
	System.out.println("Would you like to read a summary of your purchases? (y/n)");
	answer = scan.nextLine();

	if(answer.equalsIgnoreCase(redo)){
		while(fileScan.hasNext()) {
			info = fileScan.nextLine();
			System.out.println("" + info);
		}
	}

        
   
  }
}