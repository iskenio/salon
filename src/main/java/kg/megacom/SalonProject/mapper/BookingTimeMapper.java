package kg.megacom.SalonProject.mapper;

import kg.megacom.SalonProject.models.dto.BookingTimeDto;
import kg.megacom.SalonProject.models.entities.BookingTime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BookingTimeMapper extends BaseMapper<BookingTime, BookingTimeDto> {
    BookingTimeMapper INSTANCE = Mappers.getMapper(BookingTimeMapper.class);
}
