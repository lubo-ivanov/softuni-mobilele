package softuni.mobilele.service.impl;

import org.springframework.stereotype.Service;
import softuni.mobilele.model.dto.UserRegistrationDto;
import softuni.mobilele.repository.UserRepository;
import softuni.mobilele.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerAndLogin(UserRegistrationDto userRegistrationDto) {
        //TODO implement method
    }
}
