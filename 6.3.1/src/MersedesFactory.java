public class MersedesFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new Mersedes();
    }

    @Override
    public Engine createEngine() {
        return new MersedesEngine();
    }
}