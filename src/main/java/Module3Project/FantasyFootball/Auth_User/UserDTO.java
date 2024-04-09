package Module3Project.FantasyFootball.Auth_User;

import jakarta.validation.constraints.Size;
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
public class UserDTO {
    @Size(min = 4, max = 32)
    private String username;
    @Size(min = 4, max = 64)
    private String password;
    @Size(min = 4, max = 64)
    private String confirmPassword;
    @Size(min = 4, max = 64)
    private String email;
    @Size(min = 4, max = 64)
    private String confirmEmail;
    @Size(min = 4, max = 32)
    private String displayName;

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", email='" + email + '\'' +
                ", confirmEmail='" + confirmEmail + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }

}
