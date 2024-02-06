// Memento class
public class CourseMemento {
    private final String name;
    private final int credit;
    private final String teacher;

    public CourseMemento(String name, int credit, String teacher) {
        this.name = name;
        this.credit = credit;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getTeacher() {
        return teacher;
    }
}