package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        double[] usage = DayPowerData.usage;
        
        double[] prices = DayPowerData.prices;

        System.out.println("Strømpriser:");
        DailyPower.printPowerPrices(prices);

        System.out.println("\nStrømforbruk:");
        DailyPower.printPowerUsage(usage);

        System.out.printf(
                "%nTotal strømforbruk: %.2f kWh%n",
                DailyPower.computePowerUsage(usage)
        );

        System.out.printf(
                "Strømpris med spotpris: %.2f NOK%n",
                DailyPower.computeSpotPrice(usage, prices)
        );

        System.out.printf(
                "Strømstøtte: %.2f NOK%n",
                DailyPower.computePowerSupport(usage, prices)
        );

        System.out.printf(
                "Norgespris: %.2f NOK%n",
                DailyPower.computeNorgesPrice(usage)
        );

        System.out.printf(
                "Største strømforbruk: %.2f kWh%n",
                DailyPower.findPeakUsage(usage)
        );

        System.out.printf(
                "Gjennomsnittlig strømforbruk: %.2f kWh%n",
                DailyPower.findAvgPower(usage)
        );
    }
}