package kodzonko.firstWeek;

import java.util.Optional;

public enum NBPCurrency {
    DOLAR_AMERYKANSKI("USD"),
    RUBEL_ROSYJSKI("RUB"),
    EURO("EUR");

    private String shortName;

    NBPCurrency(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public static Optional<NBPCurrency> parse(String input){
        if (input.toUpperCase().contains("DOLAR")){
        return Optional.of(NBPCurrency.DOLAR_AMERYKANSKI);
        }else if (input.toUpperCase().contains("RUBEL")){
        return Optional.of(NBPCurrency.RUBEL_ROSYJSKI);
        }else if (input.toUpperCase().contains("EURO")){
        return Optional.of(NBPCurrency.EURO);
        }
        return Optional.empty();
    }
    //    NBPCurrency currency = NBPCurrency.EURO;
//        System.out.println(currency); // EURO
//        System.out.println(currency.getShortName()); // EUR

}
