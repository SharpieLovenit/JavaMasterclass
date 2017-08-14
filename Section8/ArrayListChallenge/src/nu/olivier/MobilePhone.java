package nu.olivier;


import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactPosition = findContact(oldContact);
        if (contactPosition<0) {
            System.out.println("Old contact "+oldContact.getName() + " not found.");
            return false;
        }
        else {
            this.myContacts.set(contactPosition, newContact);
            System.out.println("Old contact " + oldContact.getName() + " replaced with " + newContact.getName());
            return true;
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i=0;i<myContacts.size();i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
