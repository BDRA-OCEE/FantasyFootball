package Module3Project.FantasyFootball.Auth_User;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity getUserByUsername(String username);

    UserEntity getUserByEmail(String username);

    Optional<UserEntity> findByName(String username);

    Optional<UserEntity> findByEmail(String email);
}
