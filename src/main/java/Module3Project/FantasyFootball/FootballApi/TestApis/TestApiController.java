package Module3Project.FantasyFootball.FootballApi.TestApis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestApiController {

    @GetMapping("/api/fun-fact")
    public String getRandomFunFact() {
        String url = "https://uselessfacts.jsph.pl/api/v2/facts/random";
        RestTemplate restTemplate = new RestTemplate();
        RandomFunFactDTO randomFunFactDTO = restTemplate.getForObject(url, RandomFunFactDTO.class);

        return randomFunFactDTO.getId() + " " + randomFunFactDTO.getText();
    }

}
