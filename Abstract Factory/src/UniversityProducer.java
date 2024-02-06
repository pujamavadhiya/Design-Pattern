public class UniversityProducer {
    public static AbstractUniversity getUniversity(String choice){
        if(choice.equalsIgnoreCase("Student"))
        {
            return new StudentDetails();
        }
        else if (choice.equalsIgnoreCase("Faculty"))
        {
            return new FacultyDetails();
        }
        return null;
    }
}
