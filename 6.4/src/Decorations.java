public class Decorations extends Component{

    private boolean decorations;

    public Decorations() {
        this.decorations = false;
    }

    @Override
    public void Operation() {
        decorations = !decorations;
        System.out.println("Decorations are on the three: " + decorations);
    }
}