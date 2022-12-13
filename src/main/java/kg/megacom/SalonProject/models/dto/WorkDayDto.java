package kg.megacom.SalonProject.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.megacom.SalonProject.models.enums.WorkDayStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class WorkDayDto {
    Long id;
    Date startDate;
    Date endDate;
    @JsonIgnore
    List<MasterDto> masterDtoId;
    WorkDayStatus status;
}

