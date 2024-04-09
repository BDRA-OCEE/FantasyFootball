package Module3Project.FantasyFootball.Auth_User;

import Module3Project.FantasyFootball.Auth_User.Role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired

    public UserService(UserMapper userMapper, UserRepository userRepository, RoleRepository roleRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
}
