public class Human {
    Name name;
    int height;

    Human father;

    public Human(Name name, int height, Human father){
        this.name = name;
        this.height = height;
        this.father = father;
    }

    @Override
    public String toString() {
        if(this.name.surname == null && this.father.name.surname != null){
            this.name.surname = this.father.name.surname;
        }
        if(this.father != null) {
            if (this.name.patronymic == null && this.father.name.name != null) {
                this.name.patronymic = this.father.name.name + "ович";
            }
        }
        return name + ", рост: " + height;
    }
}
