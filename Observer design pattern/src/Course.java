// Concrete Subject class
import java.util.ArrayList;
import java.util.List;

public class Course implements CourseSubject {
    private String name;
    private String teacher;
    private List<CourseObserver> observers = new ArrayList<>();

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
        notifyObservers();
    }

    @Override
    public void registerObserver(CourseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(CourseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (CourseObserver observer : observers) {
            observer.update(this);
        }
    }
}
