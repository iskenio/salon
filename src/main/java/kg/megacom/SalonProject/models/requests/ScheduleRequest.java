package kg.megacom.SalonProject.models.requests;

import kg.megacom.SalonProject.models.dto.MasterDto;
import kg.megacom.SalonProject.models.entities.Master;
import kg.megacom.SalonProject.models.enums.WorkDayStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScheduleRequest {
    Date startDate;
    Date endDate;
    WorkDayStatus status;
    MasterDto masterDtoId;
}
