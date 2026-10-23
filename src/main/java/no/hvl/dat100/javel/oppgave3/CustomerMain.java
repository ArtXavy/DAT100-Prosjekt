package no.hvl.dat100.javel.oppgave3;


public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer customer = new Customer(
                "Alice Smith",
                "alice@example.com",
                1000,
                PowerAgreementType.SPOTPRICE
        );
        // Test av get-metoder
        System.out.println("Navn: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("ID: " + customer.getCustomer_id());
        System.out.println("Avtale: " + customer.getAgreement());

        // Test av set-metoder
        customer.setName("Alice Johnson");
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        // Test av toString-metoden
        System.out.println();
        System.out.println("=== Etter endringer ===");
        System.out.println(customer.toString());
    }
}
