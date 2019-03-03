/**
 * 
 */
package ENSE470_Assgn3;

import java.util.Scanner;

/**
 * @author ShafiqZain
 *
 */

public class FlightExtra extends FlightChoice {

	public FlightExtra(Flight newFlight) {
		super(newFlight);
		// TODO Auto-generated constructor stub
			
		System.out.println("Flight Found:");
		System.out.println("(1) Regina Vancouver 0900H $300");
		System.out.println("(2) Regina Vancouver 1500H $350");
		System.out.println("\nWhich flight do you want?: ");
		return;
	}
	

		public String getDepartureCity(){
			return (tempFlight.getDepartureCity() + "Regina ");
		}

		public String getArrivalCity(){
			return (tempFlight.getArrivalCity() + "Vancouver ");
		}
		
		public int getDepartureTime(){
			return (tempFlight.getDepartureTime() + 900) ;
		}		 
		
		public int getPrice(){
			return (tempFlight.getPrice() + 300);
		}


		public String addOn(){
			return (tempFlight.addOn());
		}


		public String showDisplay() {
			return (tempFlight.showDisplay());
		}
}

			
		
		


