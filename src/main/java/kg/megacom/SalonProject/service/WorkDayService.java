package kg.megacom.SalonProject.service;

import kg.megacom.SalonProject.models.dto.WorkDayDto;
import kg.megacom.SalonProject.models.requests.ScheduleRequest;

import java.util.List;

public interface WorkDayService extends BaseService<WorkDayDto> {
    String createSchedule(ScheduleRequest scheduleRequest);
    List<WorkDayDto> getList();
    String setSchedule(Long workDayId, Long masterId);
}
