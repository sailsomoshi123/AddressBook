package com.addressbook;
import java.util.ArrayList;

public class AddressBook {
    public static void main(String[] args) {
        ArrayList<person> contact = new ArrayList<person>();
        person person1 = new person();
        person1.setFirstName("sail");
        person1.setLastName("somoshi");
        person1.setAddress("shiroli");
        person1.setCity("pune");
        person1.setState("maharastra");
        person1.setZip(410511);
        person1.setPhoneNumber(88888888);
        person1.setEmail("sail@123");
        contact.add(person1);
        System.out.println(contact);

    }
}
