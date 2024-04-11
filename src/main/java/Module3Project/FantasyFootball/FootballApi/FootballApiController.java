/*
package Module3Project.FantasyFootball.FootballApi;

import Module3Project.FantasyFootball.FootballApi.TestApis.RandomFunFactDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/api")
public class FootballApiController {
    @GetMapping("/api/football")
    public String getRandomFunFact() {
        String url = "https://uselessfacts.jsph.pl/api/v2/facts/random";
        RestTemplate restTemplate = new RestTemplate();
        RandomFunFactDTO randomFunFactDTO = restTemplate.getForObject(url, RandomFunFactDTO.class);

        return randomFunFactDTO.getId() + " " + randomFunFactDTO.getText();
    }

}
*/
