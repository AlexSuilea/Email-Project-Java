package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Email email1 = new Email("John","Smith");
        System.out.println(email1.showInfo());
        System.out.println();
        Email email2 = new Email("Alex","Suilea");
        System.out.println(email2.showInfo());
        System.out.println();
        Email email3 = new Email("Ioana","Georgescu");
        System.out.println(email3.showInfo());
    }
}
