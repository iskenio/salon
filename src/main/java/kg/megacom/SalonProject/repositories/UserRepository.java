package kg.megacom.SalonProject.repositories;

import kg.megacom.SalonProject.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
