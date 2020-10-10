package pl.sda.moneymanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Income {
    private Long id;
    private long incomeValueInCent;
    private LocalDateTime creationTimestamp;
    private LocalDateTime updateTimestamp;
    private Person person;
    private IncomeSource incomeSource;
}
