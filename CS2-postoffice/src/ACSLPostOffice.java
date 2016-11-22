import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Post office assignment. Print the price of postage for various parcels. For
 * details read ACSL_Post_Office.pdf. Also see the comments above the functions
 * below.
 * 
 * Note: Decimals must be rounded to 2 places.
 * 
 * GRADING GUIDE:
 * 
 * 74 points for on time
 * 
 * 15 points for sample data (3 points each)
 * 
 * 3 points documentation
 * 
 * 3 points style (variables, formatting, warnings)
 * 
 * @author cforster
 */
public class ACSLPostOffice {

	/**
	 * HINT: you probably don't need to modify anything in the main
	 * 
	 * @param args
	 *            not used
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// declarations:
		Scanner scan;
		String input = "";
		try {
			// scan from the file named 'testdata'
			scan = new Scanner(new BufferedReader(new FileReader("testdata")));
		} catch (FileNotFoundException e) {
			// if I can't find the file switch to regular terminal input
			scan = new Scanner(System.in);
		}

		// main loop:
		while (scan.hasNext()) {
			input = scan.nextLine();
			System.out.println(getPrice(input));
		}
	}

	// HINT: all your work should probably be underneath this line

	/**
	 * Compute the price of mailing the parcel.
	 * 
	 * @param s
	 *            a comma-delimited string with the size of the parcel and the
	 *            to and from zip codes
	 * @return the price to send the parcel or UNMAILABLE
	 */
	public static String getPrice(String s) {
		// HINT: Look at ParsingExample.java
		return "UNMAILABLE";
	}

	/**
	 * Take a zip code and return the zone that it is from based on this table.
	 * 
	 * Zone 1 is from zip code 00001 to 06999.
	 * 
	 * Zone 2 is from zip code 07000 to 19999.
	 * 
	 * Zone 3 is from zip code 20000 to 35999.
	 * 
	 * Zone 4 is from zip code 36000 to 62999.
	 * 
	 * Zone 5 is from zip code 63000 to 84999.
	 * 
	 * Zone 6 is from zip code 85000 to 99999.
	 * 
	 * @param zip
	 *            a 5 digit zip code
	 * @return the zone corresponding to the zip code
	 */
	public static int zipToZone(int zip) {
		return 0;
	}

	/**
	 * Compute the distance between zones.
	 * 
	 * @param originZone
	 *            zone of sender
	 * @param destinationZone
	 *            zone of receiver
	 * @return the distance between zones
	 */
	public static int zoneDist(int originZone, int destinationZone) {
		return 0;
	}

	/**
	 * Get mail classification of the object based on size.
	 * 
	 * Types:
	 * 
	 * POST CARD: Length 3.5 - 4.25in / Height 3.5 - 6in / Thick .007 - .016in
	 * 
	 * LARGE POST CARD: Length 4.25-6in / Height 6-11.5in / Thick .007 - .015 in
	 * 
	 * ENVELOPE: Length 3.5-6.125 in / Height 5-11.5 in / Thick .016-.25 in
	 * 
	 * LARGE ENVELOPE: Length 6.125-24 in / Height 11-18 in / Thick .25 - .5 in
	 * 
	 * PACKAGE: Length more than 24 in. or Height more than 18 in. or Thickness
	 * more than .5 and also the Length + distance around is at most 84 in.
	 * 
	 * LARGE PACKAGE: Length more than 24 in. or Height more than 18 in. or
	 * Thickness more than .5 and Length + distance is more than 84 in. but less
	 * than 130 in.
	 * 
	 * UNMAILABLE: Doesn’t fit any above requirements.
	 * 
	 * @param length
	 *            length of parcel
	 * @param width
	 *            width of parcel
	 * @param height
	 *            height (or depth) of parcel
	 * @return the mail type
	 */
	public static String getMailType(double length, double width, double height) {
		return "";
	}

	/**
	 * Calculate the cost of postage based on a mail type and a zone distance.
	 * 
	 * POST CARD = $.20 + .03 per zone
	 * 
	 * LARGE POST CARD = $.37 + .03 per zone
	 * 
	 * ENVELOPE = $.37 + .04 per zone
	 * 
	 * LARGE ENVELOPE = $.60 + .05 per zone
	 * 
	 * PACKAGE = $2.95 + .25 per zone
	 * 
	 * LARGE PACKAGE = $3.95 + .35 per zone
	 * 
	 * @param type
	 *            the type of mail
	 * @param dist
	 *            the number of zones through with the mail must travel
	 * @return the cost of postage
	 */
	public static double calculateCost(String type, int dist) {
		return 0; // HINT: this function is going to call a bunch of others,
					// write it last?
	}

}
