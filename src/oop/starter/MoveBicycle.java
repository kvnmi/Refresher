package oop.starter;

public class MoveBicycle implements Bicycle {
    private int searHeight;
    private int currentSpeed;
    private int gear;

    MoveBicycle(int searHeight, int currentSpeed, int gear) {
        this.searHeight = searHeight;
        this.currentSpeed = currentSpeed;
        this.gear = gear;
    }

    @Override
    public int slowDown(int speed) {
        return speed -= 1;
    }

    @Override
    public int speedUp(int speed) {
        return speed += 1;
    }
}
