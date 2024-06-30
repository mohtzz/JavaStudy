import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, Integer...marks) {
        this.name = name;
        if(marks != null) {
            for (int i = 0; i < marks.length; i++) {
                if(marks[i] >= 2 && marks[i] <= 5) this.marks.add(marks[i]);
            }
        }
    }
    public double avgMark(){
       double bank = 0;
       int i;
       if(this.marks.isEmpty()) return 0;
       for(i = 0; i < this.marks.size(); i++){
           bank += this.marks.get(i);
       }
       return bank / i;
    }
    public boolean isGreat(){
        if(!this.marks.isEmpty()){
            for(int i = 0; i < this.marks.size(); i++){
                if(this.marks.get(i) != 5) return false;
            }
            return true;
        }
        else return false;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}
