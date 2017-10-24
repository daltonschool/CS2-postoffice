import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * GOAL: Print the price of postage for various parcels. 
 * 
 * Note: Decimals must be rounded to 2 places.
 */
public class PostageCalculator {

	/*******************************
	 * HINT: Don't modify anything in the main
	 * 
	 * @param args - String[], not used
	 ********************************/
	public static void main(String[] args) {

		String packageDetails = "";
		String price = "";
		
		try {
			// Point scanner to a file named 'testdata'
			Scanner scan = new Scanner(new BufferedReader(new FileReader("testdata")));
		} catch (FileNotFoundException e) {
			// If I can't find the file switch to regular terminal input
			Scanner scan = new Scanner(System.in);
		}

		// Read each line of package data and print the cost
		while (scan.hasNext()) {
			packageDetails = scan.nextLine();
			
			// HINT: This always equals a blank line but that's not right.
			// Fix getPrice() so it returns the price of the package.
			price = getPrice(packageDetails);  
			
			System.out.println(price);
		}
	}


	/**
	 * Compute the price of mailing the parcel.
	 * 
	 * @param s - String, a comma-delimited string with the size of the parcel and the
	 *            to and from zip codes
	 * @return String, the price or UNMAILABLE
	 */
	public static String getPrice(String s) {
		// HINT: This method returns a blank String, but that's not right.  
		// Fix this function so it calls calculateCost() to get the price.
		// If calculateCost() returns -1, return "UNMAILABLE", but if 
		// calculateCost() returns any other double, convert it to a String
		// and return it.
		return "";
	}
	
	/**
	 * Calculate the cost of postage based on a mail type and a zone distance.
	 * 
	 * POST CARD = $.20 + .03 per zone
	 * LARGE POST CARD = $.37 + .03 per zone
	 * ENVELOPE = $.37 + .04 per zone
	 * LARGE ENVELOPE = $.60 + .05 per zone
	 * PACKAGE = $2.95 + .25 per zone
	 * LARGE PACKAGE = $3.95 + .35 per zone
	 * 
	 * @param type - String, the type of mail
	 * @param dist - int, the number of zones through with the mail must travel
	 * @return double, the cost of postage or -1 if it's unmailable
	 */
	public static double calculateCost(String type, int dist) {
		// HINT: This function always returns 0 but that's not right. 
		// Use the helper functions getZoneDistance() and getMailType()
		// and use those return values to compute the cost according to
		// the specifications in the comments.
		return 0; 
	}
	
	/**
	 * Get mail classification of the object based on size.
	 * 
	 * POST CARD: Length 3.5 - 4.25in / Height 3.5 - 6in / Thick .007 - .016in
	 * LARGE POST CARD: Length 4.25-6in / Height 6-11.5in / Thick .007 - .015 in
	 * ENVELOPE: Length 3.5-6.125 in / Height 5-11.5 in / Thick .016-.25 in
	 * LARGE ENVELOPE: Length 6.125-24 in / Height 11-18 in / Thick .25 - .5 in
	 * PACKAGE: Length more than 24 in. or Height more than 18 in. or Thickness
	 * more than .5 and also the Length + distance around is at most 84 in.
	 * LARGE PACKAGE: Length more than 24 in. or Height more than 18 in. or
	 * Thickness more than .5 and Length + distance is more than 84 in. but less
	 * than 130 in.
	 * UNMAILABLE: Doesn’t fit any above requirements.
	 * 
	 * @param length - double, length of parcel
	 * @param width - double, width of parcel
	 * @param height - double, height (or depth) of parcel
	 * @return String, the mail type
	 */
	public static String getMailType(double length, double width, double height) {
		// HINT: This method always returns the blank String, but that's not right.
		// Fix it so that it returns the mail type based in its length, width and height.
		// You don't need a helper function for this.
		return "";
	}
	
	/**
	 * Compute the distance between zones.
	 * 
	 * @param originZone - zone of sender
	 * @param destinationZone - zone of receiver
	 * @return the distance between zones
	 */
	public static int getZoneDistance(int originZone, int destinationZone) {
		// HINT: This function always returns 0 but that's not right.
		// Fix it so it returns the distance between the origin zone
		// and the destination zone. 
		// You don't need a helper function for this.
		return 0;
	}

	/**
	 * Take a zip code and return the zone that it is from based on this table.
	 * 
	 * Zone 1 is from zip code 00001 to 06999.
	 * Zone 2 is from zip code 07000 to 19999.
	 * Zone 3 is from zip code 20000 to 35999.
	 * Zone 4 is from zip code 36000 to 62999.
	 * Zone 5 is from zip code 63000 to 84999.
	 * Zone 6 is from zip code 85000 to 99999.
	 * 
	 * @param zip - int, a 5 digit zip code
	 * @return the zone corresponding to the zip code
	 */
	public static int convertZipToZone(int zip) {
		// HINT: This always return 0 but that's not right.
		// Fix it so that it returns the correct zone based on the zip.
		// You don't need a helper function for this.
		return 0;
	}

}
