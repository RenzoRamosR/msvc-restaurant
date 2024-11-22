package microservicio.Restaurante.application.internal.commandservices;


import microservicio.Restaurante.domain.model.commands.CreateRestaurantCommand;
import microservicio.Restaurante.domain.model.commands.DeleteRestaurantCommand;
import microservicio.Restaurante.domain.model.entities.Restaurant;
import microservicio.Restaurante.domain.services.RestaurantCommandService;
import microservicio.Restaurante.infrastructure.persistence.jpa.repositories.RestaurantRepository;
import org.springframework.stereotype.Service;

@Service
public class RestaurantCommandServiceImpl implements RestaurantCommandService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantCommandServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Long handle(CreateRestaurantCommand command) {
        if(restaurantRepository.existsByName(command.name())) {
            throw new IllegalArgumentException("Restaurant with the same name already exists");
        }

        var restaurant = new Restaurant(command);

        try {
            restaurantRepository.save(restaurant);
        } catch (Exception e) {
            throw new IllegalArgumentException("Error while saving restaurant: " + e.getMessage());
        }
        return restaurant.getId();
    }

    @Override
    public void handle(DeleteRestaurantCommand command) {
        restaurantRepository.deleteById(command.restaurantId());
        System.out.println("Restaurant Delete");
    }
}
