import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Post office assignment
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
		try {
			scan = new Scanner(new BufferedReader(new FileReader("testdata")));
		} catch (FileNotFoundException e) {
			// switch to regular terminal input
			scan = new Scanner(System.in);
		}

		// main loop:
		while (scan.hasNext()) {
			System.out.println(solve(scan.nextLine()));
		}
	}

	// HINT: all your work should probably be underneath this line

	/**
	 * Solve for a specific input.
	 * 
	 * @param s
	 *            the input
	 * @return the output
	 */
	static String solve(String s) {
		return s;
		// HINT: Look at ParsingExample.java
	}

    /**
     * Take a zip code and return the zone that it is from 
     * based on this table.
     * 
     * ZONE	   1	   2	   3	   4	   5	   6
     * FROM	00001	07000	20000	36000	63000	85000
     * TO	06999	19999	35999	62999	84999	99999
     * 
     * @param zip
     *            a 5 digit zip code
     * @return the zone corresponding to the zip code
     */
	static int zipToZone(int zip) {
		return 0;
	}

	/**
	 * Compute the distance between zones.
	 * 
	 * @param zone1
	 *            origin
	 * @param zone2
	 *            destination
	 * @return the distance between zones
	 */
	static int zoneDist(int zone1, int zone2) {
		return 0;
	}

	/**
	 * Get mail classification of the object based on size.
	 * 
	 * Post Card:
	 * 
	 * Length 3.5 - 4.25 in. / Height 3.5 - 6 in. / Thickness .007 - .016 in.
	 * 
	 * 
	 * Large Post Card:
	 * 
	 * Length 4.25 - 6 in. / Height 6 - 11.5 in. / Thickness .007 - .015 in.
	 * 
	 * 
	 * Envelope:
	 * 
	 * Length 3.5 - 6.125 in. / Height 5-11.5 in. / Thickness .016 - .25 in.
	 * 
	 * 
	 * Large Envelope:
	 * 
	 * Length 6.125 - 24 in / Height 11 - 18 in / Thickness .25 - .5
	 * 
	 * 
	 * Package:
	 * 
	 * Length > 24 in. or Height > 18 in. or Thickness > .5 and Length +
	 * distance around less than or equal to 84 in.
	 * 
	 * 
	 * Large Package:
	 * 
	 * Length > 24 in. or Height > 18 in. or Thickness > .5 and Length +
	 * distance around 84 in. - 130 in.
	 * 
	 * 
	 * Unmailable:
	 * 
	 * Doesn’t fit any above requirements
	 * 
	 * @param length
	 *            length of envelope/package
	 * @param width
	 *            width of envelope/package
	 * @param height
	 *            height (or depth) of package
	 * @return the mail type
	 */
	static String mailType(double length, double width, double height) {
		return "";
	}

	/**
	 * Calculate the cost of postage based on a mail type and a zone distance.
	 * 
	 * @param type
	 *            the type of mail
	 * @param dist
	 *            the number of zones through with the mail must travel
	 * @return the cost of postage
	 */
	static double calculateCost(String type, int dist) {
		return 0; // HINT: this function is going to call a bunch of others,
					// write it last?
	}

}
