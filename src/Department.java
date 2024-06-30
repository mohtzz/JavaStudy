import java.util.ArrayList;
import java.util.Objects;

public class Department {
    String name;
    protected Employee boss;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }

    public void setBoss(Employee boss) {
        if(Objects.equals(this.name, boss.department.name)) this.boss = boss;
        else throw new IllegalArgumentException("wrong department");
    }

    public Employee getBoss() {
        return boss;
    }

    public void addEmployeeToList(Employee e){
        if(e.department.name.equals(this.name)) employees.add(e);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
