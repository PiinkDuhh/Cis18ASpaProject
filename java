//Programmer: Seanna Marie
//This is a simple java program designed for use by customers
//It will receive input from the user and help the user get a
//Summary of their visit along with a total and suggested 
//Gratuity

import java.util.Scanner;



class spaProgramTest {
public static void main(String args[])
{
//scanner object needed to read user import
Scanner sc = new Scanner(System.in);

//variable initilization
  char entry;  
  final int size = 5;
 
 

//arrays contaning nail services and prices
  String[] nails = {"Manicure", "Full Set", "Fill In", "Nail Fix", "Removal"};
  double[] nailPrices = {12.00, 20.00, 10.00, 5.00, 7.00};

//arrays containing waxing services and prices
  String[] waxing = {"Eyebrow", "Upper Lip", "Full Chin", "Full Face", "Underarm"};
  double[] waxPrices = {12.00, 7.00, 8.00, 30.00, 18.00};

//arrays containing massage services and prices
  String[] massage = {"10 Minutes", "15 Minutes", "30 Minutes", "45 minutes", "60 Minutes"};
  double[] massagePrices = {10.00, 15.00, 25.00, 30.00, 40.00};




  double finalTotal=0;

  System.out.println("Welcome to The Sparkle Spa.");
  System.out.println("What is your name?");
  String name = sc.nextLine();

System.out.println("Which nail service would you like?");
	System.out.println("-------------------------------------");

	for (int count = 0; count < size;count++) //for loop used to display array elements
	{
	  System.out.print((count + 1));
	  System.out.print(".");
	  System.out.print(nails[count]);
	  System.out.print("\t\t\t\t\t");
	  System.out.print("$");
	  System.out.println(nailPrices[count]);
	  
	}
	System.out.print("Key in selection(1-5): ");
	int choice = sc.nextInt();

 switch (choice) //switch statment to help with choices
	  {

	  case 1:
	  System.out.println("You have selected a Manicure.");
	  finalTotal = nailPrices[0];
	  break;

	  case 2:
	  System.out.println("You have selected a Full Set.");
	  finalTotal = nailPrices[1];
	  break;

	  case 3:
	  System.out.println("You have selected a Fill.");
	  finalTotal = nailPrices[2];
	  break;

	  case 4:
	  System.out.println("You have selected a Polish Change.");
	  finalTotal = nailPrices[3];
	  break;

	  case 5:
	  System.out.println("You have selected a Removal.");
	  finalTotal = nailPrices[4];
	  break;

	  default:
	  System.out.println("Please make a valid selection.");
	  }

	System.out.println("Would you like to upgrade your nail service?");
	System.out.println("Please enter Y or N");
	char upgrade = sc.next().charAt(0);

	if (upgrade == 'y' || upgrade == 'Y')
 {
	  System.out.println("You have decided to go with an upgrade, your options are:\n");
	  System.out.print("---------------------------------");
	  System.out.println("-------------------------------");
	  System.out.println("1.Waxing\n2.Massage");

	//This loop ensures the menu is displayed at least one time
	  do
	  {
		System.out.print("Key in selection(1-2): ");
		choice = sc.nextInt();

		switch (choice)
		{

		  case 1:

		  do
		  {
			System.out.print("You'd like to add waxing. Your options are:\n");
			System.out.print("--------------------------------------------\n");

			for (int count = 0; count < size;count++)
			{
				System.out.print((count + 1));
				System.out.print(".");
				System.out.print(waxing[count]);
				System.out.print("\t\t");
				System.out.print("$");
				System.out.print(waxPrices[count]);
				System.out.print("\n");
			}

			  System.out.print("Which service would you like to add?\n");
			  System.out.print("Key in selection(1-5): ");
			  choice = sc.nextInt();
			  finalTotal += waxPrices[choice-1];

			  System.out.print("Would you like additional waxing services?\n");
			  System.out.print("Enter Y or N: ");
			  entry = sc.next().charAt(0);
		  }while (entry == 'y' || entry == 'Y');

			  break;


		  case 2:
			System.out.print("You'd like to add a Massage. Your Options are:\n");
			System.out.print("-------------------------------------------\n");
			for (int count = 0; count < size;count++)
			{
				System.out.print((count + 1));
				System.out.print(".");
				System.out.print(massage[count]);
				System.out.print("\t\t");
				System.out.println(massagePrices[count]);
				
			}
			  System.out.print("Which service would you like to add?\n");
			  System.out.print("Key in selection(1-5): ");
			  choice = sc.nextInt();
			  finalTotal += massagePrices[choice-1];
		  break;

		  default:
		  System.out.print("Please make a valid selection.\n");

		}
	  } while (choice < 1 && choice >5);

}
//Used to determine amount of gratuity
double gratuity= finalTotal*0.2;

if (finalTotal > 0)
{
System.out.println("Thank you " + name + " for visiting the Sparkle Spa.");
System.out.println("Your amazing service today costs $" + finalTotal);
System.out.print("We suggest giving your technician a grauity of $");
System.out.print(gratuity);
}

} } 
