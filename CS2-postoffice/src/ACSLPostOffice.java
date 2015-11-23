import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * Post office assignment
 * @author 
 */
public class ACSLPostOffice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//declarations:
		Scanner scan;
		try{
			scan = new Scanner(new BufferedReader(new FileReader("testdata")));
		} catch(FileNotFoundException e) {
			//switch to regular terminal input
			scan = new Scanner(System.in);
		}
		
		//main loop:
		while(scan.hasNext()) {
			System.out.println(solve(scan.nextLine()));
		}
	}

	/**
	 * solve for a specific input
	 * @param s the input
	 * @return the output
	 */
	static String solve(String s) {
		return s;
	}
	
	/**
	 * take a zip code and return the zone that it is from
	 * @param zip a 5 digit zip code
	 * @return the zone corresponding to the zip code
	 */
	static int zipToZone(int zip) {
		return 0;
	}
	
	/**
	 * Converts from zip to zone based on the table
	 * ZONE	1		2		3		4		5		6
	 * FROM	00001	07000	20000	36000	63000	85000
	 * TO	06999	19999	35999	62999	84999	99999
	 */
	static int zoneDist(int zone1, int zone2) {
		return 0;
	}
	
	/**
	 * mail classification of the object based on size
	 * @param length
	 * @param width
	 * @param height
	 * @return the mail type or UNKNOWN
	 */
	static String mailType(double length, double width, double height) {
		return "";
	}
	
	/**
	 * calculate the cost of postage based on a mail type and a zone distance
	 * @param type the type of mail
	 * @param dist the number of zones through with the mail must travel
	 * @return the cost of postage
	 */
	double calculate(String type, int dist) {
		return 0;
	}
	
}


