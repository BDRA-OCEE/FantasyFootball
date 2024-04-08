package Module3Project.FantasyFootball.Auth;

public enum Role {
    ADMIN("Admin"),
    USER("User");
    private String label;

    Role(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
