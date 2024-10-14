package pack_pack;

public class jarmu {
    private String Rendszam;
    private String manufacture;
    private String model;
    private int yearofManufacture;
    private String color;
   private int numberofwheel;

    public jarmu(int numberofwheel, String color, String model, int yearofManufacture, String manufacture, String rendszam) {
        this.numberofwheel = numberofwheel;
        this.color = color;
        this.model = model;
        this.yearofManufacture = yearofManufacture;
        this.manufacture = manufacture;
        this.Rendszam = rendszam;
    }

    public String getRendszam() {
        return Rendszam;
    }

    public void setRendszam(String rendszam) {
        Rendszam = rendszam;
    }

    public int getNumberofwheel() {
        return numberofwheel;
    }

    public void setNumberofwheel(int numberofwheel) {
        this.numberofwheel = numberofwheel;
    }

    public int getYearofManufacture() {
        return yearofManufacture;
    }

    public void setYearofManufacture(int yearofManufacture) {
        this.yearofManufacture = yearofManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

}
