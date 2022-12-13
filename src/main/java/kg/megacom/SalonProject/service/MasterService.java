package kg.megacom.SalonProject.service;

import kg.megacom.SalonProject.models.dto.MasterDto;

import java.util.List;

public interface MasterService extends BaseService<MasterDto> {
    List<MasterDto> findBySalon(Long id);
}
