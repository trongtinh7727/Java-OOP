public class RegularPolygon {
    private String name;
    private int egdeAmount;
    private double egdeLength;

    public RegularPolygon() {
        this.name = "";
        this.egdeAmount = 3;
        this.egdeLength = 1;
    }

    public RegularPolygon(String name, int egdeAmount, double egdeLength) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = egdeLength;
    }

    public RegularPolygon(String name, int egdeAmount) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getEdgeAmount() {
        return this.egdeAmount;
    }

    public double getEdgeLength() {
        return this.egdeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int egdeAmount) {
        this.egdeAmount = egdeAmount;
    }

    public void setEdgeLength(double egdeLength) {
        this.egdeLength = egdeLength;
    }

    public String getPolygon() {
        switch (this.egdeAmount) {
            case 3:
                return "Triangle";
            case 4:
                return "Quadrangle";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            default:
                if (this.egdeAmount > 6) {
                    return "Polygon has the number of edges greater than 6";
                }
                break;
        }
        return "";
    }

    public double getPerimeter() {
        return this.egdeAmount * this.egdeLength;
    }

    public double getArea() {
        double a;
        switch (this.egdeAmount) {
            case 3:
                a = 0.433;
                return this.egdeLength * this.egdeLength * a;
            case 4:
                a = 1;
                return this.egdeLength * this.egdeLength * a;
            case 5:
                a = 1.72;
                return this.egdeLength * this.egdeLength * a;
            case 6:
                a = 2.595;
                return this.egdeLength * this.egdeLength * a;
            default:
                if (this.egdeAmount > 6) {
                    return -1;
                }
                break;
        }
        return -1;
    }

    public String toString(){
        return this.name+" - "+this.getPolygon()+" - "+this.getArea();
    }
}
