package pro.sky.java.course8;

public class ServiceStation {

    public void checkTyre(ServiceTyre transport) {
        transport.updateTyre();
    }
    public void checkEngine(ServiceEngine transport) {
        transport.checkEngine();
    }
    public void checkTrailer(ServiceTrailer transport) {
        transport.checkTrailer();
    }

    public void check(Car car){
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                checkTyre(car);
            }
            checkEngine(car);
    }

    public void check(Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            checkTyre(bicycle);
        }
    }
    public void check(Truck truck){
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            checkTyre(truck);
        }
        checkEngine(truck);
        checkTrailer(truck);
    }
}
