public class Student implements CourseObserver {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public void update(CourseSubject subject) {
        System.out.println("Student " + name + " received notification: " + subject);
    }
}
