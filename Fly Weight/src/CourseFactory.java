import java.util.HashMap;
import java.util.Map;

public class CourseFactory {
    private Map<String, CourseFlyweight> coursePool;
    public CourseFactory() {

        coursePool = new HashMap<>();
    }
    public CourseFlyweight getCourse(String courseName, int credits, String instructor) {
        String key = courseName + credits + instructor;
        CourseFlyweight course = coursePool.get(key);

        if (course == null) {
            course = new Course(courseName, credits, instructor);
            coursePool.put(key, course);
        }

        return course;
    }
}
