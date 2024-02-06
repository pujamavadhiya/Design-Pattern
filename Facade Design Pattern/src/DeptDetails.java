public class DeptDetails{
    private Department cse;
    private Department chem;
    private Department ele;
    public DeptDetails(){
        cse = new CSE();
        chem = new Chemical();
        ele = new Electrical();
    }
    public void cseinfo(){
        cse.deptname();
    }
    public void cheminfo()
    {  chem.deptname();
    }
    public void eleinfo()
    {    ele.deptname();
    }
}
