package Module3Project.FantasyFootball.FootballApi;

import Module3Project.FantasyFootball.FootballApi.TestApis.RandomFunFactDTO;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/api")
public class FootballApiController {
    @GetMapping("/api/football")
    public String getPlayersFromApi() {
        String url = "https://v3.football.api-sports.io/players?season=2018&league=61";
        RestTemplate restTemplate = new RestTemplate();
        String result =restTemplate.getForObject(url, String.class);

        return result;
    }


    @GetMapping("/api/token")
    public String getApiToken() {
        String url = "https://v3.football.api-sports.io/status";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }


}
