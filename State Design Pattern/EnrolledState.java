
// Concrete state classes
public class EnrolledState implements StudentState {
    private Student student;

    public EnrolledState(Student student) {
        this.student = student;
    }

    @Override
    public void registerCourse() {
        System.out.println("Course registration successful");
    }

    @Override
    public void dropCourse() {
        System.out.println("Course dropped");
    }

    @Override
    public void applyForGraduation() {
        System.out.println("You must complete all required courses before applying for graduation");
    }
}

