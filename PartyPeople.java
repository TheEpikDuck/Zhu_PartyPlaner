public class PartyPeople 
{
	private String name;
	private String company;
	private int id;
	{
	
	String companies[] = {"Wal-Mart", "Kroger", "Amazon", "Lowes", "Best Western", "KMart", "Fusian", "Heinz", "Gucci","Prada", "Nike", "Dodge", "Maserati", "Razor", "AMD", "Razer"};
	int tables[] = {1,2,3,4,5,6,7,8,9,10};
}
	public PartyPeople(int initId, String initName, String initCompany){
	
		id = initId;
		name = initName;
		company = initCompany;
		table = intiTable;
		
}
	public String getName(){
		return name;
	}
	
	public String getCompany(){
		return company;
	}
	
	public int getId(){
		return id;
	}
	
	public String toString(){
		return ("name" + "company" + "id");
		
	}
}
