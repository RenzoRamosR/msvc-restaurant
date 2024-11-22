package microservicio.Restaurante.domain.services;


import microservicio.Restaurante.domain.model.entities.Restaurant;
import microservicio.Restaurante.domain.model.queries.GetAllRestaurantsQuery;
import microservicio.Restaurante.domain.model.queries.GetRestaurantByIdQuery;
import microservicio.Restaurante.domain.model.queries.GetRestaurantByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RestaurantQueryService {
    List<Restaurant> handle(GetAllRestaurantsQuery query);
    Optional<Restaurant> handle(GetRestaurantByIdQuery query);
    Optional<Restaurant> handle(GetRestaurantByNameQuery query);
}
