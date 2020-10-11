package pl.sda.moneymanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Income extends BaseEntity {
    private long incomeValueInCent;

    @OneToOne
    private Person person;

    @OneToOne
    private IncomeSource incomeSource;
}

