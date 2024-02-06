public class FacultyDetails {
    public static void main(String[] args) {
        FacultyName facultyName = new FacultyName();

        System.out.println("Names of faculty in CSE Dept are: ");

        for(Dept d = facultyName.getdept(); d.hasNext();){
            String name = (String)d.next();
            System.out.println("Name : "+name);
        }
    }
}
