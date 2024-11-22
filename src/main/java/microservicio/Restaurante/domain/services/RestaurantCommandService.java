package microservicio.Restaurante.domain.services;

import microservicio.Restaurante.domain.model.commands.CreateRestaurantCommand;
import microservicio.Restaurante.domain.model.commands.DeleteRestaurantCommand;

public interface RestaurantCommandService {
    Long handle(CreateRestaurantCommand command);
    void handle(DeleteRestaurantCommand command);
}
