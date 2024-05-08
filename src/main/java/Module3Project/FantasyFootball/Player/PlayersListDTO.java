package Module3Project.FantasyFootball.Player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayersListDTO {
    @JsonProperty("response")
    List<PlayerDTO> playerDTOList;
}
