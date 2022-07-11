package pro.sky.java.course8;

public class Bicycle extends TransportVehicle implements ServiceTyre{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Bicycle{}"
                + super.toString();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
        }


}
