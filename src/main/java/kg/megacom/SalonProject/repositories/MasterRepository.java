package kg.megacom.SalonProject.repositories;

import kg.megacom.SalonProject.models.entities.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MasterRepository extends JpaRepository<Master, Long> {
    @Query("select m from Master m where m.salonId.id=:salonId")
    List<Master> findBySalon(Long salonId);
}
