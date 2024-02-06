public class DeptAdapter implements Department{
    Technical TechnicalDepartment;
    public DeptAdapter(String coursetype){
        if(coursetype.equalsIgnoreCase("btech")){
            TechnicalDepartment = new btech();
        } else if (coursetype.equalsIgnoreCase("be")) {
            TechnicalDepartment = new be();
        }
    }
    public void dept(String courseType, String fileName){
        if(courseType.equalsIgnoreCase("btech")){
            TechnicalDepartment.btechcourse(fileName);
        } else if (courseType.equalsIgnoreCase("be")) {
            TechnicalDepartment.becourse(fileName);
        }
    }
}
