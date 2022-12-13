package kg.megacom.SalonProject.models.dto;

import kg.megacom.SalonProject.models.enums.BookingStatus;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
@Getter
@Setter
public class BookingTimeDto {
    Long id;
    Date startDate;
    Date endDate;
    Date addDate;
    Date updateDate;
    BookingStatus status;
    List<WorkDayDto> recordId;
    UserDto userDto;
}
