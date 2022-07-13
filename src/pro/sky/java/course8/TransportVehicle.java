package pro.sky.java.course8;

import java.util.Objects;

public abstract class TransportVehicle {
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCoint) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCoint;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCoint) {
        this.wheelsCount = wheelsCoint;
    }

    @Override
    public String toString() {
        return "TransportVehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportVehicle)) return false;
        TransportVehicle that = (TransportVehicle) o;
        return wheelsCount == that.wheelsCount && modelName.equals(that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }


}
