public class ToyotaFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }
}