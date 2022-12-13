package kg.megacom.SalonProject.mapper;

import kg.megacom.SalonProject.models.dto.WorkDayDto;
import kg.megacom.SalonProject.models.entities.WorkDay;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface WorkDayMapper extends BaseMapper<WorkDay, WorkDayDto> {
    WorkDayMapper INSTANCE = Mappers.getMapper(WorkDayMapper.class);
}
