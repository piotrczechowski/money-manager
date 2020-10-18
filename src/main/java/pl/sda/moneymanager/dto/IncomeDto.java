package pl.sda.moneymanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncomeDto extends BaseDto {
    private long incomeValueInCent;
    private PersonDto person;
    private IncomeSourceDto incomeSource;
}
