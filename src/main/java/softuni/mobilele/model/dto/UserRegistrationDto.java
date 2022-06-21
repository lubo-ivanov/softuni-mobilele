package softuni.mobilele.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import softuni.mobilele.model.entity.UserRole;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegistrationDto {

    @NotEmpty(message = "First name should not be empty.")
    @Size(min = 2, max = 20, message = "First name should be between 2 and 20 characters.")
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 20)
    private String lastName;

    @NotEmpty
    @Size(min = 2, max = 20)
    private String username;

    @NotEmpty
    @Size(min = 5)
    private String password;

    private String repeatPassword;

}
