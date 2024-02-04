import java.util.ArrayList;

public class Department {
    String name;
    Employee boss;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }
    public void addEmployeeToList(Employee e){
        if(e.department.name.equals(this.name)) employees.add(e);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
