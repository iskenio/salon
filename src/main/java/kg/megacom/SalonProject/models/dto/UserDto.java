package kg.megacom.SalonProject.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    Long id;
    String name;
    String login;
    String password;
    String email;
    String phone;
}
