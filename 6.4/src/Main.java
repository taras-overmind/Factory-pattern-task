public class Main
{
    public static void main(String[] args) {
        {
            Decorations decs = new Decorations();
            ChristmasTree ct = new ChristmasTree();
            ct.SetComponent(decs);
            ct.Operation();
            ct.Operation();
        }
    }}