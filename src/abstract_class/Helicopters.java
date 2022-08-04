package abstract_class;

public class Helicopters extends Aircraft{
    public Helicopters(int baseSpeed, AircraftTypes aircraftTypes) {
        super(baseSpeed, aircraftTypes);
    }

    @Override
    public void setFunctionality() {
        System.out.println("This aircraft type is to be used as templates to mass produce Helicopters");
    }

    @Override
    public String toString() {
        return "Helicopters{" +
                "currentSpeed=" + currentSpeed + "km/h" +
                ", baseSpeed=" + baseSpeed +
                ", aircraftTypes=" + aircraftTypes.name() +
                '}';
    }
}
