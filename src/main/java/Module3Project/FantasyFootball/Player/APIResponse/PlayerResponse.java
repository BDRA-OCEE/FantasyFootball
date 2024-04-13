package Module3Project.FantasyFootball.Player.APIResponse;

import Module3Project.FantasyFootball.Player.Player;
import Module3Project.FantasyFootball.Player.PlayerDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerResponse {
     PlayerDTO playerDTO;
}
