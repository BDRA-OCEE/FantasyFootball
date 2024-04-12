package Module3Project.FantasyFootball.Player;

import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public Player toEntity(PlayerDTO playerDTO){
        Player player = new Player();
        player.setName(playerDTO.getName());
        player.setFirstName(playerDTO.getFirstName());
        player.setLastName(playerDTO.getLastName());
        player.setNationality(playerDTO.getNationality());
        player.setAge(playerDTO.getAge());
        player.setHeight(playerDTO.getHeight());
        player.setWeight(playerDTO.getWeight());
        player.setInjured(playerDTO.isInjured());

        return player;
    }
}
