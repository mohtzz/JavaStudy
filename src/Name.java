public class Name {
    String surname;
    String name;
    String patronymic;

    public Name(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public Name(String name){
        this.name = name;
    }
    public Name(String surname, String name){
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
       String result = "";
       if(surname != null) result += surname + " ";
       if(name != null) result += name + " ";
       if(patronymic != null) result += patronymic;

       return result;
    }
}
