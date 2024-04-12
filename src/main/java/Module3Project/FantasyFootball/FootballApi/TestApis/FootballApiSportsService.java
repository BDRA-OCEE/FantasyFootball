package Module3Project.FantasyFootball.FootballApi.TestApis;

import Module3Project.FantasyFootball.Player.Player;
import Module3Project.FantasyFootball.Player.PlayerDTO;
import Module3Project.FantasyFootball.Player.PlayerMapper;
import Module3Project.FantasyFootball.Player.PlayerRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FootballApiSportsService {

    public static final String apiSportsUrl = "https://v3.football.api-sports.io/players?league=5&season=2020";
    public static final String apiSportsKey = "eb641cfe432da0486fd17b785543f13c";
    public static final String apiSportsHost = "v3.football.api-sports.io";

    private PlayerRepository playerRepository;
    private PlayerMapper playerMapper;

    public FootballApiSportsService(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public PlayerDTO getAllPlayersApiSports() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", apiSportsKey);
            httpHeaders.set("x-rapidapi-host", apiSportsHost);

        } catch (Exception e){

        }

        RestTemplate restTemplate = new RestTemplate();
        PlayerDTO playerDTO = restTemplate.getForObject(apiSportsUrl, PlayerDTO.class);

        Player player = playerMapper.toEntity(playerDTO);
        playerRepository.save(player);

        return playerDTO;
    }
}
