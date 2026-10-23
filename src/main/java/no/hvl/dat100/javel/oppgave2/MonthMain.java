package no.hvl.dat100.javel.oppgave2;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("a) Forbruk:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        System.out.println("b) Priser:");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        double usage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("c) Totalt forbruk: %.2f kWh%n", usage);

        System.out.println("d) Over 1000 kWh (hytte):  " + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println("d) Over 5000 kWh (bolig):  " + MonthlyPower.exceedThreshold(power_usage_month, 5000));

        System.out.printf("e) Spotpris:     %.2f NOK%n",
                MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.printf("f) Strømstøtte:  %.2f NOK%n",
                MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.printf("g) Norgespris:   %.2f NOK%n",
                MonthlyPower.computeNorgesPrice(power_usage_month));
    }
}
