public class Person {
    protected String name;
    protected int birth_year;

    public Person(){
        this.name = "";
        this.birth_year = 0;
    }

    public Person(String name, int birth_year){
        this.name = name;
        this.birth_year = birth_year;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public String getName() {
        return name;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Person[name: %s, birht_year: %d]", this.name,this.birth_year);
    }

}
