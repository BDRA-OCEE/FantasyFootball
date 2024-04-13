package Module3Project.FantasyFootball.Player.APIResponse;

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
    private List<PlayerResponse> response;

}