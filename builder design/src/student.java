public class student {
    private String Name;
    private String Dept;
    private String City;
    private String State;
    private String Gender;
    private String Sem;

    public student setName(String Name) {
        this.Name = Name;
        return this;
    }
    public student setDept(String Dept) {
        this.Dept = Dept;
        return this;
    }
    public student setCity(String City) {
        this.City = City;
        return this;
    }
    public student setState(String State) {
        this.State = State;
        return this;
    }
    public student setGender(String Gender) {
        this.Gender = Gender;
        return this;
    }
    public student setSem(String Sem) {
        this.Sem = Sem;
        return this;
    }

    public Details getDetails() {
        return new Details(Name,Dept,City,State,Gender,Sem);
    }
}