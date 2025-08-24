
public class Player {
    private String fullName;
    private String currentLevel;
    private String courseOfStudy;
    private String position;

    public Player(String fullName, String currentLevel, String courseOfStudy, String position) {
        this.fullName = fullName;
        this.currentLevel = currentLevel;
        this.courseOfStudy = courseOfStudy;
        this.position = position;
    }

    // Getters and setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return fullName + "(" + position + "," + courseOfStudy + "," + currentLevel + ")";
    }
}
