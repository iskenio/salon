package kg.megacom.SalonProject.repositories;

import kg.megacom.SalonProject.models.entities.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepository extends JpaRepository<Salon, Long> {
}
