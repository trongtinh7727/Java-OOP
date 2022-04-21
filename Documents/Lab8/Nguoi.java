public abstract class Nguoi {
    protected String name;

    // Contructor
    public Nguoi() {
        this.name = "";
    }

    public Nguoi(String name) {
        this.name = name;
    }

    // abstract method
    abstract void show();

    // non-abstract method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void joke() {
        System.out.println("La nguoi nhan ban");
    }
}
