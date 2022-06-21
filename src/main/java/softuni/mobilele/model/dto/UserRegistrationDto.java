package softuni.mobilele.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import softuni.mobilele.model.entity.UserRole;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private UserRole role;

    //TODO construct the DTO
}
