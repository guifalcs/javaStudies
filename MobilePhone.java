import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> myContacts;
    String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            System.out.println("Contact already exists");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public void printContacts(){
        for (Contact contact : myContacts) {
            System.out.println("Name: " + contact.getName() + " \nPhone: " + contact.getPhoneNumber());
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (!myContacts.contains(oldContact)) {
            System.out.println("Contact not found");
            return false;
        }

        myContacts.set(myContacts.indexOf(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            System.out.println("Contact not found");
            return false;
        }

        myContacts.remove(contact);
        return true;
    }
}
