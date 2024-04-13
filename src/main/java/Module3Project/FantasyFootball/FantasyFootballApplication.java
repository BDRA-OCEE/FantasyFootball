package Module3Project.FantasyFootball;

import Module3Project.FantasyFootball.FootballApi.TestApis.FootballApiSportsService;
import Module3Project.FantasyFootball.Player.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootApplication
public class FantasyFootballApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(FantasyFootballApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FantasyFootballApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(FootballApiSportsService footballApiSportsService, PlayerRepository playerRepository, PlayerMapper playerMapper, PlayerDTORepository playerDTORepository){
		return args -> {
			List<PlayerDTO> playerDTOList = footballApiSportsService.getAllPlayersCMDLineMain();

			playerDTORepository.saveAll(playerDTOList);
			LOGGER.info("Saved {} players in the database", playerDTOList.size());
		};
	}
}
