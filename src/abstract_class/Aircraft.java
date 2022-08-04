package abstract_class;

abstract class Aircraft implements IAircraft {
    public final int momentum = 5;
    public int currentSpeed;
    public int baseSpeed;
    public AircraftTypes aircraftTypes;

    @Override
    public void speedUp(int speed) {
        this.currentSpeed += momentum;
    }
    @Override
    public void slowDown(int speed) {
       this.currentSpeed -= momentum;
    }

    public Aircraft(int baseSpeed, AircraftTypes aircraftTypes) {
        this.baseSpeed = baseSpeed;
        this.aircraftTypes = aircraftTypes;
    }

    public abstract void setFunctionality();
}
