public class Courses implements Department{
    Department DeptAdapter;

    @Override
    public void dept(String courseType, String fileName) {
        if(courseType.equalsIgnoreCase("bsc")){
            System.out.println("B.Sc: Course Name " + fileName);
        }
        else if (courseType.equalsIgnoreCase("be") || courseType.equalsIgnoreCase("btech")){
            DeptAdapter = new DeptAdapter(courseType);
            DeptAdapter.dept(courseType, fileName);
        }
        else{
            System.out.println("Invalid department: " + courseType+ " course not found: "+fileName);
        }
    }
}
