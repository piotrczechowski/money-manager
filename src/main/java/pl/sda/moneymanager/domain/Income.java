package pl.sda.moneymanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Income extends BaseEntity {

    private long incomeValueInPolishCent;
    private Person person;
    private IncomeSource incomeSource;
}

