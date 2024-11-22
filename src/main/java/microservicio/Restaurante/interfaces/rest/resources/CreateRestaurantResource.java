package microservicio.Restaurante.interfaces.rest.resources;

public record CreateRestaurantResource(String name,
                                       String description,
                                       String bookingLink) {
}