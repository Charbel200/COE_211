import java.util.Scanner;
public class EntryPoint {
    public static void main (String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String choice ;
		 boolean boo = true;
		 do{
		 System.out.println("Which service would you like to use?" +"\n"
		 			+ "[1]: Basic week visualizer" +"\n"
					+ "[2]: Advanced week visualizer" +"\n"
					+ "[3]: Basic calculator" +"\n"
		 			+ "[4]: Employee repertoire");
		 choice = scan.nextLine();

               
           
		switch(choice){
			 case "1":
				BasicWeek basic = new BasicWeek();
				basic.printDays();
				break;
			 case "2":
				AdvancedWeek adv = new AdvancedWeek();
				adv.printDays();
				break;
			 case "3":
				Calculator calc = new Calculator();
				break;
			 case "4":
				Employee employee = new Employee();
				System.out.println(employee);
				break;
			 default:
			      System.out.println("Please make sure you pick a number between 1 and 4: ");
				boo = true;
		 }

		

		 System.out.println("Would you like to perform another operation? (yes/no)");
		 String chance = scan.nextLine();
		 if(chance.equals("yes")){
			boo = true;
		 }else{
			 boo = false;
		 }
		 }while(boo);
		 
    }
}