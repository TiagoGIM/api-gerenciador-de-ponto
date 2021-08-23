package one.digitalinnovation.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    private UserCategory userCategory;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private JobDescription jobDescription;
    private Integer toleranceTime;
    private LocalDateTime shiftIn;
    private LocalDateTime shiftOut;

}
