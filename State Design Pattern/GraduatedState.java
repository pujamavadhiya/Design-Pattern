public class GraduatedState implements StudentState {
    private Student student;

    public GraduatedState(Student student) {
        this.student = student;
    }

    @Override
    public void registerCourse() {
        System.out.println("You have already graduated and cannot register for courses");
    }

    @Override
    public void dropCourse() {
        System.out.println("You have already graduated and cannot drop courses");
    }

    @Override
    public void applyForGraduation() {
        System.out.println("You have already graduated");
    }
}