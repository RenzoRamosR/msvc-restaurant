package microservicio.Restaurante.domain.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import microservicio.Restaurante.domain.model.commands.CreateRestaurantCommand;

@NoArgsConstructor
@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String bookingLink;

    public Restaurant(CreateRestaurantCommand command){
        this.name = command.name();
        this.description = command.description();
        this.bookingLink = command.bookingLink();
    }

}
