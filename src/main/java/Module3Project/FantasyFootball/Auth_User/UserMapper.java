package Module3Project.FantasyFootball.Auth_User;

import Module3Project.FantasyFootball.Auth_User.Role.Role;
import Module3Project.FantasyFootball.Auth_User.Role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class UserMapper {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserEntity toEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setDisplayName(userDTO.getDisplayName());
        userEntity.setEnabled(true);

        Role role = roleRepository.findByName("USER");
        userEntity.setRole(Arrays.asList(role));

        return userEntity;
    }
}
