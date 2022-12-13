package kg.megacom.SalonProject.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.SalonProject.configs.Swagger2config;
import kg.megacom.SalonProject.models.dto.MasterDto;
import kg.megacom.SalonProject.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/master")
@Api(tags = Swagger2config.Master)
public class MasterController {
    @Autowired
    MasterService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение мастера")
    public ResponseEntity<?> save(@RequestBody MasterDto masterDto){
        try {
            return ResponseEntity.ok(service.save(masterDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/get/by/salon")
    @ApiOperation("Получение информации мастера и салона")
    public ResponseEntity<?> save(@RequestParam(name = "salonId") Long id){
        try {
            return ResponseEntity.ok(service.findBySalon(id));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
