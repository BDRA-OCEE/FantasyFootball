package Module3Project.FantasyFootball.FootballApi;

import Module3Project.FantasyFootball.FootballApi.TestApis.FootballApiSportsService;
import Module3Project.FantasyFootball.FootballApi.TestApis.FootballRapidApiService;
import Module3Project.FantasyFootball.Player.PlayerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/api")
public class FootballApiController {

    private FootballRapidApiService footballRapidApiService;
    private FootballApiSportsService apiSportsService;

    public FootballApiController(FootballRapidApiService footballRapidApiService) {
        this.footballRapidApiService = footballRapidApiService;
    }

    @GetMapping("/api/football")
    public String getPlayersFromApi() {
        String url = "https://v3.football.api-sports.io/players?season=2018&league=61";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }


    @GetMapping("/api/token")
    public String getApiToken() {
        String url = "https://v3.football.api-sports.io/status";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }

    /*@GetMapping("/api/rapidapi")
    public PlayerDTO getRapidApi() {
        return footballRapidApiService.getAllPlayersRapidApi();
    }*/

    @GetMapping("/api/api-sports")
    public PlayerDTO getApiSports() {
        return apiSportsService.getAllPlayersApiSports();
    }




}
