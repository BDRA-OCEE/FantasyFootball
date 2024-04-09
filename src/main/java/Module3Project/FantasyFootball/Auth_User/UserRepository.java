package Module3Project.FantasyFootball.Auth_User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity getUserByUsername(String username);

    UserEntity getUserByEmail(String username);
}
