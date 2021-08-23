package one.digitalinnovation.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {
    @Id
    private Long id;
    private String description;
    private String address; //create a entety to adress
    private String city;
    private String country;
    private String state;
}
