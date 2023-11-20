import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Party;

public static void main (String[] args){
	ArrayList <Attendence> = new ArrayList <Attendence>();
	
	int id;
	String name;
	String company;
	// load function? load()
		//manual, place people
		
		try{
		File people = new File("partyguests.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String arr[] = myReader.nextLine().split(",");
			System.out.println(data);
		}
		myReader.close();
     }
		catch (FileNotFoundException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
}
	
