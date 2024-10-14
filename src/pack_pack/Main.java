package pack_pack;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<jarmu> s=new ArrayList<>();
        s.add(new car("yellow","audi",1980,"gyar","1389"));
        s.add(new bike("yellow","audi",1980,"gyar","1389"));
        List<sokszog> k=new ArrayList<>();
        k.add(new haromszog(6,7,8));
        k.add(new teglalap(5,6));
        System.out.println( k.get(0).toString());
        System.out.println( k.get(1).toString());

        }
    }
