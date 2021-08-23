package one.digitalinnovation.controledeponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movement {

    @Data
    @Embeddable
    public class MovementId implements Serializable {
       private Long movementId;
       private Long userId;
    }
    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;
    private BigDecimal periodo;
    private Frequency occurrence;
    private Calendar calendar;


}
