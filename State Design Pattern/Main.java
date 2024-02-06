public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Register a course while in the enrolled state
        student.registerCourse();

        // Apply for graduation while in the enrolled state
        student.applyForGraduation();

        // Change state to graduated
        student.setState(new GraduatedState(student));

        // Try to register a course while in the graduated state
        student.registerCourse();

        // Apply for graduation while in the graduated state
        student.applyForGraduation();
    }
}
