package practice_3;

import java.text.NumberFormat;
import java.util.Locale;

public class TestCurrencyConverter_Num31 {
    public static void main(String[] args) {
        CurrencyConverter_Num31 converter = new CurrencyConverter_Num31(90, 110);

        double rubles = 1000;
        double dollars = converter.rubToUsd(rubles);
        double euros = converter.rubToEur(rubles);

        NumberFormat usdFormat =
                NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat eurFormat =
                NumberFormat.getCurrencyInstance(Locale.GERMANY);

        System.out.printf("Исходная сумма: %.2f RUB%n", rubles);
        System.out.println("В долларах: " + usdFormat.format(dollars));
        System.out.println("В евро: " + eurFormat.format(euros));
    }
}
