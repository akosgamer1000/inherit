package pack_pack;

import java.util.Random;

public class haromszog   extends  sokszog{

    double b;
    double c;

    public haromszog( double a, double b, double c) {
        super(a);
        this.b=b;
        this.c=c;
    }
     static Random s=new Random();


    public haromszog(){
      super(s.nextDouble(100));
      this.b=s.nextDouble(100);
      this.c=s.nextDouble(100);

    }

    public  double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public void setB( double b) {
        this.b = b;
    }

    public void setC( double c) {
        this.c = c;
    }
    @Override
    public  double getkerulet(){
        return (this.getA()+b+c);
    }
    @Override
    public  double getTerulet(){
        double s=this.getkerulet()/2;

        return  Math.sqrt(s*(s-this.getA())*(s-b)*(s-c));
    }

    @Override
    public String toString() {
        return "haromszog" +
                "b=" + b +
                ", c=" + c +
                "" + this.getA()+
                " kerület: " + getkerulet() + " terület " + getTerulet();
    }
}
