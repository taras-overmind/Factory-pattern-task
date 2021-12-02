class Facade
{
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade()
    {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void firstMode()
    {
        System.out.println("\nfirst mode");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }
    public void secondMode()
{
    System.out.println("\nsecond mode");
    two.MethodTwo();
    three.MethodThree();
}
}

