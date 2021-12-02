class ElectricityConsumer
{
    public static void ChargeNotebook(INewElectricitySystem electricitySystem)
    {
        System.out.println(electricitySystem.MatchWideSocket());
    }
}
public class Main
{
    public static void main(String[] args) {
        var newElectricitySystem = new NewElectricitySystem();
        ElectricityConsumer.ChargeNotebook(newElectricitySystem);
        var oldElectricitySystem = new OldElectricitySystem();
        var adapter = new Adapter(oldElectricitySystem);
        ElectricityConsumer.ChargeNotebook(adapter);
    }
}

