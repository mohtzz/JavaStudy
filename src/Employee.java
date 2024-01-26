import java.util.ArrayList;

public class Employee {
    Name name;
    Department department;
    ArrayList<Employee> employees = new ArrayList<>();

    public Employee(Name name, Department department){
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        if(this == department.boss){
            return name + "- начальник отдела " + department.name;
        }
        else{
            return name + "работает в отделе " + department.name + " начальник которого " + department.boss.name;
        }
    }
}
