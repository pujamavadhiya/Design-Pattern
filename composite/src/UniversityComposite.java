import java.util.*;
interface department{
    public void showdetails();  }
class faculty implements department
{
    int id;
    String name;
    faculty(int id, String name)
    {
        this.name = name;
        this.id = id;
    }
    public void showdetails()
    {
        System.out.println("Leaf ->" +id+ "-" +name);
    }
}
class student implements department
{
    int rno;
    String name;
    student(int rno, String name)
    {
        this.rno = rno;
        this.name = name;
    }
    public void showdetails()
    {
        System.out.println("Leaf ->" +rno+ "-" +name);
    }
}
class composite implements department
{    private List<department> departmentlist = new ArrayList<department>();
    String name=null;
    composite(String name)
    {	this.name=name;
    }
    public void showdetails()
    {	System.out.println("root->"+name);
        for(department dept:departmentlist)
        {
            dept.showdetails();
        }
    }
    public void adddept(department dept)
    {
        departmentlist.add(dept);
    }

    public void removedept(department dept)
    {
        departmentlist.remove(dept);
    }
}
public class UniversityComposite
{
    public static void main(String args[])
    {
        faculty f1 = new faculty(101,"Puja Patel");
        faculty f2 = new faculty(201,"Shruti Shah");
        faculty f3 = new faculty(301,"Kiya Gandhi");
        composite cob1 = new composite("Faculty");
        cob1.adddept(f1);
        cob1.adddept(f2);
        cob1.adddept(f3);

        student s1 = new student(454,"Diya Patel");
        student s2 = new student(123,"Dhara Modi");
        composite cob2 = new composite("student");
        cob2.adddept(s1);
        cob2.adddept(s2);
        cob1.adddept(cob2);
        cob1.showdetails();
    }
}
