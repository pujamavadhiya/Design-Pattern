// Concrete Observer class 2
public class Teacher implements CourseObserver {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(CourseSubject subject) {
        System.out.println("Teacher " + name + " received notification: " + subject);
    }
}
