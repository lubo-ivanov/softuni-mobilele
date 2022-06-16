package softuni.mobilele.service.impl;

import org.springframework.stereotype.Service;
import softuni.mobilele.repository.UserRoleRepository;
import softuni.mobilele.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }
}
