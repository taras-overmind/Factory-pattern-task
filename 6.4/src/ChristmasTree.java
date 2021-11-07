public class ChristmasTree extends Decorator{
    private boolean is_glowing;


    @Override
    public void Operation()
    {
        super.Operation();
        is_glowing = !is_glowing;
        System.out.println("Tree is glowing: " + is_glowing);
    }


}