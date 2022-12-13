package kg.megacom.SalonProject.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MasterDto {
    Long id;
    String name;
    int experience;
    SalonDto salonId;
}
