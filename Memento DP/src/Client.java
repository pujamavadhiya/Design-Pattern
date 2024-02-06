// Client code
public class Client {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Java Programming", 3, "Priya Shah");
        System.out.println(course);

        // Save the state of the course
        CourseMemento memento = course.save();

        // Update the course
        course.setName("Operating System");
        course.setCredit(4);
        course.setTeacher("Shrey Patel");
        System.out.println(course);

        // Restore the previous state of the course
        course.restore(memento);
        System.out.println(course);
    }
}