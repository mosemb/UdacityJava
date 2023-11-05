package chapter1;

public class ContactManager {
	
	Contact [] contacts;
	int countContacts;
	
	ContactManager(){
		
		this.contacts = new Contact[600];
		this.countContacts = 0;
	}
	
	public void addContact(Contact contact) {
		
		contacts[countContacts] = contact;
		countContacts++;
	}
	
	public Contact nameSearch(String name) {
		
		for(int i =0; i<countContacts;i++) {
			if(contacts[i].name.equals(name)) {
				return contacts[i];
			}
		}
		return null;
	}

}
