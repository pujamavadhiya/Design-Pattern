// Context class
public class Student {
    private StudentState state;

    public Student() {
        state = new EnrolledState(this);
    }

    public void setState(StudentState state) {
        this.state = state;
    }

    public void registerCourse() {
        state.registerCourse();
    }

    public void dropCourse() {
        state.dropCourse();
    }

    public void applyForGraduation() {
        state.applyForGraduation();
    }
}