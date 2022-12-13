package kg.megacom.SalonProject.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.SalonProject.configs.Swagger2config;
import kg.megacom.SalonProject.models.dto.UserDto;
import kg.megacom.SalonProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@Api(tags = Swagger2config.User)
public class UserController {
    @Autowired
    UserService service;
    @PostMapping("/save")
    @ApiOperation("Сохранение клиента")
    public ResponseEntity<?> save(UserDto userDto){
        try {
            return ResponseEntity.ok(service.save(userDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
