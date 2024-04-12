package Module3Project.FantasyFootball.FootballApi.TestApis;


import Module3Project.FantasyFootball.Player.PlayerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FootballRapidApiService {

    public static final String url = "https://api-football-v1.p.rapidapi.com/v3/players?season=2020";
    public static final String xRapidApiKey = "b359f4063bmsh38554c02fbeb297p1f107fjsnd6b73b979729";
    public static final String xRapidApiHost = "api-football-v1.p.rapidapi.com";



    public PlayerDTO getAllPlayersRapidApi() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("X-RapidAPI-Key", xRapidApiKey);
            httpHeaders.set("X-RapidAPI-Host", xRapidApiHost);

        } catch (Exception e){

        }
        RestTemplate restTemplate = new RestTemplate();
        PlayerDTO playerDTO = restTemplate.getForObject(url, PlayerDTO.class);

        return playerDTO;
    }






/*    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://api-football-v1.p.rapidapi.com/v3/players?season=2020")
            .get()
            .addHeader("X-RapidAPI-Key", "b359f4063bmsh38554c02fbeb297p1f107fjsnd6b73b979729")
            .addHeader("X-RapidAPI-Host", "api-football-v1.p.rapidapi.com")
            .build();

    Response response = client.newCall(request).execute();*/



    /*    HttpClient httpClient = HttpClient.create()
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
            .responseTimeout(Duration.ofMillis(5000))
            .doOnConnected(conn ->
                    conn.addHandlerLast(new ReadTimeoutHandler(1))
                            .addHandlerLast(new WriteTimeoutHandler(1)));

    WebClient webClient = WebClient.builder()
            .clientConnector(new ReactorClientHttpConnector(httpClient))
            .build();*/
}

