package info.company.Lec17;

import java.util.ArrayList;
import java.util.Collections;

public class Launch {

    public static void main(String[] args) {

        Games gtavicecity = new Games(0);

        System.out.println(gtavicecity.exp);

        System.out.println(gtavicecity.name);

        Games gta3 = new Games(gtavicecity);
//        gta3.name="GTA3";
//
//        System.out.println(gta3.name);
//        System.out.println(gtavicecity.name);

//        Games gta3= gtavicecity;

        System.out.println(gta3.name);
        gtavicecity.name="123";

        System.out.println(gta3.name);

        Games.launchevent();

    }
}
