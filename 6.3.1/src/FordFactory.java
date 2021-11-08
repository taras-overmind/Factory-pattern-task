public class FordFactory  implements ICarFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Engine createEngine() {
        return new FordEngine();
    }
}