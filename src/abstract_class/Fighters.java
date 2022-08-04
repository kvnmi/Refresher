package abstract_class;

public class Fighters extends Aircraft{

    public Fighters(int baseSpeed, AircraftTypes aircraftTypes) {
        super(baseSpeed, aircraftTypes);
    }

    @Override
    public void setFunctionality() {
        System.out.println("This aircraft type is to be used as templates to mass produce fighters");
    }

    @Override
    public String toString() {
        return "Fighters{" +
                "currentSpeed=" + currentSpeed + "km/h" +
                ", baseSpeed=" + baseSpeed +
                ", aircraftTypes=" + aircraftTypes.name() +
                '}';
    }
}
