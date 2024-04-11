package Module3Project.FantasyFootball.FootballApi.TestApis;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class RandomFunFactDTO {
    private String id;
    private String text;
    private String source;
    private String sourceUrl;
    private String language;
    private String permalink;
}
