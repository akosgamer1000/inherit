package pack_pack;

public class Paraleog extends sokszog {

    private  double b;
    private double alfpa;

    public Paraleog(double a, double b, double alfpa) {
        super(a);
        this.b=b;
        this.alfpa=alfpa;
    }
    public Paraleog(){
        super(s.nextDouble(100));
        this.b=s.nextDouble(100);
        this.alfpa=s.nextDouble(100);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getAlfpa() {
        return this.alfpa;
    }

    public void setAlfpa(double alfpa) {
        this.alfpa = alfpa;
    }

    @Override
    double getkerulet() {
        return 0;
    }

    @Override
    double getTerulet() {
        return 0;
    }


}
