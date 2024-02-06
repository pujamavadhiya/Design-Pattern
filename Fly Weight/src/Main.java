public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();

        CourseFlyweight course1 = factory.getCourse("Java Programming", 3, "Shreya Vyas");
        course1.displayCourseInfo();

        CourseFlyweight course2 = factory.getCourse("Java Programming", 3, "Dhyana Patel");
        course2.displayCourseInfo();

        CourseFlyweight course3 = factory.getCourse("Database Management", 4, "Sonakshi Bhatt");
        course3.displayCourseInfo();

        CourseFlyweight course4 = factory.getCourse("Database Management", 4, "Lisa Das");
        course4.displayCourseInfo();
    }
}
