package mavnenid;

public class Child extends NewYearGift  {
	String namee;
	Child(String namee){
		this.namee=namee;
	}
	//Gifts g=new Gifts();
	void getChocolates() {
		System.out.println("Total Chocolates in "+namee+"\'s gift are : "+total_Chocolates);
	}
	
	void getCookies() {
		System.out.println("Total Cookies in "+namee+"\'s gift are : "+total_Cookies);
	}
	
	void getSweets() {
		System.out.println("Total Sweets in "+namee+"\'s gift are : "+total_Sweets);
	}
	public static void main(String args[])
	{
		Child swathi=new Child("Swathi");
		swathi.addChocolates(10);
		swathi.addCookies(5);
		swathi.addSweets(5);
		swathi.getChocolates();
		swathi.getCookies();
		swathi.getSweets();
		System.out.println();
		Child teja=new Child("Teja");
		teja.addChocolates(50);
		teja.addCookies(2);
		teja.addSweets(1);
		teja.getChocolates();
		teja.getCookies();
		teja.getSweets();
		
		String max= swathi.total_Chocolates>teja.total_Chocolates ? swathi.namee : teja.namee;
		
		System.out.println();
		
		System.out.println("Maximum number of chocolates are with "+max);
		
		
	}
	

}