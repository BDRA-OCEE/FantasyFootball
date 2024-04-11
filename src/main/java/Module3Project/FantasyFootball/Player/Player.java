package Module3Project.FantasyFootball.Player;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Size(min = 3, max = 60)
    private String name;
    @Min(10000)
    @Max(10000000)
    private double price;
    @Size(min = 5, max = 30)
    private String sportsTeam;
    @Enumerated(EnumType.STRING)
    private PlayerRole playerRole;


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sportsTeam='" + sportsTeam + '\'' +
                ", playerRole=" + playerRole +
                '}';
    }
}
