package chapter1;

public class ContactTestdrive {
	
	
	public static void main(String [] args) {
		ContactManager contactman = new ContactManager();
		
		Contact contact = new Contact();
		contact.name = "James";
		contact.phoneNumber ="345-897-563";
		contact.emailaddress = "james@ricky.com";
		
		Contact contact2 = new Contact();
		contact2.name = "Jake";
		contact2.phoneNumber ="975-897-563";
		contact2.emailaddress = "Jake@ricky.com";
		
		contactman.addContact(contact2);
		
		
		contactman.addContact(contact);
		Contact result = contactman.nameSearch("James");
		System.out.println(result.phoneNumber);
		
		Contact result2 = contactman.nameSearch("Jake");
		System.out.println(result2.phoneNumber);
		
	}

}
