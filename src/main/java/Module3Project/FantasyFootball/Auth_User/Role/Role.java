package Module3Project.FantasyFootball.Auth_User.Role;

import Module3Project.FantasyFootball.Auth_User.UserEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(min = 3, max = 32)
    private String name;

    @ManyToMany(mappedBy = "role")
    private List<UserEntity> users = new ArrayList<>();

}
