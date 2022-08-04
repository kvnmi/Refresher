package abstract_class;

public class Jets extends Aircraft{

    public Jets(int baseSpeed, AircraftTypes aircraftTypes) {
        super(baseSpeed, aircraftTypes);
    }

    @Override
    public void setFunctionality() {
        System.out.println("This aircraft type is to be used as templates to mass produce jets");
    }

    @Override
    public String toString() {
        return "Jets{" +
                "currentSpeed= " + currentSpeed + "km/h" +
                ", baseSpeed= " + baseSpeed +
                ", aircraftTypes= " + aircraftTypes.name() +
                '}';
    }
}
