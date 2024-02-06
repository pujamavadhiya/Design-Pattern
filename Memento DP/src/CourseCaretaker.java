// Caretaker class
import java.util.ArrayList;
import java.util.List;

public class CourseCaretaker {
    private final List<CourseMemento> mementos = new ArrayList<>();

    public void addMemento(CourseMemento memento) {
        mementos.add(memento);
    }

    public CourseMemento getMemento(int index) {
        return mementos.get(index);
    }
}