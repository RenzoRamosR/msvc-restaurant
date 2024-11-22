package microservicio.Restaurante.infrastructure.persistence.jpa.repositories;

import microservicio.Restaurante.domain.model.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    Optional<Restaurant> findByName(String name);
    boolean existsByName(String name);
}
