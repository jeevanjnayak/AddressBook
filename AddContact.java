
package com.company.AddressBook;

import java.util.Scanner;

public class AddContact {

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailId;
    private String address;
    private String city;
    private String state;
    private int zip;

    public String setFirstName(String firstName){
        this.firstName = firstName;
        return firstName;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
    public long setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public String setEmailId(String emailId){
        this.emailId = emailId;
        return emailId;
    }
    public String setAddress(String address){
        this.address = address;
        return address;
    }
    public String setCity(String city){
        this.city = city;
        return city;
    }
    public String setState(String state){
        this.state = state;
        return state;
    }
    public int setZips(int zip) {
        this.zip = zip;
        return zip;
    }
    public static void main(String[] args) {

        AddContact person = new AddContact();

        System.out.println("add person details");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter person first name: ");
        person.setFirstName(scanner.next());

        System.out.println("Enter person last name: ");
        person.setLastName(scanner.next());

        System.out.println("Enter mobile number: ");
        person.setPhoneNumber(scanner.nextLong());

        System.out.println("Enter the Email id: ");
        person.setEmailId(scanner.next());

        System.out.println("Enter address Details: ");
        System.out.println("Enter address: ");
        person.setAddress(scanner.next());

        System.out.println("Enter city: ");
        person.setCity(scanner.next());

        System.out.println("Enter State name: ");
        person.setState(scanner.next());

        System.out.println("Enter zip: ");
        person.setZips(scanner.nextInt());

        System.out.println("The entered person details is as follows: ");
        System.out.println("Name - " + person.firstName + " " + person.lastName + "\nPhone number - " + person.phoneNumber +
                           "\nEmail id - " + person.emailId + "\nAddress - " + person.address + "\nCity - " + person.city +
                           "\nState - " + person.state + "\nZip - " + person.zip);
    }
}
