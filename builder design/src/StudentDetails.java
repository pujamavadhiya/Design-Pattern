public class StudentDetails {
    public static void main (String[]args) {
        Details s1 = new student().setName("Nitya").setDept("CSE").
                setCity("Ahmedabad").setState("Gujarat").
                setGender("Female").setSem("3").getDetails();
        System.out.println(s1);
        Details s2 = new student().setName("Priyanshi").setDept("CSE").
                setCity("Ahmedabad").setState("Gujarat").
                setGender("Female").setSem("1").getDetails();
        System.out.println(s2);
    }
}
