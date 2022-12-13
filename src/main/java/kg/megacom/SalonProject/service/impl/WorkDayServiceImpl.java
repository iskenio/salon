package kg.megacom.SalonProject.service.impl;

import kg.megacom.SalonProject.mapper.WorkDayMapper;
import kg.megacom.SalonProject.models.dto.WorkDayDto;
import kg.megacom.SalonProject.models.requests.ScheduleRequest;
import kg.megacom.SalonProject.repositories.WorkDayRepository;
import kg.megacom.SalonProject.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkDayServiceImpl implements WorkDayService {
    @Autowired
    WorkDayRepository rep;
    WorkDayMapper mapper = WorkDayMapper.INSTANCE;
    @Override
    public WorkDayDto save(WorkDayDto workDayDto) {
        return mapper.toDto(rep.save(mapper.toEntity(workDayDto)));
    }

    @Override
    public WorkDayDto findById(Long id) {
        return WorkDayMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Не найдена дата")));
    }

    @Override
    public List<WorkDayDto> findAll() {
        return WorkDayMapper.INSTANCE.toDtos(rep.findAll());
    }

    @Override
    public String createSchedule(ScheduleRequest scheduleRequest) {
        WorkDayDto dto = new WorkDayDto();
        dto.setStatus(scheduleRequest.getStatus());
        dto.setStartDate(scheduleRequest.getStartDate());
        dto.setEndDate(scheduleRequest.getEndDate());
        save(dto);
        return "success";
    }

    @Override
    public List<WorkDayDto> getList() {
        List<WorkDayDto> workDayDtos = findAll();
        System.out.println(workDayDtos);
        return workDayDtos;
    }

    @Override
    public String setSchedule(Long workDayId, Long masterId) {
        int result = rep.create(workDayId, masterId);
        System.out.println(result);
        return "success";
    }
}
