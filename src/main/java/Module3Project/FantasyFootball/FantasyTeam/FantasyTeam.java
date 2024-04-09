package Module3Project.FantasyFootball.FantasyTeam;

import jakarta.persistence.*;

@Entity
@Table(name = "fantasy_team")
public class FantasyTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
