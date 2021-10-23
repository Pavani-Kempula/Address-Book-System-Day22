package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Address Book Problem");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBook.getMenu();
    }
}

