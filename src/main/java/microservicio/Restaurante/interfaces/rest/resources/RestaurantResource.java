package microservicio.Restaurante.interfaces.rest.resources;

public record RestaurantResource(
        Long id,
        String name,
        String description,
        String bookingLink) {
}
