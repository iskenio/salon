package kg.megacom.SalonProject.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.SalonProject.configs.Swagger2config;
import kg.megacom.SalonProject.models.dto.BookingTimeDto;
import kg.megacom.SalonProject.service.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/book")
@Api(tags = Swagger2config.BookingTime)
public class BookingTimeController {
    @Autowired
    private BookingTimeService service;
    @PostMapping("/save")
    @ApiOperation("Запись на прием")
    public ResponseEntity<?>save(@RequestBody BookingTimeDto bookingTimeDto){
        try {
            return ResponseEntity.ok(service.save(bookingTimeDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
