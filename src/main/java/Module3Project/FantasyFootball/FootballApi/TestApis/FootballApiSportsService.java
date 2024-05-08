package Module3Project.FantasyFootball.FootballApi.TestApis;

import Module3Project.FantasyFootball.Player.*;
import Module3Project.FantasyFootball.Player.APIResponse.APIResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
public class FootballApiSportsService {

    public static final String API_SPORTS_URL = "https://v3.football.api-sports.io/players?league=5&season=2020";
    public static final String API_SPORTS_KEY = "eb641cfe432da0486fd17b785543f13c";
    public static final String API_SPORTS_HOST = "v3.football.api-sports.io";

    private PlayerRepository playerRepository;
    private PlayerMapper playerMapper;

    private PlayerDTORepository playerDTORepository;

    @Autowired
    private RestTemplate restTemplate;

    public FootballApiSportsService(PlayerRepository playerRepository, PlayerMapper playerMapper, PlayerDTORepository playerDTORepository, RestTemplate restTemplate) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
        this.playerDTORepository = playerDTORepository;
        this.restTemplate = restTemplate;
    }

    public PlayersListDTO getAllPlayersApiSports() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", API_SPORTS_KEY);
            httpHeaders.set("x-rapidapi-host", API_SPORTS_HOST);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<PlayersListDTO> playerDTOResponseEntity = restTemplate.exchange(API_SPORTS_URL, HttpMethod.GET, new HttpEntity<>(httpHeaders), PlayersListDTO.class);
            //ResponseEntity<APIResponse> apiResponseResponseEntity = restTemplate.exchange(apiSportsUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), APIResponse.class);

            /*RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.exchange(apiSportsUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            APIResponse apiResponse = objectMapper.readValue(responseEntity.getBody(), APIResponse.class);

            List<PlayerResponse> playerResponses = apiResponse.getResponse();
            for (PlayerResponse playerResponse : playerResponses) {
                PlayerDTO playerDTO = playerResponse.getPlayerDTO();
            }*/

            return playerDTOResponseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    public Object getAllPlayersApiSportsTest() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", API_SPORTS_KEY);
            httpHeaders.set("x-rapidapi-host", API_SPORTS_HOST);


            //RestTemplate restTemplate = new RestTemplate();
            //ResponseEntity<PlayersListDTO> playerDTOResponseEntity = restTemplate.exchange(apiSportsUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), PlayersListDTO.class);
            //ResponseEntity<APIResponse> apiResponseResponseEntity = restTemplate.exchange(apiSportsUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), APIResponse.class);


            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.exchange(API_SPORTS_URL, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            APIResponse apiResponse = objectMapper.readValue(responseEntity.getBody(), APIResponse.class);

            /*List<PlayerResponse> playerResponses = apiResponse.getResponse();
            for (PlayerResponse playerResponse : playerResponses) {
                PlayerDTO playerDTO = playerResponse.getPlayerDTO();
            }*/

            return apiResponse;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public ResponseEntity getAllPlayersApiSportsTest2() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", API_SPORTS_KEY);
            httpHeaders.set("x-rapidapi-host", API_SPORTS_HOST);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> stringResponseEntity = restTemplate.exchange(API_SPORTS_URL, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);

            ObjectMapper objectMapper = new ObjectMapper();
            APIResponse apiResponse = objectMapper.readValue(stringResponseEntity.getBody(), APIResponse.class);

/*            List<PlayerResponse> playerResponses = apiResponse.getResponse();
            for (PlayerResponse playerResponse : playerResponses) {
                PlayerDTO playerDTO = playerResponse.getPlayerDTO();
                //playerDTO.setName(playerResponse.getPlayerDTO().getName());
                //String name = playerResponse.getPlayerDTO().getName();
            }*/

            return stringResponseEntity;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<PlayerDTO> getAllPlayersCMDLineMain() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", API_SPORTS_KEY);
            httpHeaders.set("x-rapidapi-host", API_SPORTS_HOST);

            //RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<List<PlayerDTO>> listResponseEntity = restTemplate
                    .exchange(API_SPORTS_URL, HttpMethod.GET, new HttpEntity<>(httpHeaders),
                            new ParameterizedTypeReference<List<PlayerDTO>>() {
                            });

            return listResponseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public void parseJsonAndExtractPlayers(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        JsonNode get = rootNode.path("get");
        JsonNode response = rootNode.path("response");

        if (response.isArray()) {
            for (JsonNode resNode : response) {
                JsonNode players = resNode.path("players");
                if (players.isObject()) {
                    JsonNode player = players.path("player");
                    // Process your player data here...
                    System.out.println(player);
                }
            }
        }
    }

    public ResponseEntity getAllPlayersApiSportsTest3() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", API_SPORTS_KEY);
            httpHeaders.set("x-rapidapi-host", API_SPORTS_HOST);

            ResponseEntity<String> responseEntity = restTemplate.exchange(API_SPORTS_URL, HttpMethod.GET, new HttpEntity<>(httpHeaders), new ParameterizedTypeReference<String>() {
            });

            ObjectMapper objectMapper = new ObjectMapper();
            APIResponse apiResponse = objectMapper.readValue(responseEntity.getBody(), APIResponse.class);

            return responseEntity;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


}
