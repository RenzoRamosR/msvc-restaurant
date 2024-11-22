package microservicio.Restaurante.domain.model.commands;

public record CreateRestaurantCommand(String name, String description, String bookingLink) {

}
