package week3;
import java.util.*;
public class Course {
    private final String name;
    private final String description;
    private final int credits;
    private final List<String> prerequisites;
    public Course(String name, String description, int credits) {
        this(name, description, credits, new ArrayList<>());
    }
    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = new ArrayList<>(prerequisites);
    }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getCredits() { return credits; }
    public List<String> getPrerequisites() { return new ArrayList<>(prerequisites); }
    public String toString() {
        return "Course{name='" + name + "', credits=" + credits +
                ", description='" + description + "', prerequisites=" +
                (prerequisites.isEmpty() ? "None" : prerequisites) + "}";
    }
}
