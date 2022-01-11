package com.addressbook;
import java.util.*;

public class AddressBook {
    ArrayList<person> contact = new ArrayList<person>();

    public static void main(String[] args) {
        AddressBook adressbook = new AddressBook();
        person person = new person();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n == 1) {
            System.out.println("1.Add contact " + "2.print contact" + " 3.Edit contact" + " 4.exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                adressbook.contact.add(addContact());
            } else if (choice == 2) {
                System.out.println(adressbook.contact);
            } else if (choice == 3) {
                adressbook.editContact();
            } else if (choice == 4) {
                n = 2;
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    public static person addContact() {
        person person = new person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first name:");
        person.setFirstName(sc.next());
        System.out.println("Enter a last name:");
        person.setLastName(sc.next());
        System.out.println("Enter a address:");
        person.setAddress(sc.next());
        System.out.println("Enter a city:");
        person.setCity(sc.next());
        System.out.println("Enter a state:");
        person.setState(sc.next());
        System.out.println("Enter a zip code:");
        person.setZip(sc.nextInt());
        System.out.println("Enter a phone number:");
        person.setPhoneNumber(sc.nextLong());
        System.out.println("Enter a email:");
        person.setEmail(sc.next());
        return person;
    }

    public void editContact() {
        AddressBook addressBook=new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a contact name you wish to edit:");
        ListIterator<person> itr = contact.listIterator();
        String name = sc.nextLine();
        while (itr.hasNext()) {
            person person = itr.next();
            if (name.equals(person.getFirstName())) {
                System.out.println("choose a option which you want to edit:");
                System.out.println("1.first name  2.Last name 3.address 4.city 5.state 6.zip " +
                        "7.phone number 8.email");
                int opt =sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Enter a first name:");
                        person.setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter a last name:");
                        person.setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter a address:");
                        person.setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter a city:");
                        person.setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter a state:");
                        person.setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter a zip code:");
                        person.setZip(sc.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter a phone number:");
                        person.setPhoneNumber(sc.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter a email:");
                        person.setEmail(sc.next());
                        break;
                    case 9:
                        System.exit(0);
                }
            }
        }
    }
}

