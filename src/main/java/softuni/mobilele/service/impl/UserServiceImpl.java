package softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import softuni.mobilele.model.dto.UserRegistrationDto;
import softuni.mobilele.model.entity.User;
import softuni.mobilele.repository.UserRepository;
import softuni.mobilele.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private CurrentUser currentUser;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           ModelMapper modelMapper, PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }

    @Override
    public void registerAndLogin(UserRegistrationDto userRegistrationDto) {
        User user = modelMapper.map(userRegistrationDto, User.class);
        user.setPassword(passwordEncoder.encode(userRegistrationDto.getPassword()));
        this.userRepository.save(user);
        login(user);
    }
    private void login(User user) {
        currentUser.
                setLoggedIn(true).
                setName(user.getFirstName() + " " + user.getLastName()).
                setEmail(user.getUsername());
    }
}
