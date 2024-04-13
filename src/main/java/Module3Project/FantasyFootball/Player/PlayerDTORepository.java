package Module3Project.FantasyFootball.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerDTORepository extends CrudRepository<PlayerDTO, Long> {
}
