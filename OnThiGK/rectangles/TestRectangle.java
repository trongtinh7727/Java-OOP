class TestRectangle {
    public static void main(String[] args){
        Rectangle rec = new Rectangle("Ruby", "Red", 6, 8);       
        System.out.println(rec.getType());
        System.out.println(rec.toString());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.isSquare());
        System.out.println(rec.calDiagonalLine());
        System.out.println(rec.resize(0.5));
    }
}
