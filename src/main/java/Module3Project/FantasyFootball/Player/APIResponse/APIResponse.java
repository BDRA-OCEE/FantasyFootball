package Module3Project.FantasyFootball.Player.APIResponse;

import Module3Project.FantasyFootball.Player.Player;
import Module3Project.FantasyFootball.Player.PlayerDTO;
import Module3Project.FantasyFootball.Player.PlayerDTONotEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIResponse {
    private String get;
    private String results;
    private String[] error;
    private PlayerDTONotEntity[] response;

}