package microservicio.Restaurante.application.internal.queryservices;


import microservicio.Restaurante.domain.model.entities.Restaurant;
import microservicio.Restaurante.domain.model.queries.GetAllRestaurantsQuery;
import microservicio.Restaurante.domain.model.queries.GetRestaurantByIdQuery;
import microservicio.Restaurante.domain.model.queries.GetRestaurantByNameQuery;
import microservicio.Restaurante.domain.services.RestaurantQueryService;
import microservicio.Restaurante.infrastructure.persistence.jpa.repositories.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantQueryServiceImpl implements RestaurantQueryService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantQueryServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> handle(GetAllRestaurantsQuery query) {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> handle(GetRestaurantByIdQuery query) {
        return restaurantRepository.findById(query.restaurantId());
    }

    @Override
    public Optional<Restaurant> handle(GetRestaurantByNameQuery query) {
        return restaurantRepository.findByName(query.name());
    }
}
