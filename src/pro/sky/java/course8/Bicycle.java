package pro.sky.java.course8;

public class Bicycle extends TransportVehicle implements CheckServiceTransport, ServiceTyre{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Bicycle{}"
                + super.toString();
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
        }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
