
public class Triangle implements IFigure {

   private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public IFigure clone() {
        return new Triangle(this.side1, this.side2, this.side3);
    }

    @Override
    public void getInfo() {
        System.out.println("Трикутник зі сторонами: " + this.side1 + " " + this.side2 + " " + this.side3);
    }
}