import java.util.Locale;

public class IT213_Young_Unit1 
{
	
	public static void main(String[] args)
	{	
		// Declare string variables
		String name = "John Smith";
		String address = "101 N. Main Street";
		String city = "Anytoen";
		String state = "TX";
		String zip = "11111";
		String unitsTakenStr = "19";
		
		// Declare constatnt numeric veriables
		float ppu = 100.5f;
		final int discount = 150;
		
		//convert string value unitsTaken to integer
		int intunitsTaken = Integer.parseInt(unitsTakenStr);
		
		// increment the units taken by one
		intunitsTaken++; // same as unitsTaken = unitsTaken + 1;
		
		//Multiply the constant variable for price per unit by the units taken and place the answer in a variable named tuition
		float tuition = intunitsTaken * ppu;
		
		//Subtract the constant discount value from tuition and store the answer in a variable named afterDiscount
		float afterDiscount  = tuition - discount;
		
		//Divide the discounted tuition by 12 and store the answer in a variable named monthlyPayment
		float monthlyPayment =afterDiscount /12;

		//display output
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Zip Code: " + zip);
		System.out.println("The number of units taken is: " + intunitsTaken);
		//format tuition values and monthly payments as currency and display
		System.out.println("The tuition before discount is " + "$" + tuition);
		System.out.println("The tuition after discount is " + "$" + afterDiscount);
		System.out.println("Your monthly payment is: " + "$" + monthlyPayment);
	}
}

	


