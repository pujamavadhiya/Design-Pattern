// Originator class
public class Course {
    private String name;
    private int credit;
    private String teacher;

    public Course(String name, int credit, String teacher) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    // Create a memento object to save the current state
    public CourseMemento save() {
        return new CourseMemento(name, credit, teacher);
    }

    // Restore the state from a memento object
    public void restore(CourseMemento memento) {
        this.name = memento.getName();
        this.credit = memento.getCredit();
        this.teacher = memento.getTeacher();
    }

    // Override the toString method to display the current state
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}







