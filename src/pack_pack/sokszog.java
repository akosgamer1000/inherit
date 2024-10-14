package pack_pack;

public abstract class sokszog {
    private  double a;

    public sokszog( double a) {
        this.a = a;
    }

    public  double getA() {
        return a;
    }

    public void setA( double a) {
        this.a = a;
    }
    abstract  double getkerulet();
    abstract  double getTerulet();
}
