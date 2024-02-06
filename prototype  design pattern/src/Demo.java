public class Demo {
    public static void main(String[] args)throws CloneNotSupportedException {
        Department dept= new Department();
        dept.setdeptName("CSE");
        dept.loadData();
        System.out.println(dept);

        Department dept1= (Department) dept.clone();
        dept1.setdeptName("ICT");
        dept1.loadData();
        System.out.println(dept1);

        System.out.println(dept);
        System.out.println(dept1);
    }
}
