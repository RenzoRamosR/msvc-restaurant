package microservicio.Restaurante.interfaces.rest.transform;

import microservicio.Restaurante.domain.model.entities.Restaurant;
import microservicio.Restaurante.interfaces.rest.resources.RestaurantResource;
import org.apache.commons.text.StringEscapeUtils;

public class RestaurantResourceFromEntityAssembler {
    public static RestaurantResource toResourceFromEntity(Restaurant entity){
        return new RestaurantResource(entity.getId(), entity.getName(), entity.getDescription(), entity.getBookingLink());
    }
}
