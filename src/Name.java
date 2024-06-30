public class Name {
     protected String surname;
     protected String name;
     protected String patronymic;

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

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
       if((surname == null || surname.isEmpty()) &&
               (name == null || name.isEmpty()) && (patronymic == null || patronymic.isEmpty()))
           throw new IllegalArgumentException("must be at least 1 not null and not empty");
       String result = "";
       if(surname != null) result += surname + " ";
       if(name != null) result += name + " ";
       if(patronymic != null) result += patronymic;

       return result;
    }
}
