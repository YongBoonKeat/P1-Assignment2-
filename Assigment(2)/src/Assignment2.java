import java.util.Scanner;

public class Assignment2 {
		static String name; 
		static String gender;
		static int ic;
		static int age;
		static String marital;
		static String citizen;
		static String work;
		static int salary;
		static int choice;
		static int housingloan;
		static float changers;
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			ReceiveInformation();
			printToH();
			printFinalform();
		}
		public static void ReceiveInformation() {
			Scanner input = new Scanner (System.in);
		do {
			System.out.println("Enter your name: ");
			name=input.nextLine();
		
			System.out.println("Enter your gender: ");
			gender=input.nextLine();
		
			System.out.println("Enter your IC: ");
			ic=input.nextInt();
			
			System.out.println("Enter your age:");
			age=input.nextInt();
			
			System.out.println("Enter your marital:");
			marital=input.next();
		
			System.out.println("Enter your citizen:");
			citizen=input.next();
		
			System.out.println("Enter your work:");
			work=input.next();
			{
			System.out.println("Enter your salary: ");
			salary=input.nextInt();
			if(salary<2000) {
				System.out.println("Your salary is not met the condition ");	
			}
			else if( age<21 || age>60) {
				System.out.println("Your salary is not met the condition ");
			}
		    else { 
		    	System.out.println(" ");
		    }
			}
		} while (salary<2000 || age<21 || age>60 );
		 
		}

		public static void printToH() {
			Scanner input = new Scanner (System.in);
			
			System.out.println("Type of house: ");
			System.out.println("1: Banglo ");
			System.out.println("2: Condo ");
			System.out.println("3: Hometown ");
			System.out.println("Please enter your choice: ");
			choice = input.nextInt();
			if(choice==1) {
				System.out.println("Banglo");
				System.out.println("Maximum housing loan = RM500000");
				System.out.println("Payment limited: 10years ");
				System.out.println("Changers: 3% ");
				
				
				System.out.println("Enter your Housingloan: ");
				housingloan=input.nextInt();
				changers = (housingloan*3/100);
			}
		    else if(choice==2) {
		    	System.out.println("Condo");
				System.out.println("Maximum housing loan = RM200000");
				System.out.println("Payment limited: 3years ");
				System.out.println("Changers: 2% ");
				
				System.out.println("Enter your Housingloan: ");
				housingloan=input.nextInt();
				changers = (housingloan*2/100);
		    }
		    else if(choice==3) {
		    	System.out.println("Hometown");
				System.out.println("Maximum housing loan = RM400000");
				System.out.println("Payment limited: 5years ");
				System.out.println("Changers: 3% ");
				
				System.out.println("Enter your Housingloan: ");
				housingloan=input.nextInt();
				changers = (housingloan*3/100);
		    }
		    else {
		    	 System.out.print("Invalid number !!!");
		}
		}
		public static void printFinalform() {
			System.out.println("Name: " + name);
			System.out.println("Gender: " + gender);
			System.out.println("IC: " + ic);
			System.out.println("Age: " + age);
			System.out.println("Marital: " + marital);
			System.out.println("Citizen: " + citizen);
			System.out.println("Work: " + work);
			System.out.println("Salary: " + salary);
			System.out.println("Housingloan: " + housingloan);
			if(choice==1) {
				System.out.println("Banglo");
				System.out.println("Maximum housing loan = RM500000");
				System.out.println("Payment limited: 10years ");
				System.out.println("Changers " + changers );
				
			}
		    else if(choice==2) {
		    	System.out.println("Condo");
				System.out.println("Maximum housing loan = RM200000");
				System.out.println("Payment limited: 3years ");
				System.out.println("Changers "+ changers);
		    }
		    else {
		    	System.out.println("Hometown");
				System.out.println("Maximum housing loan = RM400000");
				System.out.println("Payment limited: 5years ");
				System.out.println("Changers "+ changers);
				
		    }
		  }
	}
