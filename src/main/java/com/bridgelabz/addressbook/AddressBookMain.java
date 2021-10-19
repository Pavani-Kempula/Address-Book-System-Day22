package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Address Book Problem");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        addressBook.add();
        System.out.println("You have Entered following data");

        System.out.println("Enter Y/y to edit ");
        String op = sc.nextLine();

        if(op.equals("y") || op.equals("Y")){
            addressBook.editContact();
            System.out.println("You have Entered following data");
            System.out.println("Thanks for Using Address book");
        }else {
            System.out.println("Thanks for using ");
        }
    }
}

