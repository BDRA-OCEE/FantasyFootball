package Module3Project.FantasyFootball.FootballApi.TestApis;


import Module3Project.FantasyFootball.Player.PlayerDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FootballApiControllerTest {
    private static final String API_KEY = "eb641cfe432da0486fd17b785543f13c";
    private static final String API_HOST = "v3.football.api-sports.io";

    @GetMapping("/players")
    public ResponseEntity<PlayerDTO> getAllPlayersApiSportsTest3() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", API_KEY);
            httpHeaders.set("x-rapidapi-host", API_HOST);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<PlayerDTO> responseEntity = restTemplate.exchange(
                    "https://v3.football.api-sports.io/players?league=5&season=2020",
                    HttpMethod.GET,
                    new HttpEntity<>(httpHeaders),
                    PlayerDTO.class);

            return responseEntity;
        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
