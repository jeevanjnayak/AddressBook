
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

    public String getFirstName() {
        return firstName;
    }
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
    @Override
    public String toString() {
        return "\nPerson Info [first Name= " + firstName + ", last Name= " + lastName + ", Email id= " + emailId +
                ", address= " + address + "," + " city= " + city + ", state= " + state + ", zipcode= " + zip + ", " +
                "phoneNumber= " + phoneNumber + "]\n";
        }
}
