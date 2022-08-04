package abstract_class;

public class Main {
    public static void main(String[] args) {
        var airplane = new Airplane(45, AircraftTypes.AIRPLANES);
        var helicopters = new Helicopters(45, AircraftTypes.HELICOPTERS);
        var jets = new Jets(45, AircraftTypes.JETS);
        var blimps = new Blimp(45, AircraftTypes.BLIMP);
        var fighter = new Fighters(45, AircraftTypes.FIGHTER);

        airplane.speedUp(50);
        helicopters.speedUp(40);
        jets.slowDown(5);
        blimps.speedUp(4);
        fighter.speedUp(200);

        System.out.println(airplane);
        System.out.println(helicopters);
        System.out.println(jets);
        System.out.println(blimps);
        System.out.println(fighter);

        airplane.setFunctionality();
        helicopters.setFunctionality();
        jets.setFunctionality();
        blimps.setFunctionality();
        fighter.setFunctionality();
    }
}
