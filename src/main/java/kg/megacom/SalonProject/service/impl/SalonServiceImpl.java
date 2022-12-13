package kg.megacom.SalonProject.service.impl;

import kg.megacom.SalonProject.mapper.SalonMapper;
import kg.megacom.SalonProject.models.dto.SalonDto;
import kg.megacom.SalonProject.repositories.SalonRepository;
import kg.megacom.SalonProject.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalonServiceImpl implements SalonService {
    @Autowired
    SalonRepository rep;
    SalonMapper mapper = SalonMapper.INSTANCE;
    @Override
    public SalonDto save(SalonDto salonDto) {
        return mapper.toDto(rep.save(mapper.toEntity(salonDto)));
    }

    @Override
    public SalonDto findById(Long id) {

        return SalonMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Не найден салон с таким id")));
    }

    @Override
    public List<SalonDto> findAll() {

        return SalonMapper.INSTANCE.toDtos(rep.findAll());
    }
}
