
package ENSE470_Assgn3;

public class A03zainuddm {
	
	public static void main(String[] args) {		

		Flight city = new PlainFlight();
		Flight extra = new PlainFlight();
		Flight display = new PlainFlight();			
			
		System.out.println("Welcome to  Regina Air ~");
		System.out.println("\nDeparture City: ");
		System.out.println("\nCity Selected: " + city.getDepartureCity());
		System.out.println("\nArrival City: ");
		System.out.println("\nCity Selected: " + city.getArrivalCity());
			
			
	    city = new FlightExtra(city);
	    extra.addOn();
	    System.out.println("Your final flight information is : ");
	    display.showDisplay();	        
			
	}
	
}

