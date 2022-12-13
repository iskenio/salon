package kg.megacom.SalonProject.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.SalonProject.configs.Swagger2config;
import kg.megacom.SalonProject.models.dto.WorkDayDto;
import kg.megacom.SalonProject.models.requests.ScheduleRequest;
import kg.megacom.SalonProject.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/day")
@Api(tags = Swagger2config.WorkDay)
public class WorkDayController {
    @Autowired
    private WorkDayService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение графика")
    public ResponseEntity<?> save(@RequestBody WorkDayDto workDayDto){
        try {
            return ResponseEntity.ok(service.save(workDayDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }


    @PostMapping("create/schedule")
    @ApiOperation("Создание графика")
    public ResponseEntity<?> createSchedule(@RequestBody ScheduleRequest request){
        try {
            return ResponseEntity.ok(service.createSchedule(request));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("get/schedule/list")
    @ApiOperation("Вывод графика")
    public ResponseEntity<?> getScheduleList(){
        try {
            return ResponseEntity.ok(service.getList());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @PutMapping("set/master/schedule")
    @ApiOperation("Редактирование графика")
    public ResponseEntity<?> setSchedule(@RequestParam Long workDayId, @RequestParam Long masterId){
        try {
            return ResponseEntity.ok(service.setSchedule(workDayId,masterId));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
