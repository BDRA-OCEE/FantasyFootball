package Module3Project.FantasyFootball.Player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class PlayerDTO {

    private String name;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private String height;
    private String weight;
    private boolean injured;

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", injured=" + injured +
                '}';
    }
}
