package Module3Project.FantasyFootball.Auth_User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User getUserByUsername(String username);

    User getUserByEmail(String username);
}
