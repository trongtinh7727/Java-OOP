public class ITStudent extends Student{
    private int sID;

    public ITStudent(){
        super();
        this.sID = 0;
    }

    public ITStudent(String sName, double gpa, int sID){
        super(sName, gpa);
        this.sID = sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getsID() {
        return sID;
    }

    @Override
    public String getRank() {
        if (gpa <= 5.0) {
            return "C";
        }
        if (gpa<= 8) {
            return "B";
        }

        return "A";
    }

    @Override
    public String toString() {
        return String.format("ITStudent[name: %s, gpa: %f, sID: %d]", this.sName, this.gpa,this.sID);
    }

}