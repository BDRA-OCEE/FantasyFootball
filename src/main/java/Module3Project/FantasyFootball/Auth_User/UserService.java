package Module3Project.FantasyFootball.Auth_User;

import Module3Project.FantasyFootball.Auth_User.Role.RoleRepository;
import Module3Project.FantasyFootball.Util.ConfirmDTOField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.Optional;

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

    public String submit(UserDTO userDTO, BindingResult bindingResult, Model model) {
        Optional<UserEntity> optionalUserEntityNameCheck = userRepository.findByUsername(userDTO.getUsername());
        Optional<UserEntity> optionalUserEntityEmailCheck = userRepository.findByEmail(userDTO.getEmail());

        if (bindingResult.hasErrors()){
            return "auth/UserRegister";
        }
        if (!ConfirmDTOField.confirmDTOField(userDTO.getPassword(), userDTO.getConfirmPassword())){
            model.addAttribute("passwordDoesNotMatch", "Password does not match!");
            return "auth/UserRegister";
        }
        if (!ConfirmDTOField.confirmDTOField(userDTO.getEmail(), userDTO.getConfirmEmail())){
            model.addAttribute("emailDoesNotMatch", "Email does not match!");
            return "auth/UserRegister";
        }
        if (optionalUserEntityNameCheck.isPresent()){
            model.addAttribute("not_unique_name", "Username already exists!");
            return "auth/UserRegister";
        }
        if (optionalUserEntityEmailCheck.isPresent()){
            model.addAttribute("not_unique_email", "Email already exists!");
            return "auth/UserRegister";
        }

        UserEntity userEntity = userMapper.toEntity(userDTO);
        userRepository.save(userEntity);
        return "auth/UserSubmit";
    }
}
