import java.util.*;

interface UniversityData {
    void accessData();
}

class UniversityDataImpl implements UniversityData {
    public void accessData() {
        System.out.println("Accessing university data...");
    }
}

class UniversityDataProxy implements UniversityData {
    private String username;
    private String password;
    private UniversityDataImpl data;


    public UniversityDataProxy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*public void accessData() {
        if (username.equals("admin") && password.equals("admin123")) {
            if (data == null) {
                data = new UniversityDataImpl();
            }
            data.accessData();
        } else {
            System.out.println("Access denied.");
        }
    }
}*/
    public void accessData() {
        if (username.equals("admin") && password.equals("admin123")) {
            if (data == null) {
                data = new UniversityDataImpl();
            }
            data.accessData();
        } else {
            System.out.println("Access denied.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UniversityData data = new UniversityDataProxy("admin", "admin123");
        data.accessData();
    }
}
