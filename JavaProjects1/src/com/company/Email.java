package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaulPasswordlength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "QWEcompany.com";

    //Constructor that receive the first name and last name;
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department
        this.department = setDepartment();

        //Call a method that returns a random password;
        this.password = randomPassword(defaulPasswordlength);
        System.out.println("Your password is: " + this.password);

        //Combine elemts to generate a email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix.toLowerCase();
    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("New Worker: "+ firstName + " " + lastName + "\nDepartment codes:" +
                "\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none.\nEnter the department: ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1) {return "Sales";}
        else if(choice == 2) {return "Dev";}
        else if(choice == 3) {return "Acct";}
        else {return "None";}
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand); //pune la fiecare index cate o litera de pe o pozitie random din passwordSet
            //System.out.println(rand);
            //System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String password(){
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " +firstName+ " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " +mailboxCapacity + "mb";
    }
}
