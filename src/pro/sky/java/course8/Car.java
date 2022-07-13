package pro.sky.java.course8;

public class Car extends TransportVehicle implements CheckServiceTransport, ServiceTyre, ServiceEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Car{}" + super.toString();
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
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

}
