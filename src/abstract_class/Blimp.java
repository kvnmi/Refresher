package abstract_class;

public class Blimp extends Aircraft{

    public Blimp(int baseSpeed, AircraftTypes aircraftTypes) {
        super(baseSpeed, aircraftTypes);
    }

    @Override
    public void setFunctionality() {
        System.out.println("This aircraft type is to be used as templates to mass produce blimps");
    }

    @Override
    public String toString() {
        return "Blimp{" +
                "currentSpeed=" + currentSpeed + "km/h" +
                ", baseSpeed=" + baseSpeed +
                ", aircraftTypes= " + aircraftTypes.name() +
                '}';
    }
}
