// Client code
public class Client {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Java Programming", "Shrey Patel");

        // Create some observers
        Student student1 = new Student("Diya");
        Student student2 = new Student("Aarti");
        Teacher teacher1 = new Teacher("Sakshi");
        Teacher teacher2 = new Teacher("Taniya");

        // Register the observers with the course
        course.registerObserver(student1);
        course.registerObserver(student2);
        course.registerObserver(teacher1);
        course.registerObserver(teacher2);

        // Update the course and notify the observers
        course.setName("Object-Oriented Programming");
        course.setTeacher("D C Patel");
    }
}
