package kg.megacom.SalonProject.service.impl;

import kg.megacom.SalonProject.mapper.UserMapper;
import kg.megacom.SalonProject.models.dto.UserDto;
import kg.megacom.SalonProject.repositories.UserRepository;
import kg.megacom.SalonProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository rep;
    UserMapper mapper = UserMapper.INSTANCE;
    @Override
    public UserDto save(UserDto userDto) {
        return mapper.toDto(rep.save(mapper.toEntity(userDto)));
    }

    @Override
    public UserDto findById(Long id) {
        return UserMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Не найден пользователь с таким id")));
    }

    @Override
    public List<UserDto> findAll() {
        return UserMapper.INSTANCE.toDtos(rep.findAll());
    }
}
