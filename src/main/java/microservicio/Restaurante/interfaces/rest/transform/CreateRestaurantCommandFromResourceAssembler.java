package microservicio.Restaurante.interfaces.rest.transform;

import microservicio.Restaurante.domain.model.commands.CreateRestaurantCommand;
import microservicio.Restaurante.interfaces.rest.resources.CreateRestaurantResource;

public class CreateRestaurantCommandFromResourceAssembler {
    public static CreateRestaurantCommand toCommandFromResource(CreateRestaurantResource resource){
        return new CreateRestaurantCommand(resource.name(), resource.description(), resource.bookingLink());
    }
}
