package kg.megacom.SalonProject.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.SalonProject.configs.Swagger2config;
import kg.megacom.SalonProject.models.dto.MasterDto;
import kg.megacom.SalonProject.models.dto.SalonDto;
import kg.megacom.SalonProject.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/salon")
@Api(tags = Swagger2config.Salon)
public class SalonController {
    @Autowired
    SalonService service;
    @PostMapping("/save")
    @ApiOperation("Сохранение салона")
    public ResponseEntity<?> save(SalonDto salonDto){
        try {
            return ResponseEntity.ok(service.save(salonDto));
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
    @GetMapping("/get/all")
    @ApiOperation("Вывод всех салонов")
    public ResponseEntity<?>getAll(){
        try {
            return ResponseEntity.ok(service.findAll());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
