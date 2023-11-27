import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class Party{

public static void main (String[] args){
	
	
	int id;
	String name;
	String company;
	int tables;
	final int numOfTables = 10;
	
		//reading the file, though it keeps saying file not found even though its in the same folder
		try{
		File people = new File("partyguests.txt");
		Scanner myReader = new Scanner(people);
		while (myReader.hasNextLine()) {
			String arr[] = myReader.nextLine().split(",");
			System.out.println(people);
		}
		myReader.close();
     }
		catch (FileNotFoundException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	
	//the part where i try to put people at tables it doesn't work but i'm  not sure how to do it
	public getTable{
	Collections.shuffle(name);
	
	return tables;
}
	
	
	Scanner input = new Scanner(new File("partyguests.txt")); //this part is the part where i searches for people or the company
	while (input.hasNext()){
		String search = input.next();
		if(search.equalsIgnoreCase(name)){
			return name;
		}
		else if(search.equalsIgnoreCase(company)){
			return company;
		}

	}
	}
}	
