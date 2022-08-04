package abstract_class;

public class Airplane extends Aircraft{

    public Airplane(int baseSpeed, AircraftTypes aircraftTypes) {
        super(baseSpeed, aircraftTypes);
    }

    @Override
    public void setFunctionality() {
        System.out.println("This aircraft type is to be used as templates to mass produce airplanes");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "currentSpeed=" + currentSpeed + "km/h" +
                ", baseSpeed=" + baseSpeed +
                ", aircraftTypes= " + aircraftTypes.name() +
                '}';
    }
}
