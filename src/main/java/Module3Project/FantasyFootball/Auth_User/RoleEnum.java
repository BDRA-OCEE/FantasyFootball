package Module3Project.FantasyFootball.Auth_User;

public enum RoleEnum {

    //POTENTIALLY UNWANTED
    //CURRENTLY UNUSED


    ADMIN("Admin"),
    USER("User");
    private String label;

    RoleEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
