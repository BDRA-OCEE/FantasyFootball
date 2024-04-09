package Module3Project.FantasyFootball.Auth_User;

import Module3Project.FantasyFootball.Auth_User.Role.Role;
import Module3Project.FantasyFootball._DeprecatedParts.Auth_UserDpr.RoleEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

import java.util.List;

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
    @Enumerated(EnumType.STRING)
    private RoleEnum roleEnum;
    @Size(min = 4, max = 32)
    private String displayName;

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", email='" + email + '\'' +
                ", role=" + roleEnum +
                ", displayName='" + displayName + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRole() {
        return roleEnum;
    }

    public void setRole(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
