import javax.lang.model.element.Name;

public class StudentDetails extends AbstractUniversity{
    public Student getStudent(String studentdetail)
    {
        if (studentdetail == null){
            return null;
        }
        if (studentdetail.equalsIgnoreCase("Name")){
            return  new SName();
        }
        else if (studentdetail.equalsIgnoreCase("Department")) {
            return new SDept();
        }
        else if  (studentdetail.equalsIgnoreCase("Gender")){
            return new SGender();
        }
        return null;
    }
    Faculty getFaculty(String faculty){
        return null;
    }
}
