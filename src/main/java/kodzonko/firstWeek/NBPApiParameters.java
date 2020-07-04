package kodzonko.firstWeek;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NBPApiParameters {
    private LocalDate startDate;
    private LocalDate endDate;
    private NBPCurrency currency = NBPCurrency.EURO;


}
