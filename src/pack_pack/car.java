package pack_pack;

public class car extends jarmu {
    private static  final int num=4;

    public car(String color, String model, int yearofManufacture, String manufacture, String rendszam) {
        super(num, color, model, yearofManufacture, manufacture, rendszam);
    }

    @Override
    public String toString() {
        return "car- "  + super.toString();
    }
}
