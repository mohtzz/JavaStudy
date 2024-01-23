import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    ArrayList<Integer> marks;

    public Student(String name, ArrayList<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}
