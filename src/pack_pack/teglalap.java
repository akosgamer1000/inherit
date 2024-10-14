package pack_pack;

public class teglalap extends sokszog{

     double b;

    public teglalap( double a, double b) {
        super(a);
        this.b=b;
    }





    public  double getB() {
        return b;
    }

    public void setB( double b) {
        this.b = b;
    }
    @Override
    public  double getkerulet(){
            return (this.getA()+b)*2;
    }
    @Override
    public  double getTerulet(){
        return this.getA()*b;
    }

    @Override
    public String toString() {
        return "teglalap{" +
                "b=" + b +
                "} " + this.getA()+  " " + getkerulet() + " " + getTerulet();
    }
}
