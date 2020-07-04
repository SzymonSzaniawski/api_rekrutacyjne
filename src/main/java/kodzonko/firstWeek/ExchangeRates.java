package kodzonko.firstWeek;

import lombok.Data;

import java.util.List;
// POJO - plain old java objest
//pusty konstruktor
// prywatne pola
//gettery i settery
@Data
public class ExchangeRates {

    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;
}
