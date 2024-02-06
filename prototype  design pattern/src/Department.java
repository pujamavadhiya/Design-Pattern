import java.util.ArrayList;
import java.util.List;
public class Department implements Cloneable{
    private String deptName;
    List<Student> departments= new ArrayList< >();
    public String getdeptName() {
        return deptName;
    }
    public void setdeptName(String deptName) {
        this.deptName= deptName;
    }
    public List<Student> getdepartments() {
        return departments;
    }
    public void setStudents(List<Student> departments) {
        this.departments= departments;
    }public void loadData(){
        for(int i=1; i<=10; i++){
            Student b= new Student();
            b.setBid(i);
            b.setsname("departments "+i);
            getdepartments().add(b);
        }}
    @Override
    public String toString() {
        return "Department [deptName="+ deptName+ ", departments="+ departments+ "]";
    }
@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();}
}