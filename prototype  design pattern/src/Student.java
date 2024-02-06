public class Student {
    private int sid;
    private String sname;
    public int getSid() {
        return sid;
    }public void setBid(int did) {
        this.sid = did;
    }public String getsname() {
        return sname;
    }public void setsname(String sname) {
    }
    @Override
    public String toString() {
        return "Student [bid="+ sid+ ", bname="+ sname+ "]";
    }
}
