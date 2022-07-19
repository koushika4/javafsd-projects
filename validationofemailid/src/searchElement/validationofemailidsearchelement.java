package searchElement;

import java.util.ArrayList;


public class validationofemailidsearchelement {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> emailID = new ArrayList<String>();
		
		emailID.add("koushi.balusu@gmail.com");
		emailID.add("praneetha.katta@gmail.com");
		emailID.add("phani.sri@gmail.com");
		emailID.add("mouni.bhagya@gmail.com");
		emailID.add("teja.bodapudi@gmail.com");
		emailID.add("shanu.pendiyala@gmail.com");
		emailID.add("lohi.kanumuri@gmail.com");
		
		
		String searchElement = "koushi.balusu@gmail.com";
		
		for(int i=0; i<emailID.size(); i++) {
			
			System.out.println(emailID.get(i));
			
			if(searchElement==emailID.get(i)) {
				
				System.out.println("\n");
				
				System.out.println("email ID" + searchElement + "found");
				
				break;
			}
		}
			
	}

}
