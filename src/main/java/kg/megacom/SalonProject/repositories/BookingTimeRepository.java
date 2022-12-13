package kg.megacom.SalonProject.repositories;

import kg.megacom.SalonProject.models.entities.BookingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingTimeRepository extends JpaRepository<BookingTime, Long> {

}
