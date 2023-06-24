/**
 * 
 */
package ShadowOfIntent;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * 
 */
public class FileFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("FileOne");
		
		
		
		try {
			Scanner scan = new Scanner (file);
			while(scan.hasNext()) {
				System.out.print(scan.next() + " " );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry, File Was Not Found");
		}

	}

}
