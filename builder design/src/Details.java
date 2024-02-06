
public class Details {
    private String Name;
    private String Dept;
    private String City;
    private String State;
    private String Gender;
    private String Sem;

    public Details(String name, String dept, String city, String state, String gender, String sem) {
        super();
        Name = name;
        Dept = dept;
        City = city;
        State = state;
        Gender = gender;
        Sem = sem;
    }
    @Override
    public String toString() {
        return "Details [Name= " + Name + " Dept= " + Dept + " City= " + City + " State= "
                + State + " Gender=" + Gender + " Sem=" + Sem +"]";
    }
}
