package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
    ArrayList<person> contact = new ArrayList<person>();
    public static void main(String[] args) {
        AddressBook adressbook = new AddressBook();
        person person1 = new person();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n == 1) {
            System.out.println("1.Add contact " + "2.exit" + "3.print contact");
            int choice = sc.nextInt();
            if (choice == 1) {
                adressbook.contact.add(addContact());
            }
            else if (choice == 2) {
                System.out.println(adressbook.contact);
            }
            else if (choice == 3) {
                n=2;
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    public static person addContact() {
        person person1 = new person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first name:");
        person1.setFirstName(sc.next());
        System.out.println("Enter a last name:");
        person1.setLastName(sc.next());
        System.out.println("Enter a address:");
        person1.setAddress(sc.next());
        System.out.println("Enter a city:");
        person1.setCity(sc.next());
        System.out.println("Enter a state:");
        person1.setState(sc.next());
        System.out.println("Enter a zip code:");
        person1.setZip(sc.nextInt());
        System.out.println("Enter a phone number:");
        person1.setPhoneNumber(sc.nextLong());
        System.out.println("Enter a email:");
        person1.setEmail(sc.next());
        return person1;
    }
}