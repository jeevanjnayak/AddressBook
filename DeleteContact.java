package com.company.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact {

    static ArrayList<AddContact> personList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int counter;
    static int indexOfPerson = 0;


    public static void addContact() {

        AddContact person = new AddContact();

        System.out.println("add person details");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter person first name: ");
        person.setFirstName(sc.next());

        System.out.println("Enter person last name: ");
        person.setLastName(sc.next());

        System.out.println("Enter mobile number: ");
        person.setPhoneNumber(sc.nextLong());

        System.out.println("Enter the Email id: ");
        person.setEmailId(sc.next());

        System.out.println("Enter address Details: ");
        System.out.println("Enter address: ");
        person.setAddress(sc.next());

        System.out.println("Enter city: ");
        person.setCity(sc.next());

        System.out.println("Enter State name: ");
        person.setState(sc.next());

        System.out.println("Enter zip: ");
        person.setZips(sc.nextInt());

        personList.add(person);
        System.out.println();
        System.out.println("Person added");
        counter++;
    }
    static void editContact() {

        if (counter > 0) {
            System.out.println("Enter Persons FirstName you want to edit: ");
            String searchName = sc.next();

            boolean isFoundPerson = false;

            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getFirstName().equals(searchName)) {
                    isFoundPerson = true;
                    indexOfPerson = i;
                    break;
                }
            }
            if (isFoundPerson) {

                System.out.print("\nEnter new address: ");
                personList.get(indexOfPerson).setAddress(sc.next());

                System.out.println("Enter new city  ");
                personList.get(indexOfPerson).setCity(sc.next());

                System.out.println("Enter new zip: ");
                personList.get(indexOfPerson).setZips(sc.nextInt());

                System.out.println("Enter mobile number: ");
                personList.get(indexOfPerson).setPhoneNumber(Long.parseLong(sc.next()));

                System.out.println("Enter the Email id: ");
                personList.get(indexOfPerson).setEmailId(sc.next());

                personList.get(indexOfPerson).setFirstName(searchName);

                System.out.println("Enter Last Name: ");
                personList.get(indexOfPerson).setLastName(sc.next());

                System.out.println();
                System.out.println("Edit completed");

            } else
                System.out.println("No person found with this searchName");
        } else
            System.out.println("There is no record to edit");
    }
    static void deleteContact(){
        if (counter > 0) {
            System.out.println("Enter Persons FirstName you want to edit: ");
            String searchName = sc.next();

            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getFirstName().equals(searchName)) {
                    personList.remove(i);
                    break;
                }
            }
        }
    }
    static void choices() {

        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice \n1: Add \n2: Edit \n3: Display Details \n4: Delete \n0: Exit ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    System.out.println("The entered person details is as follows: ");
                    editContact();
                    break;
                case 3:
                    System.out.println(personList.toString());
                    break;
                case 4:
                    deleteContact();
                    break;
                default:
                    System.out.println("Enter number from 1 to 4");
                    choice = 5;
            }
        }
        while (choice < 5);
    }

    public static void main(String[] args) {
        choices();
    }
}
