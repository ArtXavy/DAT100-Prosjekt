package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        // c) test av printInvoice
        Customer c = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);

        Invoice faktura = new Invoice(c, "January",
                CustomerPowerUsageData.usage_month_customer1,
                MonthPowerData.powerprices_month);

        faktura.computeAmount();
        faktura.printInvoice();

    }
}
