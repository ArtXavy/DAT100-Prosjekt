package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a)
    public static void printPowerPrices(double[] prices) {

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f NOK ", prices[i]);
        }

        System.out.println();
    }

    // b) 
    public static void printPowerUsage(double[] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.printf("%.2f kWh ", usage[i]);
        }

        System.out.println();
    }

    // c)
    public static double computePowerUsage(double[] usage) {

        double sum = 0.0;

        for (int i = 0; i < usage.length; i++) {
            sum = sum + usage[i];
        }

        return sum;
    }

    // d)
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0.0;

        for (int i = 0; i < usage.length; i++) {
            price = price + usage[i] * prices[i];
        }

        return price;
    }

    // e)
    private static double getSupport(double usage, double price) {

        double minBruk = 0.9375;

        if (price > minBruk) {
            return usage * (price - minBruk) * 0.90;
        }

        return 0.0;
    }

    // f)
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0.0;

        for (int i = 0; i < usage.length; i++) {
            support = support + getSupport(usage[i], prices[i]);
        }

        return support;
    }

    // g)   
    public static double computeNorgesPrice(double[] usage) {

        double norgesPris = 0.0;

        for (int i = 0; i < usage.length; i++) {
            norgesPris = norgesPris + usage[i];
        }

        return norgesPris * 0.50;
    }

    // h) 
    public static double findPeakUsage(double[] usage) {

        double maksBruk = usage[0];

        for (int i = 1; i < usage.length; i++) {
            if (usage[i] > maksBruk) {
                maksBruk = usage[i];
            }
        }

        return maksBruk;
    }

    // i) 
    public static double findAvgPower(double[] usage) {

        double average = computePowerUsage(usage);

        return average / usage.length;
    }
}