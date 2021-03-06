package softuni.mobilele.service;

import softuni.mobilele.model.dto.UserLoginDTO;
import softuni.mobilele.model.dto.UserRegistrationDto;

public interface UserService {
    void registerAndLogin(UserRegistrationDto userRegistrationDto);

    void logout();

    boolean login(UserLoginDTO userLoginDTO);
}
