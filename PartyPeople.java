public class PartyPeople 
{
	private String name;
	private String company;
	private int id;
	{
	
	String companies[] = {"Wal-Mart", "Kroger", "Amazon", "Lowes", "Best Western", "KMart", "Fusian", "Heinz", "Gucci","Prada", "Nike", "Dodge", "Maserati", "Razor", "AMD", "Razer"};
}
	public PartyPeople(int initId, String initName, String initCompany){
	
		id = initId;
		name = initName;
		company = initCompany;
		
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
		return ("name" + "company");
		
	}
}		
