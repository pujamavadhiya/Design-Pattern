public class Course implements CourseFlyweight {
    private String courseName;
    private int credits;
    private String instructor;

    public Course(String courseName, int credits, String instructor) {
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + " (" + credits + " credits), Instructor: " + instructor);
    }
}
