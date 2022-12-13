package kg.megacom.SalonProject.mapper;

import kg.megacom.SalonProject.models.dto.MasterDto;
import kg.megacom.SalonProject.models.entities.Master;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MasterMapper extends BaseMapper<Master, MasterDto> {
    MasterMapper INSTANCE = Mappers.getMapper(MasterMapper.class);
}
