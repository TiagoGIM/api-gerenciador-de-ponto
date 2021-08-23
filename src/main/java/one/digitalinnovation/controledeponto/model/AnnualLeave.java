package one.digitalinnovation.controledeponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class AnnualLeave {
    @Data
    @Embeddable
    static class AnnualLeaveId implements Serializable {
        private Long annualLeaveId;
        private Long movementId;
        private Long userId;
    }

    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime workedDay;
    private BigDecimal quantityHour;
    private BigDecimal balanceHour;
}
