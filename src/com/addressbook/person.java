package com.addressbook;

public class person {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private String state;
    private int zip;
    private long phoneNumber;

    person(){
    }

    person(String firstName, String lastName, String address, String city,String email,
           String state,int zip ,Long phoneNumber) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.email=email;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString () {
        return firstName + " " + lastName + " " + address + " " + city + " " + state + " " + zip + " " + phoneNumber + " " + email;
    }
}

