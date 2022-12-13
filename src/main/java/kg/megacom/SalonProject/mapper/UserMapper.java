package kg.megacom.SalonProject.mapper;

import kg.megacom.SalonProject.models.dto.UserDto;
import kg.megacom.SalonProject.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserMapper extends BaseMapper<User, UserDto> {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}
