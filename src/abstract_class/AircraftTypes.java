package abstract_class;

public enum AircraftTypes {
    AIRPLANES("Airplanes"),
    JETS("Jets"),
    HELICOPTERS("Helicopters"),
    BLIMP("Blimp"),
    FIGHTER("Fighter")
    ;

    private final String aircraftTypes;

    AircraftTypes(String aircraftTypes) {
        this.aircraftTypes = aircraftTypes;
    }

    public String getAircraftTypes() {
        return aircraftTypes;
    }
}
