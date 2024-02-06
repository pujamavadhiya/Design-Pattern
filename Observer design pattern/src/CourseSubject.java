public interface CourseSubject {
    void registerObserver(CourseObserver observer);
    void removeObserver(CourseObserver observer);
    void notifyObservers();
}