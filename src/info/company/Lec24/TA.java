package info.company.Lec24;

public class TA implements Teacher,Student{


    @Override
    public void bunk() {
        System.out.println("me nhi jaunga class me");
    }

    @Override
    public void playpubg() {
        System.out.println(" me to khleke arahunga");
    }


    @Override
    public void study() {
        System.out.println("me dono ki tarah padta hun");
    }



    @Override
    public void guide() {
        System.out.println("raasta dikhaunga");
    }
}
