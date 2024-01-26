import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Department it = new Department("IT");
        Employee petrov = new Employee(new Name("Petrov", null, null), it);
        Employee kozlov = new Employee(new Name("Kozlov", null, null), it);
        Employee sidorov = new Employee(new Name("Sidorov", null, null), it);
        it.boss = kozlov;

//        System.out.println(sidorov.employees);
//        System.out.println(kozlov.employees);

    }
}