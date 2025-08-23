
public class player {
    private String fullName;
    private String currentLevel;
    private String courseOfStudy;
    private String position;

    public player(String fullName, String currentLevel, String courseOfStudy, String position) {
        this.fullName = fullName;
        this.currentLevel = currentLevel;
        this.courseOfStudy = courseOfStudy;
        this.position = position;
    }

    // Getters and setters

    public String getFullName() {
        return fullName;
    }

}
