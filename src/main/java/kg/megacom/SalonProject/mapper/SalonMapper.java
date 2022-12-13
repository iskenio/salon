package kg.megacom.SalonProject.mapper;

import kg.megacom.SalonProject.models.dto.SalonDto;
import kg.megacom.SalonProject.models.entities.Salon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface SalonMapper extends BaseMapper<Salon, SalonDto> {
    SalonMapper INSTANCE = Mappers.getMapper(SalonMapper.class);
}
