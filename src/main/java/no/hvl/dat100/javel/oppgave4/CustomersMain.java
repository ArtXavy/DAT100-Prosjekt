package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers kunder = new Customers(5);

        kunder.addCustomer(new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE));
        kunder.addCustomer(new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE));
        kunder.addCustomer(new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT));

        System.out.println("Antall kunder: " + kunder.countNonNull());

        // e) slette kunde
        Customer fjernet = kunder.removeCustomer(1002);
        System.out.println("Fjernet: " + (fjernet != null ? fjernet.getName() : "ingen"));
        System.out.println("Fjerne ukjent id 9999: " + kunder.removeCustomer(9999));
        System.out.println("Antall kunder etter sletting: " + kunder.countNonNull());
        System.out.println();

        // f) hente alle kunder
        Customer[] alle = kunder.getCustomers();
        System.out.println("getCustomers() ga " + alle.length + " kunder:");
        for (Customer c : alle) {
            System.out.println(c);
            System.out.println();
        }
    }
}
