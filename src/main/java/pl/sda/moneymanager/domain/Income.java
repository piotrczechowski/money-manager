package pl.sda.moneymanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Income extends BaseEntity {
    private long incomeValueInCent;

    @OneToOne
    private Person person;

    @ManyToOne
    private IncomeSource incomeSource;
}