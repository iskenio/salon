package kg.megacom.SalonProject.service.impl;

import kg.megacom.SalonProject.mapper.MasterMapper;
import kg.megacom.SalonProject.models.dto.MasterDto;
import kg.megacom.SalonProject.models.entities.Master;
import kg.megacom.SalonProject.repositories.MasterRepository;
import kg.megacom.SalonProject.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterServiceImpl implements MasterService {
    @Autowired
    MasterRepository rep;
    MasterMapper mapper = MasterMapper.INSTANCE;
    @Override
    public MasterDto save(MasterDto masterDto) {
        return mapper.toDto(rep.save(mapper.toEntity(masterDto)));
    }

    @Override
    public MasterDto findById(Long id) {
        return MasterMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Не найден мастер с таким id")));

    }

    @Override
    public List<MasterDto> findAll() {
        return MasterMapper.INSTANCE.toDtos(rep.findAll());
    }


    @Override
    public List<MasterDto> findBySalon(Long id) {
        List<Master>masters =rep.findBySalon(id);
        return mapper.toDtos(masters);
    }
}
