package pack_pack;

public class bike extends jarmu {
    private  static final int number=2;
    public bike( String color, String model, int yearofManufacture, String manufacture, String rendszam) {
        super(number, color, model, yearofManufacture, manufacture, rendszam);
    }

    @Override
    public String toString() {
        return "bike- " + super.toString();
    }
}
