public class MathStudent extends Student {
    private String sID;

    public MathStudent(){
        super();
        this.sID = "";
    }

    public MathStudent(String sName, double gpa, String sID){
        super(sName, gpa);
        this.sID = sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsID() {
        return sID;
    }

    @Override
    public String getRank() {
        if (this.gpa >= 5) {
            return "Passed";
        }

        return "Failed";
    }

    @Override
    public String toString() {
        return String.format("MathStudent[name: %s, gpa: %f, sID: %s]", this.sName, this.gpa,this.sID);
    }
}
