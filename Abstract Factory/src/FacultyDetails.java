import javax.lang.model.element.Name;
public class FacultyDetails extends AbstractUniversity{
    public Faculty getFaculty(String facultydetail)
    {
        if (facultydetail == null){
            return null;
        }
        if (facultydetail.equalsIgnoreCase("Name")){
            return  new FName();
        }
        else if (facultydetail.equalsIgnoreCase("Department")) {
            return new FDept();
        }
        else if (facultydetail.equalsIgnoreCase("Gender")){
            return new FGender();
        }
        return null;
    }
    Faculty getFaculty(String faculty){
        return null;
    }
}

