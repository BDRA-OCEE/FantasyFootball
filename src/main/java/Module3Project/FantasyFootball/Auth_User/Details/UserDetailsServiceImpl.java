package Module3Project.FantasyFootball.Auth_User.Details;

import Module3Project.FantasyFootball.Auth_User.UserEntity;
import Module3Project.FantasyFootball.Auth_User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.getUserByUsername(username);

        if (userEntity == null) {
            userEntity = userRepository.getUserByEmail(username);
            if (userEntity == null){
                throw new UsernameNotFoundException("Could not find user");
            }
        }

        return new MyUserDetails(userEntity);
    }

}
