package pro.sky.java.course8;

public class Truck extends TransportVehicle implements ServiceTyre, ServiceEngine, ServiceTrailer{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Truck{}" + super.toString();
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
   public void checkTrailer() {
       System.out.println("Проверяем прицеп");
    }
}
