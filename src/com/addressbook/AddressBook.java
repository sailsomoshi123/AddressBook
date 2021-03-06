package com.addressbook;
import java.util.*;

public class AddressBook {
    static ArrayList<Person> contact = new ArrayList<>();
    static HashMap<String,ArrayList<Person>> book = new HashMap<>();
    static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n==1){
            System.out.println("1.to add addressbook 2.to print 3.to exit");
            int number = sc.nextInt();
            if (number==1){
                addressbook();
                System.out.println("enter a addressbook name:");
                String name = sc.next();
                book.put(name,contact);
            }
            else if (number==2){
                System.out.println(book);
            }
            else if(number==3){
                n=1;
                break;
            }
            else{
                System.out.println("invalid option");
            }
        }
    }

    public static void addressbook () {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n == 1) {
            System.out.println("1.Add contact " + "2.print contact" + " 3.Edit contact" +
                    " 4.delete contact" +" 5.exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                contact.add(addContact());
            } else if (choice == 2) {
                System.out.println(contact);
            } else if (choice == 3) {
                addressBook.editContact();
            } else if (choice == 4) {
                addressBook.deleteContact();
            }else if (choice == 5){
                n = 2;
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    public static Person addContact() {
        Person person = new Person();
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a contact name you wish to edit:");
        ListIterator<Person> itr = contact.listIterator();
        String name = sc.nextLine();
        while (itr.hasNext()) {
            Person person = itr.next();
            if (name.equalsIgnoreCase(person.getFirstName())) {
                System.out.println("choose a option which you want to edit:");
                System.out.println("1.first name  2.Last name 3.address 4.city 5.state 6.zip " +
                        "7.phone number 8.email 9.exit");
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
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                System.out.println("DONE");
            }else {
                System.out.println("There is no such contact available");
            }
        }
    }
    public void deleteContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a contact name you wish to delete:");
        ListIterator<Person> itr = contact.listIterator();
        String name = sc.nextLine();
        while (itr.hasNext()) {
            Person person = itr.next();
            if (name.equalsIgnoreCase(person.getFirstName())){
                itr.remove();
                System.out.println("You remove contact Successfully");
                break;
            }
        }
    }
}

