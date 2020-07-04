package kodzonko.firstWeek;

import lombok.*;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class NBPApiParameters {
    private LocalDate startDate;
    private LocalDate endDate;



    private NBPCurrency currency;

    public void setEndDate(String userInput) throws DateTimeParsingException {
        this.endDate = DateTimeUtilties.loadEndDate(userInput);
    }

    public void setStartDate(String userInput) throws DateTimeParsingException {
        this.startDate = DateTimeUtilties.loadStartDate(userInput, endDate);
    }
}
