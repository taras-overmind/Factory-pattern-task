public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.Send("Hello!", this);
    }

    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }

}