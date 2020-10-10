package pl.sda.moneymanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Income {

    private long id;
    private long incomeValueInPolishCent;
    private LocalDateTime creationTimestamp;
    private LocalDateTime updateTimestamp;
    private Person person;
    private IncomeSource incomeSource;

}
