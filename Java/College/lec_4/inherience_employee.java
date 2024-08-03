package College.lec_4;

class employee {
    int basic_salary;
    String ename;
    static int count;

    public employee() {
        ename = "NA";
        basic_salary = 0;
    }

    public employee(String name, int bs) {
        ename = name;
        basic_salary = bs;
    }

    public employee(employee e) {
        ename = e.ename;
        basic_salary = e.basic_salary;
    }
}

public class inherience_employee {

}
