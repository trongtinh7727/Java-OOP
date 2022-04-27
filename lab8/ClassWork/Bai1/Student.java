public class Student extends Person{
    private String id;
    private double score;

    public Student(){
        super();
        this.id = "";
        this.score = 0.0;
    }

    public Student(String name, int birth_year, String id, double score){
        super(name, birth_year);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Student[name: %s, birth: %d, id: %s, score: %f]", super.getName(),super.getBirth_year(), this.id,this.score);
    }
}
