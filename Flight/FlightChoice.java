/**
 * 
 */
package ENSE470_Assgn3;

import java.util.Scanner;

/**
 * @author ShafiqZain
 *
 */

public abstract class FlightChoice implements Flight {
	
	protected Flight tempFlight;

	public FlightChoice(Flight newFlight){
		tempFlight = newFlight;
	}		

	public String getDepartureCity(){
		return tempFlight.getDepartureCity();
	}

	public String getArrivalCity(){
		return tempFlight.getArrivalCity();
	}
	
	public int getDepartureTime(){
		return tempFlight.getDepartureTime();
	}
	
	public int getPrice(){
		return tempFlight.getPrice();
	}
}