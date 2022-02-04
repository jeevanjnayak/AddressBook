package com.company.AddressBook;

public class AddressBook {
    public String firstName;
    public String lastName;
    public long phoneNumber;
    public String emailId;
    public String address;
    public String city;
    public String state;
    public int zip;

    public void Printing(){
        System.out.println();
    }

    public AddressBook(String firstName, String lastName, long phoneNumber,
                   String emailId, String address, String city, String state, int zip) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public static void main(String[] args){
        AddressBook obj1 = new AddressBook("Jeevan", "Nayak", 9073454, "jeevan@gmail.com",
                                           "Dhusuri", "Bhadrak","Odisha", 756119 );
        System.out.println(obj1.firstName+ " " +obj1.lastName+ "\n" +obj1.phoneNumber+ "\n" +obj1.emailId+ "\n"
                           +obj1.address+ "\n" +obj1.city+ "\n" +obj1.state+ "\n"+obj1.zip);
    }

}
