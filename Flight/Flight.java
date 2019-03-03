/**
 * 
 */
package ENSE470_Assgn3;

import java.util.Scanner;

/**
 * @author ShafiqZain
 *
 */

public interface Flight {

	public String getDepartureCity();
	
	public String getArrivalCity();
	
	public int getDepartureTime();
	
	public int getPrice();
	
	public String addOn();

	public String showDisplay();

}

class PlainFlight implements Flight {
	
	private String readUserInput() {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}	
	
	private String retrieveFlightFromDatabase() {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
	
	@Override
	public String getDepartureCity() {
		String departCity = null;
		return departCity = readUserInput();
	}	
	
	@Override
	public String getArrivalCity() {
		// TODO Auto-generated method stub
		String arriveCity = null;
		return arriveCity = readUserInput();
	}

	@Override
	public int getDepartureTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String addOn() {
		// TODO Auto-generated method stub
		String extra = null;
		extra = readUserInput();
		System.out.println("\nDo you want to add extra legroom seats (Y/N)? ");
		extra = readUserInput();
		System.out.println("\nDo you want to add in-flight meals (Y/N)?");
		extra = readUserInput();
		System.out.println("\nDo you want to add excess baggage (Y/N)?");
		extra = readUserInput();
		return extra = readUserInput();
	}

	@Override
	public String showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Departure City : Regina");
		System.out.println("Arrival City : Vancouver");
		System.out.println("Time : 0900H");
		System.out.println("Extra Legroom : N");
		System.out.println("In-flight meals : Y");
		System.out.println("Excess Baggage : Y");
		System.out.println("Total Price : $330 ");

		return null;
	}	
}	
	
	