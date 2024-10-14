package pack_pack;

import java.util.Random;

abstract class sokszog {
    private  double a;
    public static Random s=new Random();

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
