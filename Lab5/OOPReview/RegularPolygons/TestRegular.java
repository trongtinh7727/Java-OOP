import javax.sql.rowset.spi.SyncResolver;

public class TestRegular {
    public static void main(String[] args) {
        RegularPolygon tamgiac = new RegularPolygon("Tam giac", 3, 3.5);
        System.out.printf("Edge Amount: %d\nLength: %f\n",tamgiac.getEdgeAmount(),tamgiac.getEdgeLength());
        System.out.printf("Primeter: %f\n",tamgiac.getPerimeter());
        System.out.println(tamgiac.toString());
    }
}
