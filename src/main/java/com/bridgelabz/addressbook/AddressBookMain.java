package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Address Book Problem");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true){

            System.out.println("Enter \n 1 . Add new contact \n 2 . Edit \n 3 . Delete \n 0 . for exit");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    addressBook.add();
                    System.out.println("You have Entered following data");
                    System.out.println(addressBook.contact);
                    break;
                case 2:
                    addressBook.editContact();
                    System.out.println("You have Entered following data");
                    System.out.println(addressBook.contact);
                    System.out.println("Thank for Using Address book");
                    break;
                case 3:
                    addressBook.delete();
                    System.out.println("Now data is :" + addressBook.contact);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You entered the wrong please input choose correct one : ");
                    continue;
            }
        }
    }
}

