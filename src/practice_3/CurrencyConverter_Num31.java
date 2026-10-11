package practice_3;

public class CurrencyConverter_Num31 {
    private double usdRate;
    private double eurRate;

    public CurrencyConverter_Num31(double usdRate, double eurRate) {
        this.usdRate = usdRate;
        this.eurRate = eurRate;
    }
    public double rubToUsd(double rubles) {
        return rubles / usdRate;
    }

    public double rubToEur(double rubles) {
        return rubles / eurRate;
    }
}
