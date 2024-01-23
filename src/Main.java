import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Name name1 = new Name("Петров", null, null);
        Name name2 = new Name("Козлов", null, null);
        Name name3 = new Name("Сидоров", null, null);
        Department dep = new Department("IT");
        Employee ep1 = new Employee(name1, dep);
        Employee ep2 = new Employee(name2, dep);
        Employee ep3 = new Employee(name3, dep);
        dep.boss = ep2;
        System.out.println(ep1);
        System.out.println(ep2);
        System.out.println(ep3);
    }
}