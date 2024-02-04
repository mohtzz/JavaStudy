public class Human {
    String nameString;
    Name name;
    int height;

    Human father;

    public Human(Name name, int height, Human father){
        this.name = name;
        this.height = height;
        this.father = father;

        if(this.father.name != null) {
            if (this.name.surname == null && this.father.name.surname != null) {
                this.name.surname = this.father.name.surname;
            }
            if (this.name.patronymic == null && this.father.name.name != null) {
                this.name.patronymic = this.father.name.name + "ович";
            }
        }
        else if(this.father.nameString != null){
            if(this.name.patronymic == null) this.name.patronymic = this.father.nameString + "ович";
        }
    }
    //имя в виде строки и рост
    public Human(String nameString, int height){
        this.nameString = nameString;
        this.height = height;
    }
    //имя в виде строки, рост и отец
    public Human(String nameString, int height, Human father){
        this.nameString = nameString;
        this.height = height;
        this.father = father;

        String finalName = "";
        if(this.father.name != null){
            finalName += this.father.name.surname + " ";
            finalName += this.nameString + " ";
            finalName += this.father.name.name + "ович";
        }
        else{
            finalName += this.nameString + " ";
            finalName += this.father.nameString + "ович";
        }
        this.nameString = finalName;
    }
    public Human(Name name, int height){
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        if(name != null) {
            return name + ", рост: " + height;
        }
        else return nameString + ", рост: " + height;
    }
}
