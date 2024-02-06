public class AbstractUniversityPatternTest {
    public static void main(String[] args) {
        AbstractUniversity sd=UniversityProducer.getUniversity("Student");
        Student student1 = sd.getStudent("SName");
        student1.StudentDetails();
        Student student2 = StudentDetails.getStudent("SDept");
        student2.StudentDetails();
        Student student3 = StudentDetails.getStudent("SGender");
        student3.StudentDetails();


        AbstractUniversity fd=UniversityProducer.getUniversity("Faculty");
        Faculty faculty1 = fd.getFaculty("FName");
        faculty1.FacultyDetails();
        Faculty faculty2 = FacultyDetails.getFaculty("FDept");
        faculty2.FacultyDetails();
        Faculty faculty3 = FacultyDetails.getFaculty("FGender");
        faculty3.FacultyDetails();
    }
}
