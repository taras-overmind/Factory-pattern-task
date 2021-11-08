

public class Main {

    public static void main(String[] args) {

        ICarFactory MFactory = new MersedesFactory();
        Car MCar = MFactory.createCar();
        MCar.getInfo();
        Engine MEng = MFactory.createEngine();
        MEng.getPower();

        ICarFactory TFactory = new ToyotaFactory();
        Car TCar = TFactory.createCar();
        TCar.getInfo();
        Engine TEng = TFactory.createEngine();
        TEng.getPower();

        ICarFactory FFactory = new FordFactory();
        Car FCar = FFactory.createCar();
        FCar.getInfo();
        Engine FEng = FFactory.createEngine();
        FEng.getPower();
    }
}